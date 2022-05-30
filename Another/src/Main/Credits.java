
package Main;

public class Credits extends javax.swing.JFrame {

    /**
     * Creates new form Credits
     */
    public Credits() {
        initComponents();
        setTitle("Credit Page");
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        credits = new javax.swing.JPanel();
        submit = new javax.swing.JLabel();
        name_fahim = new javax.swing.JLabel();
        id_fahim = new javax.swing.JLabel();
        teacher_name = new javax.swing.JLabel();
        Return = new javax.swing.JButton();
        submitted_to = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        credits.setPreferredSize(new java.awt.Dimension(766, 630));
        credits.setLayout(null);

        submit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(15, 180, 230));
        submit.setText("Submitted By");
        credits.add(submit);
        submit.setBounds(20, 10, 310, 50);

        name_fahim.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        name_fahim.setForeground(new java.awt.Color(11, 106, 135));
        name_fahim.setText("Md. Fahim Morshed \n ");
        credits.add(name_fahim);
        name_fahim.setBounds(40, 60, 220, 44);

        id_fahim.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        id_fahim.setForeground(new java.awt.Color(11, 106, 135));
        id_fahim.setText("2122279642");
        credits.add(id_fahim);
        id_fahim.setBounds(40, 90, 310, 51);

        teacher_name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        teacher_name.setForeground(new java.awt.Color(50, 80, 155));
        teacher_name.setText("SVA Ma'am & Maliha Apu");
        credits.add(teacher_name);
        teacher_name.setBounds(130, 370, 480, 34);

        Return.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        credits.add(Return);
        Return.setBounds(579, 549, 133, 35);

        submitted_to.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitted_to.setForeground(new java.awt.Color(65, 122, 222));
        submitted_to.setText("Submitted To");
        credits.add(submitted_to);
        submitted_to.setBounds(280, 330, 180, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        FirstPage four = new FirstPage();
        credits.setVisible(false);
        dispose();
        four.setVisible(true);

    }//GEN-LAST:event_ReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JPanel credits;
    private javax.swing.JLabel id_fahim;
    private javax.swing.JLabel name_fahim;
    private javax.swing.JLabel submit;
    private javax.swing.JLabel submitted_to;
    private javax.swing.JLabel teacher_name;
    // End of variables declaration//GEN-END:variables
}
