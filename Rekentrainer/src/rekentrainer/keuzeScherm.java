package rekentrainer;

public class keuzeScherm extends javax.swing.JFrame {

    public keuzeScherm() {
        initComponents();
    }
    
    public keuzeScherm(String naam) {
        initComponents();
        welkomLbl.setText("Welkom " + naam + " maak hier jouw keuze");
    }
    
    public void close(){
        this.setVisible(false);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        groepenBox = new javax.swing.JComboBox<>();
        somKeuzeLbl = new javax.swing.JLabel();
        som30 = new javax.swing.JRadioButton();
        som50 = new javax.swing.JRadioButton();
        somMix = new javax.swing.JLabel();
        mixJa = new javax.swing.JRadioButton();
        mixNee = new javax.swing.JRadioButton();
        startTrainerBtn = new javax.swing.JButton();
        som15 = new javax.swing.JRadioButton();
        welkomLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rekentrainer - Keuze Scherm");
        setResizable(false);

        groepenBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        groepenBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kies jouw groep:", "Groep 3", "Groep 4", "Groep 5", "Groep 6", "Groep 7", "Groep 8" }));
        groepenBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groepenBoxActionPerformed(evt);
            }
        });

        somKeuzeLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        somKeuzeLbl.setText("Kies het aantal sommen dat je wil maken:");

        buttonGroup1.add(som30);
        som30.setText("30");
        som30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                som30ActionPerformed(evt);
            }
        });

        buttonGroup1.add(som50);
        som50.setText("50");
        som50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                som50ActionPerformed(evt);
            }
        });

        somMix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        somMix.setText("Sommen door elkaar:");

        buttonGroup2.add(mixJa);
        mixJa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mixJa.setText("Ja");
        mixJa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixJaActionPerformed(evt);
            }
        });

        buttonGroup2.add(mixNee);
        mixNee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mixNee.setSelected(true);
        mixNee.setText("Nee");
        mixNee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixNeeActionPerformed(evt);
            }
        });

        startTrainerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startTrainerBtn.setText("Start Rekentrainer");
        startTrainerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTrainerBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(som15);
        som15.setSelected(true);
        som15.setText("15");
        som15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                som15ActionPerformed(evt);
            }
        });

        welkomLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(startTrainerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(groepenBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(somKeuzeLbl))
                            .addComponent(somMix))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(som50)
                            .addComponent(mixJa)
                            .addComponent(mixNee)
                            .addComponent(som30)
                            .addComponent(som15)))
                    .addComponent(welkomLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welkomLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groepenBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somKeuzeLbl)
                    .addComponent(som15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(som30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(som50)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(somMix)
                    .addComponent(mixJa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mixNee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startTrainerBtn)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTrainerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTrainerBtnActionPerformed
        buttonGroup1.getSelection();
        buttonGroup2.getSelection();
        groepenBox.getSelectedItem();
        
        if(som15.isSelected()) {
            
        }
        
        //Sluit keuzeScherm en begin de rekentrainer
        new rekenSommen().setVisible(true);
        close();
    }//GEN-LAST:event_startTrainerBtnActionPerformed

    private void groepenBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groepenBoxActionPerformed
        groepenBox.getSelectedItem();
    }//GEN-LAST:event_groepenBoxActionPerformed

    private void som15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_som15ActionPerformed
        if(som15.isSelected()){
            som30.setSelected(false);
            som50.setSelected(false);
        }
    }//GEN-LAST:event_som15ActionPerformed

    private void som30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_som30ActionPerformed
        if(som30.isSelected()){
            som15.setSelected(false);
            som50.setSelected(false);
        }
    }//GEN-LAST:event_som30ActionPerformed

    private void som50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_som50ActionPerformed
        if(som50.isSelected()){
            som15.setSelected(false);
            som30.setSelected(false);
        }
    }//GEN-LAST:event_som50ActionPerformed

    private void mixJaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixJaActionPerformed
        if(mixJa.isSelected()){
            mixNee.setSelected(false);
        }
    }//GEN-LAST:event_mixJaActionPerformed

    private void mixNeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixNeeActionPerformed
        if(mixNee.isSelected()){
            mixJa.setSelected(false);
        }
    }//GEN-LAST:event_mixNeeActionPerformed

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
            java.util.logging.Logger.getLogger(keuzeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(keuzeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(keuzeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(keuzeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new keuzeScherm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> groepenBox;
    private javax.swing.JRadioButton mixJa;
    private javax.swing.JRadioButton mixNee;
    private javax.swing.JRadioButton som15;
    private javax.swing.JRadioButton som30;
    private javax.swing.JRadioButton som50;
    private javax.swing.JLabel somKeuzeLbl;
    private javax.swing.JLabel somMix;
    private javax.swing.JButton startTrainerBtn;
    private javax.swing.JLabel welkomLbl;
    // End of variables declaration//GEN-END:variables
}
