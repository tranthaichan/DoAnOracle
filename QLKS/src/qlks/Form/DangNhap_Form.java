/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.Form;

import qlks.Form.TrangChu_Form;
import javax.swing.JOptionPane;
import static qlks.MyConnection.checkdn;
import static qlks.MyConnection.getConnection;

/**
 *
 * @author khoa
 */
public class DangNhap_Form extends javax.swing.JFrame {

    public DangNhap_Form() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static String Hostname;//
    public static String Port;//1521localhost
    public static String SID;//orclocalhostl
    public static String Username;
    public static String Password;
    public static String Name_Ac;
    
    public void thongtindangnhap()
    {
        Hostname=jTextFieldHOSTNAME.getText();
        Port=jTextFieldPORT.getText();
        SID=jTextFieldSID.getText();
        if(sysdba.isSelected()==false)
        {
            Username=txtUser.getText();
        }
        else
        {
            Username=txtUser.getText()+" "+sysdba.getText().toString();
        }
        Password=txtPassword.getText();
    }
    public static boolean check = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextFieldSID = new javax.swing.JTextField();
        jTextFieldPORT = new javax.swing.JTextField();
        jTextFieldHOSTNAME = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sysdba = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        thoat2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("QUẢN LÝ KHÁCH SẠN");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 10, 420, 80);

        jTextFieldSID.setText("orcl");
        jPanel1.add(jTextFieldSID);
        jTextFieldSID.setBounds(280, 220, 230, 30);

        jTextFieldPORT.setText("1521");
        jPanel1.add(jTextFieldPORT);
        jTextFieldPORT.setBounds(280, 170, 230, 30);

        jTextFieldHOSTNAME.setText("localhost");
        jPanel1.add(jTextFieldHOSTNAME);
        jTextFieldHOSTNAME.setBounds(280, 120, 230, 30);

        txtUser.setText("hr");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser);
        txtUser.setBounds(280, 270, 170, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Shuffle-On-icon.png"))); // NOI18N
        jButton1.setText("Đăng Nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 390, 170, 40);

        sysdba.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        sysdba.setForeground(new java.awt.Color(255, 255, 255));
        sysdba.setText("as sysdba");
        jPanel1.add(sysdba);
        sysdba.setBounds(490, 270, 120, 33);

        txtPassword.setText("hr");
        jPanel1.add(txtPassword);
        txtPassword.setBounds(280, 330, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SID  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 220, 60, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Port :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 170, 60, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hostname :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 120, 110, 22);

        thoat2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        thoat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/THOAT.png"))); // NOI18N
        thoat2.setText("Thoát");
        thoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoat2ActionPerformed(evt);
            }
        });
        jPanel1.add(thoat2);
        thoat2.setBounds(570, 410, 90, 25);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/ssssss.png"))); // NOI18N
        jLabel2.setText("Mật khẩu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(100, 320, 120, 40);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/if_preferences-desktop-cryptography_8794.png"))); // NOI18N
        jLabel1.setText("  Tài Khoản");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 270, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/dangnhap.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        thongtindangnhap();
        getConnection(Hostname,Port,SID,Username,Password);
        if(checkdn == true)
        {
        check = true;
        Name_Ac = txtUser.getText();
        JOptionPane.showMessageDialog(this, "đăng nhập thành công");
        this.dispose();
        MENUFORM ql = new MENUFORM();
        ql.setVisible(true);
        this.setVisible(false);
        }else
        {
            JOptionPane.showMessageDialog(this, "đăng nhập thất bại! vui lòng kiểm tra lại thông tin đăng nhập!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void thoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoat2ActionPerformed
        // TODO add your handling code here:
        thoat2.setToolTipText("Click để thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương"
            + " trình không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_thoat2ActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextFieldHOSTNAME;
    private javax.swing.JTextField jTextFieldPORT;
    private javax.swing.JTextField jTextFieldSID;
    private javax.swing.JRadioButton sysdba;
    private javax.swing.JButton thoat2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
