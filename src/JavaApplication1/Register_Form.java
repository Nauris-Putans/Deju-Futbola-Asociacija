/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication1;

import static JavaApplication1.javaConnect.DB_URL;
import static JavaApplication1.javaConnect.PASS;
import static JavaApplication1.javaConnect.USER;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class Register_Form extends javax.swing.JFrame {
	
	Connection conn=null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	
	public Register_Form() {	// Creates new form Register_Form
		initComponents();
		
		this.setLocationRelativeTo(null);	// Centers Login_Form form in the screen
		
		try {	
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} 
		
		catch (SQLException ex) {
			Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        lbl_LoginForm = new javax.swing.JLabel();
        close_button = new javax.swing.JLabel();
        minimize_button = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_surname = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        lbl_again_password = new javax.swing.JLabel();
        txt_again_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        cmd_cancel = new javax.swing.JButton();
        cmd_register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        date_chooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(230, 126, 34));

        lbl_LoginForm.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_LoginForm.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LoginForm.setText("Reģistrēšanās logs");

        close_button.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        close_button.setForeground(new java.awt.Color(255, 255, 255));
        close_button.setText("X");
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });

        minimize_button.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        minimize_button.setForeground(new java.awt.Color(255, 255, 255));
        minimize_button.setText("_");
        minimize_button.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minimize_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_LoginForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_button)
                .addGap(18, 18, 18)
                .addComponent(close_button)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_LoginForm)
                            .addComponent(close_button)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(minimize_button, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        lbl_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Vārds");

        txt_name.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(204, 204, 204));
        txt_name.setBorder(null);
        txt_name.setOpaque(false);

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_surname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_surname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_surname.setText("Uzvārds");

        txt_surname.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_surname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_surname.setForeground(new java.awt.Color(204, 204, 204));
        txt_surname.setBorder(null);
        txt_surname.setOpaque(false);

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Lietotajvards");

        txt_username.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(204, 204, 204));
        txt_username.setBorder(null);
        txt_username.setOpaque(false);

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Parole");

        txt_password.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setBorder(null);

        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_again_password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_again_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_again_password.setText("Atkartota parole");

        txt_again_password.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_again_password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_again_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_again_password.setBorder(null);

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("Dzimšanas datums");

        cmd_cancel.setBackground(new java.awt.Color(192, 57, 43));
        cmd_cancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        cmd_cancel.setForeground(new java.awt.Color(255, 255, 255));
        cmd_cancel.setText("Atcelt");
        cmd_cancel.setBorder(null);
        cmd_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_cancel.setFocusPainted(false);
        cmd_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmd_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmd_cancelMouseExited(evt);
            }
        });
        cmd_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_cancelActionPerformed(evt);
            }
        });

        cmd_register.setBackground(new java.awt.Color(0, 179, 113));
        cmd_register.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        cmd_register.setForeground(new java.awt.Color(255, 255, 255));
        cmd_register.setText("Reģistrēties");
        cmd_register.setBorder(null);
        cmd_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_register.setFocusPainted(false);
        cmd_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmd_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmd_registerMouseExited(evt);
            }
        });
        cmd_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_registerActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\blue-orange-black-green-white-adidas-soccer-ball-on-green-47354.png")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lbl_surname)
                            .addComponent(lbl_name)
                            .addComponent(txt_username)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txt_surname)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lbl_username)
                            .addComponent(lbl_password)
                            .addComponent(txt_again_password, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lbl_again_password)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lbl_date)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(date_chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmd_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(cmd_register, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_surname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbl_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lbl_again_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_again_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lbl_date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd_register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void minimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_buttonMouseClicked

    private void cmd_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_cancelActionPerformed

    private void cmd_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_registerActionPerformed
	
	String Vards = txt_name.getText();
	String Uzvards = txt_surname.getText();
	String Lietotajvards = txt_username.getText();
	String Parole = String.valueOf(txt_password.getPassword());
	String Atkal_parole = String.valueOf(txt_again_password.getPassword());
	String Dzimsanas_Datums = null;
	
	if (Vards.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno vārdu");
	}
	
	else if (Uzvards.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno uzvārdu");
	}
	
	else if (Lietotajvards.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno lietotajvārdu");
	}
	
	else if (checkUsername (Lietotajvards)) 
	{
			JOptionPane.showMessageDialog(null, "Šāds lietotajvards jau pastāv");
	}
	
	else if (Parole.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno paroli");
	}
	
	else if (!Parole.equals(Atkal_parole)) 
	{
		JOptionPane.showMessageDialog(null, "Atkartoti parole nav vienada ar paroli");
	}
	
	else if (date_chooser.getDate() == null)
	{
		JOptionPane.showMessageDialog(null, "Pievieno dzimšanas datumu");
	}
	
	else 
	{
		
		if (date_chooser.getDate() != null) 
		{
			SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
			Dzimsanas_Datums = date_format.format(date_chooser.getDate());
		}
		
		PreparedStatement st;
		String sql = "insert into dfa.lietotaji (Vards, Uzvards, Lietotajvards, Parole, Dzimsanas_Datums)" + " values (?, ?, ?, ?, ?)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, Vards);
			pst.setString(2, Uzvards);
			pst.setString(3, Lietotajvards);
			pst.setString(4, Parole);

			if(Dzimsanas_Datums != null)
			{
				pst.setString(5, Dzimsanas_Datums);
			}

			if(pst.executeUpdate() > 0) {
				JOptionPane.showMessageDialog(null, "Veiksmīga reģistrēšanās!");
			}
		}

		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Something wrong with sql syntax!");
		}
	}
	
	
	
    }//GEN-LAST:event_cmd_registerActionPerformed

	public boolean checkUsername(String username) {		// Function to check if the username already exist
		ResultSet rs = null;
		PreparedStatement pst = null;
		boolean checkUser = false;
		
		String sql = "select * from lietotaji where Lietotajvards=?";	// Selects from database username and password
		
		try 
		{
			pst = conn.prepareStatement(sql);     
			pst.setString(1, username);
			
			rs = pst.executeQuery();
		
			if(rs.next())
			{
				checkUser = true;
			}
		}
		
		catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Something wrong with sql syntax!");
		}
		
		return checkUser;
	}
	
    private void cmd_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_registerMouseEntered
	cmd_register.setBackground(new Color(0, 148, 96));
    }//GEN-LAST:event_cmd_registerMouseEntered

    private void cmd_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_registerMouseExited
        cmd_register.setBackground(new Color(0,169,113));
    }//GEN-LAST:event_cmd_registerMouseExited

    private void cmd_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_registerMouseClicked
        cmd_register.setBackground(new Color(0, 138, 96));
    }//GEN-LAST:event_cmd_registerMouseClicked

    private void cmd_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_cancelMouseEntered
        cmd_cancel.setBackground(new Color(165, 60, 43));
    }//GEN-LAST:event_cmd_cancelMouseEntered

    private void cmd_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_cancelMouseExited
        cmd_cancel.setBackground(new Color(192, 57, 43));
    }//GEN-LAST:event_cmd_cancelMouseExited

    private void cmd_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_cancelMouseClicked
        cmd_cancel.setBackground(new Color(160, 57, 43));
    }//GEN-LAST:event_cmd_cancelMouseClicked

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
			java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register_Form().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel close_button;
    public javax.swing.JButton cmd_cancel;
    public javax.swing.JButton cmd_register;
    public com.toedter.calendar.JDateChooser date_chooser;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel lbl_LoginForm;
    public javax.swing.JLabel lbl_again_password;
    public javax.swing.JLabel lbl_date;
    public javax.swing.JLabel lbl_name;
    public javax.swing.JLabel lbl_password;
    public javax.swing.JLabel lbl_surname;
    public javax.swing.JLabel lbl_username;
    public javax.swing.JLabel minimize_button;
    public javax.swing.JPasswordField txt_again_password;
    public javax.swing.JTextField txt_name;
    public javax.swing.JPasswordField txt_password;
    public javax.swing.JTextField txt_surname;
    public javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
