/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inox;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Varun
 */
public class rembooking extends javax.swing.JFrame {

    /**
     * Creates new form rembooking
     */
    public rembooking() {
        initComponents();
         Connection conn= DBConnection.connect();
          if(conn != null)
        {
            String sql;
                sql = "select * from movie";
                try{
                    Statement stat = conn.createStatement();
                    ResultSet rs=null;
                    rs=stat.executeQuery(sql);
                        while(rs.next())
                        {
                            if(rs.getInt("id")==1)
                            {
                                if(rs.getString("name")!=null)
                                movie1.setText(rs.getString("name"));
                                else
                                {
                                movie1.setText("None");
                                movie1.setEnabled(false);
                                }
                            }
                           else if(rs.getInt("id")==2)
                            {
                                if(rs.getString("name")!=null)
                                movie2.setText(rs.getString("name"));
                                else
                                {
                                movie2.setText("None");
                                movie2.setEnabled(false);
                                }
                            }
                           else if(rs.getInt("id")==3)
                            {
                                if(rs.getString("name")!=null)
                                movie3.setText(rs.getString("name"));
                                else
                                {
                                movie3.setText("None");
                                movie3.setEnabled(false);
                                }
                            }
                        }
                    }
                catch(SQLException ex)
                {
                
                }
        }
           else
            {
                JOptionPane.showMessageDialog(null, "Not connected");
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movie3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        movie1 = new javax.swing.JButton();
        movie2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        movie3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        movie3.setText("jButton3");
        movie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setText("Cancel Booking");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        movie1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        movie1.setText("jButton1");
        movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie1ActionPerformed(evt);
            }
        });

        movie2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        movie2.setText("jButton2");
        movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(movie1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(movie2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(movie1)
                .addGap(36, 36, 36)
                .addComponent(movie2)
                .addGap(40, 40, 40)
                .addComponent(movie3)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void movie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie3ActionPerformed
        // TODO add your handling code here:
        new bookoff3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie3ActionPerformed

    private void movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie1ActionPerformed
        // TODO add your handling code here:
        new bookoff1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie1ActionPerformed

    private void movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie2ActionPerformed
        // TODO add your handling code here:
        new bookoff2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie2ActionPerformed

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
            java.util.logging.Logger.getLogger(rembooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rembooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rembooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rembooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rembooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton movie1;
    private javax.swing.JButton movie2;
    private javax.swing.JButton movie3;
    // End of variables declaration//GEN-END:variables
}
