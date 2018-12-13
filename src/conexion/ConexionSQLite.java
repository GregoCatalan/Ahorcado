package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Es una class para manejar todos los métodos involucrados con la base SQLite
public class ConexionSQLite {
    //Se establecen los objetos Connection, ResultSet, PreparedStatement y ResultSetMetaData dek paquete java.sql
    //Se establece el objeto DefaultTableModel del paquete javax.swing.table
    //Se establecen int id y largo que van a instanciarse y establecerse en los métodos.
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
    private DefaultTableModel dtm;
    private int id, largo;
    
    //Conexión
    public Connection getConexion()throws Exception{
        String url="src\\base\\palabras.s3db";
	Class.forName("org.sqlite.JDBC");
	cn=DriverManager.getConnection("jdbc:sqlite:"+url);
        return cn;
    }
    
    //Llenar ArrayList, ver en Nivel que se usa para generar una lista de la cual sacar una palabra random.
    //Primero hace la conexión y hace correr la búsqueda (el sql)
    //Después usa un bucle while que, mientras haya filas, recorre y rescata los objetos de la columna 1 y los agrega al ArrayList
    //Al final cierra todo
    public void llenarArrayList(List lista,String busqueda)throws Exception{
        ps=getConexion().prepareStatement(busqueda);
        rs=ps.executeQuery();
        
        while (rs.next()) {            
            lista.add(rs.getString(1));
        }
        
        ps.close();
        rs.close();
        cn.close();
    }
    
    //Es un método muy similar al anterior. Ver en Edicion que se usa para traer las palabras de cada nivel.
    //También determina el DefaultTableModel para que funcione de una determinada manera.
    public void llenarTabla(JTable tabla,String busqueda)throws Exception{      
        ps=getConexion().prepareStatement("select palabra_"+busqueda+" from "+busqueda);
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);
                
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
        rs.close();
        ps.close();
        cn.close();
    }
    
    //Ejecuta el query para agregar palabra según longitud al nivel. Eso se maneja en Edicion.
    public void agregarPalabraSQL(String palabra, String dif) throws Exception{
        ps=getConexion().prepareStatement("insert into "+dif+" (palabra_"+dif+") values ('"+palabra+"')");
        ps.execute();
        ps.close();
        cn.close();       
    }
    
    //Ídem al anterior para eliminar, funciona en EditarPalabra
    public void eliminarPalabraSQL(String palabra, String dif) throws Exception{
        ps=getConexion().prepareStatement("delete from "+dif+" where palabra_"+dif+" = '"+palabra+"'");
        ps.execute();
        ps.close();
        cn.close();       
    }
    
    //Trae el id de la tabla para poder ver dónde se hace la modificación en EditarPalabra.
    //Primero se instancia id y después se compara busca el id en el que la palabra es la enviada. Luego se ejecuta el query, se cierra y retorna el id.
    public int traerId(String palabra, String dif) throws Exception{
        id=0;
        
        ps=getConexion().prepareStatement("select id_"+dif+" from "+dif+" where palabra_"+dif+"='"+palabra+"'");
        rs=ps.executeQuery();
        
        if (rs.next()) { 
            id = rs.getInt("id_"+dif);
        }
        
        rs.close();
        ps.close();
        cn.close();
        return id;
    }
    
    //Sirve para editar correctamente la palabra en EditarPalabra
    //Primero revisa si la palabraNueva sólo está compuesta por letras y si el largo es mayor a 4 y menor a 13.
    //Luego entra en un bucle donde ambas condiciones se comprueban siempre que sea necesario y se reestablecen los valores de palabraNueva y largo
    //En el medio se lleva los caracteres a mayúsculas
    //Si todo está bien, se corre el switchEditar que está debajo. Esto incluye si la palabra estaba bien desde el principio.
    //Por supuesto, no se puede comprobar si la cadena introducida es realmente una palabra.
    public void editarPalabraSQL(String palabraNueva, String dif, int id) throws Exception{
        largo = palabraNueva.length();

        if(palabraNueva.matches("[a-zA-Z]*")==false){
            while(palabraNueva.matches("[a-zA-Z]*")==false || largo<=4||largo>=13){
                while(palabraNueva.matches("[a-zA-Z]*")==false){                
                    palabraNueva = (JOptionPane.showInputDialog(null, "La palabra sólo debe contener letras", "Error", JOptionPane.ERROR_MESSAGE)).toUpperCase();
                    largo=palabraNueva.length(); 
                }
                while(largo<=4||largo>=13){
                    palabraNueva = (JOptionPane.showInputDialog(null, "La palabra sólo puede tener entre 5 y 12 letras", "Error", JOptionPane.ERROR_MESSAGE)).toUpperCase();
                    largo=palabraNueva.length();                
                } 
            }
            switchEditar (palabraNueva, dif, id, largo);
        }else if(largo<=4||largo>=13){
            while(palabraNueva.matches("[a-zA-Z]*")==false || largo<=4||largo>=13){
                while(largo<=4||largo>=13){
                    palabraNueva = (JOptionPane.showInputDialog(null, "La palabra sólo puede tener entre 5 y 12 letras", "Error", JOptionPane.ERROR_MESSAGE)).toUpperCase();
                    largo=palabraNueva.length();  
                }
                while(palabraNueva.matches("[a-zA-Z]*")==false){
                    palabraNueva = (JOptionPane.showInputDialog(null, "La palabra sólo debe contener letras", "Error", JOptionPane.ERROR_MESSAGE)).toUpperCase();
                    largo=palabraNueva.length(); 
                }
            }
            switchEditar (palabraNueva, dif, id, largo);
        }else{
            switchEditar (palabraNueva, dif, id, largo);
        }
    }
    
    //Funciona a partir de editarPalabraSQL.
    //Si todo está en orden, se ejecuta. Revisa primero si la palabra se mantiene en la misma dificultad, en cuyo caso la reemplaza.
    //Si cambia la dificultad (cambió el largo), la envía a través de un switch a la dificultad correspondiente. Luego, borra la original a partir de su id.
    //Al final del switch cierra la conexión.
    private void switchEditar (String palabraNueva, String dif, int id, int largo) throws Exception{
        boolean facil = dif.equals("facil") && (largo==5 || largo==6);
        boolean normal = dif.equals("normal") && (largo==7 || largo==8 || largo==9);
        boolean dificil = dif.equals("dificil") && (largo==10 || largo==11 || largo==12);
        
        if(facil || normal || dificil){
            ps=getConexion().prepareStatement("update "+dif+" set palabra_"+dif+"='"+palabraNueva+"' where id_"+dif+" = "+id);
            ps.execute();
            ps.close();
            cn.close(); 
        }else if (largo>=5 && largo<=12){
            switch(largo){
                case 5:
                case 6:
                    ps=getConexion().prepareStatement("insert into facil (palabra_facil) values ('"+palabraNueva+"')");
                    ps.execute();
                    ps.close();
                    ps=getConexion().prepareStatement("delete from "+dif+" where id_"+dif+" = '"+id+"'");
                    ps.execute();
                    ps.close();                
                    break;
                case 7:
                case 8:
                case 9:
                    ps=getConexion().prepareStatement("insert into normal (palabra_normal) values ('"+palabraNueva+"')");
                    ps.execute();
                    ps.close();
                    ps=getConexion().prepareStatement("delete from "+dif+" where id_"+dif+" = '"+id+"'");
                    ps.execute();
                    ps.close();  
                    break;
                case 10:
                case 11:
                case 12:
                    ps=getConexion().prepareStatement("insert into dificil (palabra_dificil) values ('"+palabraNueva+"')");
                    ps.execute();
                    ps.close();
                    ps=getConexion().prepareStatement("delete from "+dif+" where id_"+dif+" = '"+id+"'");
                    ps.execute();
                    ps.close(); 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la palabra, intente nuevamente", "Error", JOptionPane.WARNING_MESSAGE);
            }
            cn.close();
        }
    }
}