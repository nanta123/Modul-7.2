/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7_2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nanta
 */
public class mod7_2 extends javax.swing.JFrame {

    /**
     * Creates new form mod7_2
     */
    public mod7_2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Sekolah = new javax.swing.JTextField();
        Cbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(Nama);
        Nama.setBounds(200, 40, 200, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(200, 120, 200, 30);
        getContentPane().add(Sekolah);
        Sekolah.setBounds(200, 170, 200, 30);

        Cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XIRPL1", "XIRPL2", "XIRPL3", "XIRPL4", "XIRPL5", "XIRPL6", "XITKJ1", "XITKJ2", "XITKJ3", "XITKJ4", "XITKJ5" }));
        getContentPane().add(Cbox);
        Cbox.setBounds(200, 80, 80, 20);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 80, 14);

        jLabel2.setText("Kelas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 80, 80, 14);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 130, 80, 14);

        jLabel4.setText("Sekolah");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 180, 80, 14);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 230, 51, 23);

        jButton2.setText("Edit");
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 230, 51, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Alamat", "Sekolah"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 452, 130);

        setBounds(0, 0, 540, 475);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String kelas = Cbox.getSelectedItem().toString();
        String alamat = Alamat.getText();
        String sekolah = Sekolah.getText();
        
        if(Cbox.getSelectedItem()== "XIRPL1"){
        }if(Cbox.getSelectedItem()== "XIRPL2"){
        }if(Cbox.getSelectedItem()== "XIRPL3"){
        }if(Cbox.getSelectedItem()== "XIRPL4"){
        }if(Cbox.getSelectedItem()== "XIRPL5"){    
        }if(Cbox.getSelectedItem()== "XIRPL6"){ 
        }if(Cbox.getSelectedItem()== "XITKJ1"){
        }if(Cbox.getSelectedItem()== "XITKJ2"){
        }if(Cbox.getSelectedItem()== "XITKJ3"){    
        }if(Cbox.getSelectedItem()== "XITKJ4"){ 
        }if(Cbox.getSelectedItem()== "XITKJ5");
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{Nama.getText(),Cbox.getSelectedItem(), Alamat.getText(), Sekolah.getText()});
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mod7_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mod7_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mod7_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mod7_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mod7_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> Cbox;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Sekolah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
