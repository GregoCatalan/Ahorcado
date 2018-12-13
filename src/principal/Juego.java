package principal;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

//Es el JFrame principal en donde se ejecutra el juego mismo.
public class Juego extends javax.swing.JFrame {
    //Atributos bastante específicos. Destacan los List de JLabel y JToggleButton que van a usarse para manipularlos con métodos fácilmente.
    String palabra, palabraCheck;
    int largo, contador, error;
    private List <JLabel> label = new ArrayList<>();
    private List <JToggleButton> btn = new ArrayList<>();
    
    public Juego() {        
        initComponents();
        
        //Los lbl de espacios se ocultan del 6 al 12 - Se muestran a partir del bucle switch que viene de Nivel.
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
        lbl11.setVisible(false);
        lbl12.setVisible(false);
        //Lo mismo pasa con los lbl de Error, que van a mostrarse a partir de un bucle del metodoLetra.
        lblError1.setVisible(false);
        lblError2.setVisible(false);
        lblError3.setVisible(false);
        lblError4.setVisible(false);
        lblError5.setVisible(false);
        lblError6.setVisible(false);
        //Se ponen los lbl de espacio en un ArrayList para manipularlos más adelante.
        label.add(lbl1);
        label.add(lbl2);
        label.add(lbl3);
        label.add(lbl4);
        label.add(lbl5);
        label.add(lbl6);
        label.add(lbl7);
        label.add(lbl8);
        label.add(lbl9);
        label.add(lbl10);
        label.add(lbl11);
        label.add(lbl12);
        //Se ponen los botones en un ArrrayList para poder deshabilitarlos después con un solo método.
        btn.add(btnA);
        btn.add(btnB);
        btn.add(btnC);
        btn.add(btnD);
        btn.add(btnE);
        btn.add(btnF);
        btn.add(btnG);
        btn.add(btnH);
        btn.add(btnI);
        btn.add(btnJ);
        btn.add(btnK);
        btn.add(btnL);
        btn.add(btnM);
        btn.add(btnN);
        btn.add(btnÑ);
        btn.add(btnO);
        btn.add(btnP);
        btn.add(btnQ);
        btn.add(btnR);
        btn.add(btnS);
        btn.add(btnT);
        btn.add(btnU);
        btn.add(btnV);
        btn.add(btnW);
        btn.add(btnX);
        btn.add(btnY);
        btn.add(btnZ);       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnA = new javax.swing.JToggleButton();
        btnB = new javax.swing.JToggleButton();
        btnC = new javax.swing.JToggleButton();
        btnD = new javax.swing.JToggleButton();
        btnE = new javax.swing.JToggleButton();
        btnF = new javax.swing.JToggleButton();
        btnG = new javax.swing.JToggleButton();
        btnH = new javax.swing.JToggleButton();
        btnI = new javax.swing.JToggleButton();
        btnJ = new javax.swing.JToggleButton();
        btnK = new javax.swing.JToggleButton();
        btnL = new javax.swing.JToggleButton();
        btnM = new javax.swing.JToggleButton();
        btnN = new javax.swing.JToggleButton();
        btnÑ = new javax.swing.JToggleButton();
        btnO = new javax.swing.JToggleButton();
        btnP = new javax.swing.JToggleButton();
        btnQ = new javax.swing.JToggleButton();
        btnY = new javax.swing.JToggleButton();
        btnZ = new javax.swing.JToggleButton();
        btnR = new javax.swing.JToggleButton();
        btnS = new javax.swing.JToggleButton();
        btnT = new javax.swing.JToggleButton();
        btnU = new javax.swing.JToggleButton();
        btnV = new javax.swing.JToggleButton();
        btnW = new javax.swing.JToggleButton();
        btnX = new javax.swing.JToggleButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblError1 = new javax.swing.JLabel();
        lblError2 = new javax.swing.JLabel();
        lblError3 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lblError4 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblError5 = new javax.swing.JLabel();
        lblError6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado");
        setIconImage(getIconImage());

        btnA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnG.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnJ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        btnK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });

        btnL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnM.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnÑ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnÑ.setText("Ñ");
        btnÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÑActionPerformed(evt);
            }
        });

        btnO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        btnP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnQ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btnY.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });

        btnZ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });

        btnR.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnS.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnW.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnX.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        lbl1.setBackground(new java.awt.Color(153, 255, 255));
        lbl1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl1.setText("__");

        lbl2.setBackground(new java.awt.Color(153, 255, 255));
        lbl2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl2.setText("__");

        lbl3.setBackground(new java.awt.Color(153, 255, 255));
        lbl3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl3.setText("__");

        lbl4.setBackground(new java.awt.Color(153, 255, 255));
        lbl4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl4.setText("__");

        lbl5.setBackground(new java.awt.Color(153, 255, 255));
        lbl5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl5.setText("__");

        lbl6.setBackground(new java.awt.Color(153, 255, 255));
        lbl6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl6.setText("__");

        lblError1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cabeza.png"))); // NOI18N

        lblError2.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        lblError2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuerpo.png"))); // NOI18N

        lblError3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblError3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda.png"))); // NOI18N

        lbl7.setBackground(new java.awt.Color(153, 255, 255));
        lbl7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl7.setText("__");

        lbl8.setBackground(new java.awt.Color(153, 255, 255));
        lbl8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl8.setText("__");

        lbl9.setBackground(new java.awt.Color(153, 255, 255));
        lbl9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl9.setText("__");

        lbl10.setBackground(new java.awt.Color(153, 255, 255));
        lbl10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl10.setText("__");

        lbl11.setBackground(new java.awt.Color(153, 255, 255));
        lbl11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl11.setText("__");

        lbl12.setBackground(new java.awt.Color(153, 255, 255));
        lbl12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl12.setText("__");

        lblError4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblError4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png"))); // NOI18N

        lblNivel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNivel.setText("NIVEL DIFÍCIL");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patibulo.png"))); // NOI18N

        lblError5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblError5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda.png"))); // NOI18N

        lblError6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblError6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(lblError1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(lblError2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(lblError6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(lblError4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(lblError3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(lblError5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(413, 413, 413)
                        .addComponent(lblNivel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblError1)
                                .addGap(0, 0, 0)
                                .addComponent(lblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblError6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lblError4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lblError3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(lblError5))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNivel))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA)
                    .addComponent(btnB)
                    .addComponent(btnC)
                    .addComponent(btnD)
                    .addComponent(btnE)
                    .addComponent(btnF)
                    .addComponent(btnG)
                    .addComponent(btnH)
                    .addComponent(btnI))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJ)
                    .addComponent(btnK)
                    .addComponent(btnL)
                    .addComponent(btnM)
                    .addComponent(btnN)
                    .addComponent(btnÑ)
                    .addComponent(btnO)
                    .addComponent(btnP)
                    .addComponent(btnQ))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnR)
                    .addComponent(btnS)
                    .addComponent(btnT)
                    .addComponent(btnU)
                    .addComponent(btnV)
                    .addComponent(btnW)
                    .addComponent(btnX)
                    .addComponent(btnY)
                    .addComponent(btnZ))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Aplica el metodoLetra a cada btn de letra, donde se marcan un char y un String idénticos, además de un número de button dentro del List (por eso empieza en 0).
    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        metodoLetra('A', "A", 0);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        metodoLetra('B', "B", 1);
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        metodoLetra('C', "C", 2);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        metodoLetra('D', "D", 3);
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        metodoLetra('E', "E", 4);
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        metodoLetra('F', "F", 5);
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        metodoLetra('G', "G", 6);
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        metodoLetra('H', "H", 7);
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        metodoLetra('I', "I", 8);
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        metodoLetra('J', "J", 9);
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        metodoLetra('K', "K", 10);
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        metodoLetra('L', "L", 11);
    }//GEN-LAST:event_btnLActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        metodoLetra('M', "M", 12);
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        metodoLetra('N', "N", 13);
    }//GEN-LAST:event_btnNActionPerformed

    private void btnÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÑActionPerformed
        metodoLetra('Ñ', "Ñ", 14);
    }//GEN-LAST:event_btnÑActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        metodoLetra('O', "O", 15);
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        metodoLetra('P', "P", 16);
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        metodoLetra('Q', "Q", 17);
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        metodoLetra('R', "R", 18);
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        metodoLetra('S', "S", 19);
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        metodoLetra('T', "T", 20);
    }//GEN-LAST:event_btnTActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        metodoLetra('U', "U", 21);
    }//GEN-LAST:event_btnUActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        metodoLetra('V', "V", 22);
    }//GEN-LAST:event_btnVActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        metodoLetra('W', "W", 23);
    }//GEN-LAST:event_btnWActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        metodoLetra('X', "X", 24);
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        metodoLetra('Y', "Y", 25);
    }//GEN-LAST:event_btnYActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        metodoLetra('Z', "Z", 26);

    }//GEN-LAST:event_btnZActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Juego().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnA;
    private javax.swing.JToggleButton btnB;
    private javax.swing.JToggleButton btnC;
    private javax.swing.JToggleButton btnD;
    private javax.swing.JToggleButton btnE;
    private javax.swing.JToggleButton btnF;
    private javax.swing.JToggleButton btnG;
    private javax.swing.JToggleButton btnH;
    private javax.swing.JToggleButton btnI;
    private javax.swing.JToggleButton btnJ;
    private javax.swing.JToggleButton btnK;
    private javax.swing.JToggleButton btnL;
    private javax.swing.JToggleButton btnM;
    private javax.swing.JToggleButton btnN;
    private javax.swing.JToggleButton btnO;
    private javax.swing.JToggleButton btnP;
    private javax.swing.JToggleButton btnQ;
    private javax.swing.JToggleButton btnR;
    private javax.swing.JToggleButton btnS;
    private javax.swing.JToggleButton btnT;
    private javax.swing.JToggleButton btnU;
    private javax.swing.JToggleButton btnV;
    private javax.swing.JToggleButton btnW;
    private javax.swing.JToggleButton btnX;
    private javax.swing.JToggleButton btnY;
    private javax.swing.JToggleButton btnZ;
    private javax.swing.JToggleButton btnÑ;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lbl10;
    public javax.swing.JLabel lbl11;
    public javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    public javax.swing.JLabel lbl5;
    public javax.swing.JLabel lbl6;
    public javax.swing.JLabel lbl7;
    public javax.swing.JLabel lbl8;
    public javax.swing.JLabel lbl9;
    public javax.swing.JLabel lblError1;
    public javax.swing.JLabel lblError2;
    public javax.swing.JLabel lblError3;
    public javax.swing.JLabel lblError4;
    public javax.swing.JLabel lblError5;
    public javax.swing.JLabel lblError6;
    public javax.swing.JLabel lblNivel;
    // End of variables declaration//GEN-END:variables

    //Se ejecuta cada vez que se presiona un btn letra.
    private void metodoLetra(char letra, String letra1, int button){
        //Se abre un contador en 0 que va a ser útil en el if más adelante.
        contador=0;
        
        //Se recorre todo el String palabra y se evalúa caracter por caracter (para eso sirve el char) si alguno coincide con los de la palabra.
        //En caso afirmativo contador suma 1 y se ocupa el espacio correspondiente con la letra.
        for (int i=0; i<largo; i++){
            if(letra==palabra.charAt(i)){
                label.get(i).setText(letra1);
                contador++;
            }            
        }
        
        //Si el contador no sumó resultados positivos, se suman errores.
        if(contador==0){
            error++;
        }
        
        //Cada error suma 1 y muestra un nuevo lblError - Al llegar a 6 ejecuta el cartel Resultado, le establece en el label ¡Perdiste! y oculta Juego.
        switch(error){
            case 1: lblError1.setVisible(true);
            break;
            
            case 2: lblError2.setVisible(true);
            break;
            
            case 3: lblError3.setVisible(true);
            break;
            
            case 4: lblError4.setVisible(true);
            break;
            
            case 5: lblError5.setVisible(true);
            break;
            
            case 6: lblError6.setVisible(true);
                Resultado R = new Resultado();
                R.setVisible(true);
                R.setLocationRelativeTo(null);//Para centrar la ventana
                R.setResizable(false);//Evita que se maximice la ventana
                R.lblResultado.setText("¡Perdiste!");
                R.lblPalabra.setText("La palabra era "+palabra);
                this.dispose(); 
            break;           
            default: System.out.println("Sin errores hasta ahora");
        }    
        //A partir del largo evalúa lbl por lbl si la palabra que se forma coincide con el String palabra
        switch(largo){
            case 5: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText();
                break;
            case 6: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText();
                break;
            case 7: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText() + lbl7.getText();
                break;
            case 8: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText() + lbl7.getText() + lbl8.getText();
                break;
            case 9: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText() + lbl7.getText() + lbl8.getText() + lbl9.getText();
                break;
            case 10: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText() + lbl7.getText() + lbl8.getText() + lbl9.getText() + lbl10.getText();
                break;
            case 11: 
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText() + lbl7.getText() + lbl8.getText() + lbl9.getText() + lbl10.getText()+ lbl11.getText();
                break;
            case 12:
                palabraCheck = lbl1.getText() + lbl2.getText() + lbl3.getText() + lbl4.getText() + lbl5.getText() + lbl6.getText() + lbl7.getText() + lbl8.getText() + lbl9.getText() + lbl10.getText()+ lbl11.getText()+ lbl12.getText();
                break;
            default: System.out.println("Palabra muy larga o muy corta");
        }
        
        //Si coincide ejecuta el cartel Resultado, le establece en el label ¡Ganaste! y oculta Juego
        if(palabraCheck.equals(palabra)){          
            Resultado R = new Resultado();
            R.setVisible(true);
            R.setLocationRelativeTo(null);//Para centrar la ventana
            R.setResizable(false);//Evita que se maximice la ventana
            R.lblResultado.setText("¡Ganaste!");
            R.lblPalabra.setText("La palabra era "+palabra);
            this.dispose(); 
        }
        
        //Selecciona el botón correspondiente y lo deshabilita
        btn.get(button).setEnabled(false);
    }
    
    //Este Override permite meter imagenes/ahorcado.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ahorcado.png"));
        return retValue;
    }
}