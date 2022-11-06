
package Formularios;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Lib_Aventura extends javax.swing.JFrame {

    public Lib_Aventura() {
        initComponents();
        Bloquear();
        this.setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagenes/Robinson-Crusoe.jpg"));
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/la vuelta al mundo.jpg"));
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/Tigre mompracem1.jpg"));
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagenes/colmillo blanco1.jpg"));
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagenes/los tres mosqueteros.jpg"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(RobinsonIma.getWidth(), RobinsonIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(VueltaIma.getWidth(), VueltaIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(TigresIma.getWidth(), TigresIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(ColmilloIma.getWidth(), ColmilloIma.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(mosqueterosIma.getWidth(), mosqueterosIma.getHeight(), Image.SCALE_DEFAULT));
        RobinsonIma.setIcon(fondo1);
        VueltaIma.setIcon(fondo2);
        TigresIma.setIcon(fondo3);
        ColmilloIma.setIcon(fondo4);
        mosqueterosIma.setIcon(fondo5);
        this.repaint();
    }

    void Bloquear(){
        ResuCrusoe.setEditable(false);
        ResuVueltas.setEditable(false);
        ResuTigres.setEditable(false);
        ResuBlanco.setEditable(false);
        ResuMosque.setEditable(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RobinsonIma = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtb_compra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResuCrusoe = new javax.swing.JTextArea();
        VueltaIma = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtb_compra2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResuVueltas = new javax.swing.JTextArea();
        TigresIma = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtb_compra3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ResuTigres = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ResuBlanco = new javax.swing.JTextArea();
        ColmilloIma = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtb_compra4 = new javax.swing.JButton();
        mosqueterosIma = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtb_compra5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ResuMosque = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        RobinsonIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Robinson-Crusoe.jpg"))); // NOI18N

        jLabel5.setText("Robinson Crusoe");

        jLabel14.setText("Precio");

        jtb_compra.setText("Comprar");
        jtb_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_compraActionPerformed(evt);
            }
        });

        ResuCrusoe.setColumns(20);
        ResuCrusoe.setRows(5);
        ResuCrusoe.setText("Es una de las obras más famosas del célebre escritor \ninglés Daniel Defoe, publicada en 1719 y considerada \nla primera novela inglesa1. Se trata de una \nautobiografía ficticia del protagonista, un náufrago\ninglés que pasa 28 años en una remota isla desierta \nen la desembocadura del Orinoco, cerca de las costas\nde Trinidad y Venezuela.");
        jScrollPane1.setViewportView(ResuCrusoe);

        VueltaIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/la vuelta al mundo.jpg"))); // NOI18N

        jLabel15.setText("Precio");

        jLabel16.setText("la vuelta al mundo");

        jtb_compra2.setText("Comprar");
        jtb_compra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_compra2ActionPerformed(evt);
            }
        });

        ResuVueltas.setColumns(20);
        ResuVueltas.setRows(5);
        ResuVueltas.setText("Es una novela del escritor francés Julio Verne publicada por\nentregas en Le Temps desde el 7 de noviembre hasta el 22 de \ndiciembre de 1872, el mismo año en que se sitúa la acción. \nDespués, sería publicada íntegramente el 30 de enero de 1873.");
        jScrollPane2.setViewportView(ResuVueltas);

        TigresIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tigre mompracem1.jpg"))); // NOI18N

        jLabel6.setText("los tigres de mompracem ");

        jLabel17.setText("Precio");

        jtb_compra3.setText("Comprar");
        jtb_compra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_compra3ActionPerformed(evt);
            }
        });

        ResuTigres.setColumns(20);
        ResuTigres.setRows(5);
        ResuTigres.setText("Es una novela de aventuras del escritor italiano Emilio Salgari. \nEs la primera obra del ciclo Piratas de la Malasia que trata sobre \nlas peripecias del pirata malayo ficticio Sandokán. La novela fue \npublicada por entregas entre 1883 y 1884 con el título de La tigre\ndella Malesia. La versión definitiva salió en 1900 con el título \nactual.");
        jScrollPane3.setViewportView(ResuTigres);

        ResuBlanco.setColumns(20);
        ResuBlanco.setRows(5);
        ResuBlanco.setText("es una novela del escritor estadounidense Jack London.\nInicialmente aparecida por entregas en la revista Outing, \nfue publicada en 1906. La historia transcurre en el Territorio \ndel Yukón, Canadá, durante la Fiebre del oro de Klondike a\n fines del siglo XIX.");
        jScrollPane4.setViewportView(ResuBlanco);

        ColmilloIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/colmillo blanco1.jpg"))); // NOI18N

        jLabel7.setText("Colmillo Blanco");

        jLabel18.setText("Precio");

        jtb_compra4.setText("Comprar");
        jtb_compra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_compra4ActionPerformed(evt);
            }
        });

        mosqueterosIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/los tres mosqueteros.jpg"))); // NOI18N

        jLabel9.setText("Los Tres Mosqueteros ");

        jLabel20.setText("Precio");

        jtb_compra5.setText("Comprar");
        jtb_compra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_compra5ActionPerformed(evt);
            }
        });

        ResuMosque.setColumns(20);
        ResuMosque.setRows(5);
        ResuMosque.setText("Es una novela del escritor Alejandro Dumas, publicada inicialmente\nen folletines por el periódico Le Siècle, entre marzo y julio de 1844. \nEn ese mismo año fue publicada como volumen por la editorial \nBaudry y reeditada en 1846 por J. B. Fellens y L. P. Dufour, con \nilustraciones de Vivant Beaucé.");
        jScrollPane5.setViewportView(ResuMosque);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("PROXIMAMENTE MAS LIBROS");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mosqueterosIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtb_compra5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(23, 23, 23))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TigresIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel3))
                                    .addComponent(RobinsonIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtb_compra, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(23, 23, 23))))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtb_compra3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(23, 23, 23)))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ColmilloIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtb_compra4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addGap(23, 23, 23))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VueltaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtb_compra2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addGap(23, 23, 23))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MenuPrincipal)
                                .addGap(201, 201, 201)))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtb_compra))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(VueltaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtb_compra2)
                                            .addGap(43, 43, 43)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RobinsonIma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TigresIma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtb_compra3))))
                    .addComponent(ColmilloIma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtb_compra4)
                                .addGap(39, 39, 39)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mosqueterosIma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(15, 15, 15)
                                        .addComponent(jtb_compra5)))
                                .addGap(18, 18, 18)
                                .addComponent(MenuPrincipal)))
                        .addGap(3, 3, 3)))
                .addGap(72, 72, 72)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_compraActionPerformed
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jtb_compraActionPerformed

    private void jtb_compra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_compra2ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jtb_compra2ActionPerformed

    private void jtb_compra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_compra3ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jtb_compra3ActionPerformed

    private void jtb_compra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_compra4ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jtb_compra4ActionPerformed

    private void jtb_compra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_compra5ActionPerformed
        // TODO add your handling code here:
        Forma_Pago ventana = new Forma_Pago();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jtb_compra5ActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Lib_Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lib_Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lib_Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lib_Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lib_Aventura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ColmilloIma;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextArea ResuBlanco;
    private javax.swing.JTextArea ResuCrusoe;
    private javax.swing.JTextArea ResuMosque;
    private javax.swing.JTextArea ResuTigres;
    private javax.swing.JTextArea ResuVueltas;
    private javax.swing.JLabel RobinsonIma;
    private javax.swing.JLabel TigresIma;
    private javax.swing.JLabel VueltaIma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jtb_compra;
    private javax.swing.JButton jtb_compra2;
    private javax.swing.JButton jtb_compra3;
    private javax.swing.JButton jtb_compra4;
    private javax.swing.JButton jtb_compra5;
    private javax.swing.JLabel mosqueterosIma;
    // End of variables declaration//GEN-END:variables
}
