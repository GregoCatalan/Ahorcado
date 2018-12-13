package principal;

public class Ahorcado {

    public static void main(String[] args) {
        //Instanciar pantalla Nivel, mostrarla, centrarla e impedir que se maximice
        Principal P = new Principal();
        P.setVisible(true);
        P.setLocationRelativeTo(null);
        P.setResizable(false);
    }  
}
