package rekentrainer;

import java.util.Random;

public class rekenSommen extends javax.swing.JFrame {

    public rekenSommen() {
        initComponents();
    }
    
    public rekenSommen(int som) {
        initComponents();
    }
    
    public void close(){
        this.setVisible(false);
        this.dispose();
    }
    
    /* input van keuzeScherm moet hier gebruikt worden
    voor het genereren van random sommen in verschillende
    moeilijkheids gradaties naar aanleiding van de geselecteerde groep,
    hoeveelheid sommen en gemixt of opeenvolgend */
    
    public void setSommen() {
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textLbl = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        operator = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        equals = new javax.swing.JLabel();
        antwoordTxt = new javax.swing.JTextField();
        volgendeSom = new javax.swing.JButton();
        voortgang = new javax.swing.JPanel();
        aantalFout = new javax.swing.JLabel();
        aantalGoed = new javax.swing.JLabel();
        voortGang = new javax.swing.JLabel();
        welkom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rekentrainer");
        setResizable(false);

        textLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textLbl.setText("Vul het goede antwoord van de volgende som in");

        num1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        num1.setLabelFor(num1);
        num1.setText("5");

        operator.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        operator.setText("+");

        num2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        num2.setText("7");

        equals.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        equals.setText("=");

        antwoordTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        volgendeSom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        volgendeSom.setText("Volgende");
        volgendeSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volgendeSomActionPerformed(evt);
            }
        });

        voortgang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        aantalFout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aantalFout.setText("Fout:");

        aantalGoed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aantalGoed.setText("Goed:");

        voortGang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        voortGang.setText("Voortgang:");

        javax.swing.GroupLayout voortgangLayout = new javax.swing.GroupLayout(voortgang);
        voortgang.setLayout(voortgangLayout);
        voortgangLayout.setHorizontalGroup(
            voortgangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voortgangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(voortgangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aantalGoed)
                    .addComponent(voortGang)
                    .addComponent(aantalFout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        voortgangLayout.setVerticalGroup(
            voortgangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voortgangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aantalGoed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aantalFout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voortGang)
                .addContainerGap())
        );

        welkom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voortgang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(num1)
                                            .addGap(18, 18, 18)
                                            .addComponent(operator)
                                            .addGap(18, 18, 18)
                                            .addComponent(num2)
                                            .addGap(18, 18, 18)
                                            .addComponent(equals)
                                            .addGap(18, 18, 18)
                                            .addComponent(antwoordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(79, 79, 79)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(volgendeSom)
                                        .addGap(145, 145, 145))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(welkom, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(welkom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(operator)
                    .addComponent(num2)
                    .addComponent(equals)
                    .addComponent(antwoordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volgendeSom)
                .addGap(18, 18, 18)
                .addComponent(voortgang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volgendeSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volgendeSomActionPerformed
        // Volgende som
        Random r = new Random();
        int n1 = r.nextInt(50)+1;
        int n2 = r.nextInt(50)+1;
        String val1 = String.valueOf(n1);
        String val2 = String.valueOf(n2);
        num1.setText(val1);
        num2.setText(val2);
    }//GEN-LAST:event_volgendeSomActionPerformed

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
            java.util.logging.Logger.getLogger(rekenSommen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rekenSommen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rekenSommen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rekenSommen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new rekenSommen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aantalFout;
    private javax.swing.JLabel aantalGoed;
    private javax.swing.JTextField antwoordTxt;
    private javax.swing.JLabel equals;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel operator;
    private javax.swing.JLabel textLbl;
    private javax.swing.JButton volgendeSom;
    private javax.swing.JLabel voortGang;
    private javax.swing.JPanel voortgang;
    private javax.swing.JLabel welkom;
    // End of variables declaration//GEN-END:variables
}
