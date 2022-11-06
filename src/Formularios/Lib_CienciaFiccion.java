
package Formularios;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Lib_CienciaFiccion extends javax.swing.JFrame {

    public Lib_CienciaFiccion() {
        initComponents();
        setLocationRelativeTo(null);
        Bloquear();
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagenes/un mundo feliz.jpg"));
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/la maquina del tiempo.jpg"));
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/cronicas marcianas.jpg"));
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagenes/yo, robot.jpg"));
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagenes/soy leyenda.jpg"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(mundoIma.getWidth(), mundoIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(maquinaIma.getWidth(), maquinaIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(cronicasIma.getWidth(), cronicasIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(robotIma.getWidth(), robotIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(leyendaIma.getWidth(), leyendaIma.getHeight(), Image.SCALE_DEFAULT));
        mundoIma.setIcon(fondo1);
        maquinaIma.setIcon(fondo2);
        cronicasIma.setIcon(fondo3);
        robotIma.setIcon(fondo4);
        leyendaIma.setIcon(fondo5);
        
    }
    
    void Bloquear(){
        ResuMundo.setEditable(false);
        ResuMaquina.setEditable(false);
        ResuCronicas.setEditable(false);
        ResuRobot.setEditable(false);
        ResuLeyenda.setEditable(false);
    }    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mundoIma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResuMundo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jb_Comprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        maquinaIma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResuMaquina = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jb_Comprar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cronicasIma = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ResuCronicas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jb_Comprar3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        robotIma = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ResuRobot = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jb_Comprar4 = new javax.swing.JButton();
        leyendaIma = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ResuLeyenda = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jb_Comprar5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mundoIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/un mundo feliz.jpg"))); // NOI18N

        ResuMundo.setColumns(20);
        ResuMundo.setRows(5);
        ResuMundo.setText("Es la novela más famosa del escritor británico Aldous Huxley, \npublicada por primera vez en 1932. La novela es una distopía\nque anticipa el desarrollo en tecnología reproductiva, cultivos \nhumanos e hipnopedia, manejo de las emociones por medio \nde drogas  que, combinadas, cambian radicalmente la \nsociedad.");
        jScrollPane1.setViewportView(ResuMundo);

        jLabel1.setText("Un Mundo Feliz");

        jb_Comprar.setText("Comprar");
        jb_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ComprarActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio");

        maquinaIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/la maquina del tiempo.jpg"))); // NOI18N

        ResuMaquina.setColumns(20);
        ResuMaquina.setRows(5);
        ResuMaquina.setText("\nEs una novela de ciencia ficción del escritor británico Herbert \nGeorge Wells, publicada por primera vez en Londres en el año \n1895 por William Heinemann. Consta de dieciséis capítulos y \nun epílogo.");
        jScrollPane2.setViewportView(ResuMaquina);

        jLabel3.setText("La Maquina Del Tiempo");

        jb_Comprar2.setText("Comprar");
        jb_Comprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Comprar2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio");

        cronicasIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cronicas marcianas.jpg"))); // NOI18N

        ResuCronicas.setColumns(20);
        ResuCronicas.setRows(5);
        ResuCronicas.setText("es una serie de relatos del escritor Ray Bradbury. Los relatos \ncarecen de una línea argumental lineal fija, pero la referencia \ncontextual y temporal es la misma en todos ellos: narra la \nllegada a Marte y la colonización del planeta por parte de los \nhumanos.");
        jScrollPane3.setViewportView(ResuCronicas);

        jLabel5.setText("Cronicas Marcianas");

        jb_Comprar3.setText("Comprar");
        jb_Comprar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Comprar3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio");

        jLabel7.setText("Precio");

        robotIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yo, robot.jpg"))); // NOI18N

        ResuRobot.setColumns(20);
        ResuRobot.setRows(5);
        ResuRobot.setText("\nEs una colección de relatos basados en las tres leyes de la \nrobótica que son un compendio fijo e imprescindible de moral \naplicable a supuestos robots inteligentes, con las que \nsupuestamente nunca debería haber un conflicto si se \ncumplieran fielmente.");
        jScrollPane4.setViewportView(ResuRobot);

        jLabel8.setText("Yo, Robot");

        jb_Comprar4.setText("Comprar");
        jb_Comprar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Comprar4ActionPerformed(evt);
            }
        });

        leyendaIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/soy leyenda.jpg"))); // NOI18N

        ResuLeyenda.setColumns(20);
        ResuLeyenda.setRows(5);
        ResuLeyenda.setText("\nEe desarrolla en una versión postapocalíptica de la ciudad de \nLos Ángeles, comprendida entre el año de 1976 y 1979. El \nprotagonista, Robert Neville, ha sobrevivido a una pandemia \nprovocada por una guerra bacteriológica que ha arrasado con \ntodas las personas que había en la Tierra;");
        jScrollPane5.setViewportView(ResuLeyenda);

        jLabel9.setText("Soy Leyenda");

        jb_Comprar5.setText("Comprar");
        jb_Comprar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Comprar5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Precio");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("PROXIMAMENTE MAS LIBROS");

        MenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuPrincipal.setText("Menu Principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mundoIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_Comprar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cronicasIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_Comprar3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leyendaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_Comprar5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel10)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maquinaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb_Comprar2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel4))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(robotIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb_Comprar4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel7))))))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MenuPrincipal)
                        .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb_Comprar2)
                                    .addGap(42, 42, 42))))
                        .addComponent(maquinaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb_Comprar)
                                    .addGap(41, 41, 41))))
                        .addComponent(mundoIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb_Comprar3)
                                    .addGap(41, 41, 41))))
                        .addComponent(cronicasIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb_Comprar4)
                                    .addGap(42, 42, 42))))
                        .addComponent(robotIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_Comprar5)
                                .addGap(19, 19, 19)
                                .addComponent(MenuPrincipal))))
                    .addComponent(leyendaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ComprarActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jb_ComprarActionPerformed

    private void jb_Comprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Comprar2ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_Comprar2ActionPerformed

    private void jb_Comprar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Comprar3ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_Comprar3ActionPerformed

    private void jb_Comprar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Comprar4ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_Comprar4ActionPerformed

    private void jb_Comprar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Comprar5ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_Comprar5ActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

   
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
            java.util.logging.Logger.getLogger(Lib_CienciaFiccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lib_CienciaFiccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lib_CienciaFiccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lib_CienciaFiccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lib_CienciaFiccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextArea ResuCronicas;
    private javax.swing.JTextArea ResuLeyenda;
    private javax.swing.JTextArea ResuMaquina;
    private javax.swing.JTextArea ResuMundo;
    private javax.swing.JTextArea ResuRobot;
    private javax.swing.JLabel cronicasIma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jb_Comprar;
    private javax.swing.JButton jb_Comprar2;
    private javax.swing.JButton jb_Comprar3;
    private javax.swing.JButton jb_Comprar4;
    private javax.swing.JButton jb_Comprar5;
    private javax.swing.JLabel leyendaIma;
    private javax.swing.JLabel maquinaIma;
    private javax.swing.JLabel mundoIma;
    private javax.swing.JLabel robotIma;
    // End of variables declaration//GEN-END:variables
}
