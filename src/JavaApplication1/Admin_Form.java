/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication1;

//---------------Imports---------------//

import static JavaApplication1.Main_Form.Table_Players;
import static JavaApplication1.javaConnect.DB_URL;
import static JavaApplication1.javaConnect.PASS;
import static JavaApplication1.javaConnect.USER;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;


//----------------------------------------//
public class Admin_Form extends javax.swing.JFrame {
 
	Connection conn=null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	String k;
	
	public Admin_Form() {	// Creates new form Admin_Form
		initComponents();
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//---------------Main_form start button color set---------------//
		
			SakumaEkrans_Panel.show();
			SpeletajuInfo_Panel.hide();
			SpeluInfo_Panel.hide();
			MansProfils_Panel.hide();
			Drizuma_Panel.hide();
			ProgrammasInfo_Panel.hide();
	
			setColor(button_SakumaEkrans);
			resetColor(button_SpeletajuInfo);
			resetColor(button_SpeluInfo);
			resetColor(button_MansProfils);
			resetColor(button_Drizuma);
			resetColor(button_ProgrammasInfo);

			 // Indicators

			ind_SakumaEkrans.setOpaque(true);
			ind_SpeletajuInfo.setOpaque(false);
			ind_SpeluInfo.setOpaque(false);
			ind_MansProfils.setOpaque(false);
			ind_ProgrammasInfo.setOpaque(false);
			ind_Drizuma.setOpaque(false);
				
		//-----------------------------------------------------------------------------//
		
		this.setLocationRelativeTo(null);
		
		try 
		{	
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} 
		
		catch (SQLException ex) 
		{
			Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
private void Update_table() {
	
	String insert = "select * from speletaji";
	
	try {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		pst = conn.prepareStatement(insert);   
		rs = pst.executeQuery();
		Table_Players.setModel(DbUtils.resultSetToTableModel(rs));
		Table_Players.getColumnModel().getColumn(0).setPreferredWidth(20);
	}
	
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
}

private void Player_Add_Update_table() {
	
	String insert = "select * from speletaji";
	
	try {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		pst = conn.prepareStatement(insert);   
		rs = pst.executeQuery();
		Table_Players_Add.setModel(DbUtils.resultSetToTableModel(rs));
		Table_Players_Add.getColumnModel().getColumn(0).setPreferredWidth(10);
		Table_Players_Add.getColumnModel().getColumn(3).setPreferredWidth(10);
		Table_Players_Add.getColumnModel().getColumn(4).setPreferredWidth(30);
		Table_Players_Add.getColumnModel().getColumn(5).setPreferredWidth(30);
		Table_Players_Add.getColumnModel().getColumn(7).setPreferredWidth(30);
	}
	
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
	
	finally {
		try { rs.close(); } catch (Exception e) { /* ignored */ }
		try { pst.close(); } catch (Exception e) { /* ignored */ }
		try { conn.close(); } catch (Exception e) { /* ignored */ }
	}
}

private void FillComboCountry() {
	
	String insert = "select * from valstis";
	
	try {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		pst = conn.prepareStatement(insert);   
		rs = pst.executeQuery();
		
		while (rs.next()) {
			String valsts = rs.getString("country_name");
			ComboBox_Valstis.addItem(valsts);
		}
	}
	
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
	
	finally {
		try { rs.close(); } catch (Exception e) { /* ignored */ }
		try { pst.close(); } catch (Exception e) { /* ignored */ }
		try { conn.close(); } catch (Exception e) { /* ignored */ }
	}
}

private void FillComboTeams() {
	
	String insert = "select * from komandas";
	
	try {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		pst = conn.prepareStatement(insert);   
		rs = pst.executeQuery();
		
		while (rs.next()) {
			String komanda = rs.getString("Komanda");
			ComboBox_Komandas.addItem(komanda);
		}
	}
	
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
	
	finally {
		try { rs.close(); } catch (Exception e) { /* ignored */ }
		try { pst.close(); } catch (Exception e) { /* ignored */ }
		try { conn.close(); } catch (Exception e) { /* ignored */ }
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

        Background_Panel = new javax.swing.JPanel();
        WhiteBar_Panel = new javax.swing.JPanel();
        Side_Panel = new javax.swing.JPanel();
        DFA_Logo = new javax.swing.JLabel();
        button_SakumaEkrans = new javax.swing.JPanel();
        ind_SakumaEkrans = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button_SpeletajuInfo = new javax.swing.JPanel();
        ind_SpeletajuInfo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        button_PievienotSpeletajus = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        button_RedigetSpeletajus = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        button_DzestSpeletajus = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        button_SpeluInfo = new javax.swing.JPanel();
        ind_SpeluInfo = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        button_RedigetSpeles = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        button_PievienotSpeles = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        button_DzestSpeles = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        button_MansProfils = new javax.swing.JPanel();
        ind_MansProfils = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        button_Drizuma = new javax.swing.JPanel();
        ind_Drizuma = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        button_ProgrammasInfo = new javax.swing.JPanel();
        ind_ProgrammasInfo = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        button_exit = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        SakumaEkrans_Panel = new javax.swing.JPanel();
        SpeletajuInfo_Panel = new javax.swing.JPanel();
        SpeletajuInfo_Pievienot_Panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Players_Add = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl_bilde = new javax.swing.JLabel();
        lbl_garums = new javax.swing.JLabel();
        ind_uzvards = new javax.swing.JLabel();
        ComboBox_Komandas = new javax.swing.JComboBox<>();
        txt_gadi = new javax.swing.JTextField();
        cmd_addPlayer_save = new javax.swing.JButton();
        txt_uzvards = new javax.swing.JTextField();
        lbl_vards = new javax.swing.JLabel();
        cmd_addPlayer_jersey = new javax.swing.JButton();
        txt_svars = new javax.swing.JTextField();
        lbl_svars = new javax.swing.JLabel();
        ind_vards = new javax.swing.JLabel();
        ind_garums = new javax.swing.JLabel();
        lbl_komanda = new javax.swing.JLabel();
        lbl_uzvards = new javax.swing.JLabel();
        ind_svars = new javax.swing.JLabel();
        lbl_gadi = new javax.swing.JLabel();
        lbl_komandasKrekls = new javax.swing.JLabel();
        txt_garums = new javax.swing.JTextField();
        lbl_valsts = new javax.swing.JLabel();
        ind_gadi = new javax.swing.JLabel();
        txt_vards = new javax.swing.JTextField();
        ComboBox_Valstis = new javax.swing.JComboBox<>();
        SpeletajuInfo_Rediget_Panel = new javax.swing.JPanel();
        SpeletajuInfo_Dzest_Panel = new javax.swing.JPanel();
        SpeluInfo_Panel = new javax.swing.JPanel();
        SpeluInfo_Pievienot_Panel = new javax.swing.JPanel();
        SpeluInfo_Rediget_Panel = new javax.swing.JPanel();
        SpeluInfo_Dzest_Panel = new javax.swing.JPanel();
        MansProfils_Panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Drizuma_Panel = new javax.swing.JPanel();
        ProgrammasInfo_Panel = new javax.swing.JPanel();
        Programm_Info = new javax.swing.JLabel();
        NP_picture = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Instagram_icon = new javax.swing.JLabel();
        Facebook_icon = new javax.swing.JLabel();
        GitHub_icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background_Panel.setBackground(new java.awt.Color(52, 73, 94));

        WhiteBar_Panel.setBackground(new java.awt.Color(255, 255, 255));
        WhiteBar_Panel.setPreferredSize(new java.awt.Dimension(6, 0));

        javax.swing.GroupLayout WhiteBar_PanelLayout = new javax.swing.GroupLayout(WhiteBar_Panel);
        WhiteBar_Panel.setLayout(WhiteBar_PanelLayout);
        WhiteBar_PanelLayout.setHorizontalGroup(
            WhiteBar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        WhiteBar_PanelLayout.setVerticalGroup(
            WhiteBar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Side_Panel.setBackground(new java.awt.Color(52, 152, 219));

        DFA_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DFA_Logo.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\DFA_Logo.png")); // NOI18N
        DFA_Logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DFA_Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_SakumaEkrans.setBackground(new java.awt.Color(52, 152, 219));
        button_SakumaEkrans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_SakumaEkrans.setPreferredSize(new java.awt.Dimension(157, 50));
        button_SakumaEkrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_SakumaEkransMousePressed(evt);
            }
        });

        ind_SakumaEkrans.setBackground(new java.awt.Color(255, 255, 255));
        ind_SakumaEkrans.setOpaque(false);
        ind_SakumaEkrans.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_SakumaEkransLayout = new javax.swing.GroupLayout(ind_SakumaEkrans);
        ind_SakumaEkrans.setLayout(ind_SakumaEkransLayout);
        ind_SakumaEkransLayout.setHorizontalGroup(
            ind_SakumaEkransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_SakumaEkransLayout.setVerticalGroup(
            ind_SakumaEkransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sākuma ekrāns");

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\home-5-24.png")); // NOI18N

        javax.swing.GroupLayout button_SakumaEkransLayout = new javax.swing.GroupLayout(button_SakumaEkrans);
        button_SakumaEkrans.setLayout(button_SakumaEkransLayout);
        button_SakumaEkransLayout.setHorizontalGroup(
            button_SakumaEkransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_SakumaEkransLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_SakumaEkrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_SakumaEkransLayout.setVerticalGroup(
            button_SakumaEkransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_SakumaEkrans, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_SakumaEkransLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_SakumaEkransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(button_SakumaEkransLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        button_SpeletajuInfo.setBackground(new java.awt.Color(52, 152, 219));
        button_SpeletajuInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_SpeletajuInfo.setPreferredSize(new java.awt.Dimension(157, 50));
        button_SpeletajuInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_SpeletajuInfoMousePressed(evt);
            }
        });

        ind_SpeletajuInfo.setBackground(new java.awt.Color(255, 255, 255));
        ind_SpeletajuInfo.setOpaque(false);
        ind_SpeletajuInfo.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_SpeletajuInfoLayout = new javax.swing.GroupLayout(ind_SpeletajuInfo);
        ind_SpeletajuInfo.setLayout(ind_SpeletajuInfoLayout);
        ind_SpeletajuInfoLayout.setHorizontalGroup(
            ind_SpeletajuInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_SpeletajuInfoLayout.setVerticalGroup(
            ind_SpeletajuInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Speletāju info");

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\info-24.png")); // NOI18N

        javax.swing.GroupLayout button_SpeletajuInfoLayout = new javax.swing.GroupLayout(button_SpeletajuInfo);
        button_SpeletajuInfo.setLayout(button_SpeletajuInfoLayout);
        button_SpeletajuInfoLayout.setHorizontalGroup(
            button_SpeletajuInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_SpeletajuInfoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_SpeletajuInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        button_SpeletajuInfoLayout.setVerticalGroup(
            button_SpeletajuInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_SpeletajuInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_SpeletajuInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_SpeletajuInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(button_SpeletajuInfoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        button_PievienotSpeletajus.setBackground(new java.awt.Color(52, 152, 219));
        button_PievienotSpeletajus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_PievienotSpeletajus.setPreferredSize(new java.awt.Dimension(157, 50));
        button_PievienotSpeletajus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_PievienotSpeletajusMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pievienot spēlētājus");

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\16x\\plus-4-16.png")); // NOI18N

        javax.swing.GroupLayout button_PievienotSpeletajusLayout = new javax.swing.GroupLayout(button_PievienotSpeletajus);
        button_PievienotSpeletajus.setLayout(button_PievienotSpeletajusLayout);
        button_PievienotSpeletajusLayout.setHorizontalGroup(
            button_PievienotSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_PievienotSpeletajusLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_PievienotSpeletajusLayout.setVerticalGroup(
            button_PievienotSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_PievienotSpeletajusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_PievienotSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        button_RedigetSpeletajus.setBackground(new java.awt.Color(52, 152, 219));
        button_RedigetSpeletajus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_RedigetSpeletajus.setPreferredSize(new java.awt.Dimension(157, 50));
        button_RedigetSpeletajus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_RedigetSpeletajusMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rediģēt spēlētājus");

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\16x\\wrench-16.png")); // NOI18N

        javax.swing.GroupLayout button_RedigetSpeletajusLayout = new javax.swing.GroupLayout(button_RedigetSpeletajus);
        button_RedigetSpeletajus.setLayout(button_RedigetSpeletajusLayout);
        button_RedigetSpeletajusLayout.setHorizontalGroup(
            button_RedigetSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_RedigetSpeletajusLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_RedigetSpeletajusLayout.setVerticalGroup(
            button_RedigetSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_RedigetSpeletajusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_RedigetSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        button_DzestSpeletajus.setBackground(new java.awt.Color(52, 152, 219));
        button_DzestSpeletajus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_DzestSpeletajus.setPreferredSize(new java.awt.Dimension(157, 50));
        button_DzestSpeletajus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_DzestSpeletajusMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dzēst spēlētājus");

        jLabel20.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\16x\\x-mark-3-16.png")); // NOI18N

        javax.swing.GroupLayout button_DzestSpeletajusLayout = new javax.swing.GroupLayout(button_DzestSpeletajus);
        button_DzestSpeletajus.setLayout(button_DzestSpeletajusLayout);
        button_DzestSpeletajusLayout.setHorizontalGroup(
            button_DzestSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_DzestSpeletajusLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_DzestSpeletajusLayout.setVerticalGroup(
            button_DzestSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_DzestSpeletajusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_DzestSpeletajusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        button_SpeluInfo.setBackground(new java.awt.Color(52, 152, 219));
        button_SpeluInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_SpeluInfo.setPreferredSize(new java.awt.Dimension(157, 50));
        button_SpeluInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_SpeluInfoMousePressed(evt);
            }
        });

        ind_SpeluInfo.setBackground(new java.awt.Color(255, 255, 255));
        ind_SpeluInfo.setOpaque(false);
        ind_SpeluInfo.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_SpeluInfoLayout = new javax.swing.GroupLayout(ind_SpeluInfo);
        ind_SpeluInfo.setLayout(ind_SpeluInfoLayout);
        ind_SpeluInfoLayout.setHorizontalGroup(
            ind_SpeluInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_SpeluInfoLayout.setVerticalGroup(
            ind_SpeluInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Spēļu info");

        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\planner-24.png")); // NOI18N

        javax.swing.GroupLayout button_SpeluInfoLayout = new javax.swing.GroupLayout(button_SpeluInfo);
        button_SpeluInfo.setLayout(button_SpeluInfoLayout);
        button_SpeluInfoLayout.setHorizontalGroup(
            button_SpeluInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_SpeluInfoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_SpeluInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        button_SpeluInfoLayout.setVerticalGroup(
            button_SpeluInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_SpeluInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_SpeluInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_SpeluInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(button_SpeluInfoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        button_RedigetSpeles.setBackground(new java.awt.Color(52, 152, 219));
        button_RedigetSpeles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_RedigetSpeles.setPreferredSize(new java.awt.Dimension(157, 50));
        button_RedigetSpeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_RedigetSpelesMousePressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Rediģēt spēles");

        jLabel26.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\16x\\wrench-16.png")); // NOI18N

        javax.swing.GroupLayout button_RedigetSpelesLayout = new javax.swing.GroupLayout(button_RedigetSpeles);
        button_RedigetSpeles.setLayout(button_RedigetSpelesLayout);
        button_RedigetSpelesLayout.setHorizontalGroup(
            button_RedigetSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_RedigetSpelesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_RedigetSpelesLayout.setVerticalGroup(
            button_RedigetSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_RedigetSpelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_RedigetSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        button_PievienotSpeles.setBackground(new java.awt.Color(52, 152, 219));
        button_PievienotSpeles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_PievienotSpeles.setPreferredSize(new java.awt.Dimension(157, 50));
        button_PievienotSpeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_PievienotSpelesMousePressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Pievienot spēles");

        jLabel28.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\16x\\plus-4-16.png")); // NOI18N

        javax.swing.GroupLayout button_PievienotSpelesLayout = new javax.swing.GroupLayout(button_PievienotSpeles);
        button_PievienotSpeles.setLayout(button_PievienotSpelesLayout);
        button_PievienotSpelesLayout.setHorizontalGroup(
            button_PievienotSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_PievienotSpelesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_PievienotSpelesLayout.setVerticalGroup(
            button_PievienotSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_PievienotSpelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_PievienotSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        button_DzestSpeles.setBackground(new java.awt.Color(52, 152, 219));
        button_DzestSpeles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_DzestSpeles.setPreferredSize(new java.awt.Dimension(157, 50));
        button_DzestSpeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_DzestSpelesMousePressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Dzēst spēles");

        jLabel24.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\16x\\x-mark-3-16.png")); // NOI18N

        javax.swing.GroupLayout button_DzestSpelesLayout = new javax.swing.GroupLayout(button_DzestSpeles);
        button_DzestSpeles.setLayout(button_DzestSpelesLayout);
        button_DzestSpelesLayout.setHorizontalGroup(
            button_DzestSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_DzestSpelesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_DzestSpelesLayout.setVerticalGroup(
            button_DzestSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_DzestSpelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_DzestSpelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        button_MansProfils.setBackground(new java.awt.Color(52, 152, 219));
        button_MansProfils.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_MansProfils.setPreferredSize(new java.awt.Dimension(157, 50));
        button_MansProfils.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_MansProfilsMousePressed(evt);
            }
        });

        ind_MansProfils.setBackground(new java.awt.Color(255, 255, 255));
        ind_MansProfils.setOpaque(false);
        ind_MansProfils.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_MansProfilsLayout = new javax.swing.GroupLayout(ind_MansProfils);
        ind_MansProfils.setLayout(ind_MansProfilsLayout);
        ind_MansProfilsLayout.setHorizontalGroup(
            ind_MansProfilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_MansProfilsLayout.setVerticalGroup(
            ind_MansProfilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mans profils");

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\user-4-24.png")); // NOI18N

        javax.swing.GroupLayout button_MansProfilsLayout = new javax.swing.GroupLayout(button_MansProfils);
        button_MansProfils.setLayout(button_MansProfilsLayout);
        button_MansProfilsLayout.setHorizontalGroup(
            button_MansProfilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_MansProfilsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_MansProfils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_MansProfilsLayout.setVerticalGroup(
            button_MansProfilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_MansProfils, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_MansProfilsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_MansProfilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(button_MansProfilsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        button_Drizuma.setBackground(new java.awt.Color(52, 152, 219));
        button_Drizuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_Drizuma.setPreferredSize(new java.awt.Dimension(157, 50));
        button_Drizuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_DrizumaMousePressed(evt);
            }
        });

        ind_Drizuma.setBackground(new java.awt.Color(255, 255, 255));
        ind_Drizuma.setOpaque(false);
        ind_Drizuma.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_DrizumaLayout = new javax.swing.GroupLayout(ind_Drizuma);
        ind_Drizuma.setLayout(ind_DrizumaLayout);
        ind_DrizumaLayout.setHorizontalGroup(
            ind_DrizumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_DrizumaLayout.setVerticalGroup(
            ind_DrizumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Drīzumā");

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\plus-8-24.png")); // NOI18N

        javax.swing.GroupLayout button_DrizumaLayout = new javax.swing.GroupLayout(button_Drizuma);
        button_Drizuma.setLayout(button_DrizumaLayout);
        button_DrizumaLayout.setHorizontalGroup(
            button_DrizumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_DrizumaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_Drizuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_DrizumaLayout.setVerticalGroup(
            button_DrizumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_Drizuma, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_DrizumaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_DrizumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(button_DrizumaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel15)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        button_ProgrammasInfo.setBackground(new java.awt.Color(52, 152, 219));
        button_ProgrammasInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_ProgrammasInfo.setPreferredSize(new java.awt.Dimension(157, 50));
        button_ProgrammasInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_ProgrammasInfoMousePressed(evt);
            }
        });

        ind_ProgrammasInfo.setBackground(new java.awt.Color(255, 255, 255));
        ind_ProgrammasInfo.setOpaque(false);
        ind_ProgrammasInfo.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_ProgrammasInfoLayout = new javax.swing.GroupLayout(ind_ProgrammasInfo);
        ind_ProgrammasInfo.setLayout(ind_ProgrammasInfoLayout);
        ind_ProgrammasInfoLayout.setHorizontalGroup(
            ind_ProgrammasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_ProgrammasInfoLayout.setVerticalGroup(
            ind_ProgrammasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Programmas info");

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\info-24.png")); // NOI18N

        javax.swing.GroupLayout button_ProgrammasInfoLayout = new javax.swing.GroupLayout(button_ProgrammasInfo);
        button_ProgrammasInfo.setLayout(button_ProgrammasInfoLayout);
        button_ProgrammasInfoLayout.setHorizontalGroup(
            button_ProgrammasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_ProgrammasInfoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_ProgrammasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_ProgrammasInfoLayout.setVerticalGroup(
            button_ProgrammasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_ProgrammasInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_ProgrammasInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(button_ProgrammasInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button_exit.setBackground(new java.awt.Color(52, 73, 94));
        button_exit.setForeground(new java.awt.Color(230, 126, 34));
        button_exit.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\exit-24.png")); // NOI18N
        button_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Side_PanelLayout = new javax.swing.GroupLayout(Side_Panel);
        Side_Panel.setLayout(Side_PanelLayout);
        Side_PanelLayout.setHorizontalGroup(
            Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_SakumaEkrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_SpeletajuInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_MansProfils, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_Drizuma, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addGroup(Side_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(DFA_Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(button_exit)
                .addGap(25, 25, 25))
            .addComponent(button_ProgrammasInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_PievienotSpeletajus, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_RedigetSpeletajus, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_DzestSpeletajus, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_PievienotSpeles, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_RedigetSpeles, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_DzestSpeles, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_SpeluInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );
        Side_PanelLayout.setVerticalGroup(
            Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Side_PanelLayout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(button_SakumaEkrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_SpeletajuInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_PievienotSpeletajus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_RedigetSpeletajus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_DzestSpeletajus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_SpeluInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_PievienotSpeles, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_RedigetSpeles, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_DzestSpeles, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_MansProfils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Drizuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(button_ProgrammasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DFA_Logo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_exit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );

        SakumaEkrans_Panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout SakumaEkrans_PanelLayout = new javax.swing.GroupLayout(SakumaEkrans_Panel);
        SakumaEkrans_Panel.setLayout(SakumaEkrans_PanelLayout);
        SakumaEkrans_PanelLayout.setHorizontalGroup(
            SakumaEkrans_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2686, Short.MAX_VALUE)
        );
        SakumaEkrans_PanelLayout.setVerticalGroup(
            SakumaEkrans_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );

        SpeletajuInfo_Panel.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout SpeletajuInfo_PanelLayout = new javax.swing.GroupLayout(SpeletajuInfo_Panel);
        SpeletajuInfo_Panel.setLayout(SpeletajuInfo_PanelLayout);
        SpeletajuInfo_PanelLayout.setHorizontalGroup(
            SpeletajuInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2686, Short.MAX_VALUE)
        );
        SpeletajuInfo_PanelLayout.setVerticalGroup(
            SpeletajuInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );

        SpeletajuInfo_Pievienot_Panel.setBackground(new java.awt.Color(189, 195, 199));
        SpeletajuInfo_Pievienot_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        Table_Players_Add.setAutoCreateRowSorter(true);
        Table_Players_Add.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table_Players_Add.setForeground(new java.awt.Color(44, 62, 80));
        Table_Players_Add.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_Players_Add.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Table_Players_Add.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Table_Players_Add.setRowHeight(25);
        Table_Players_Add.setSelectionBackground(new java.awt.Color(46, 204, 113));
        Table_Players_Add.setSelectionForeground(new java.awt.Color(44, 62, 80));
        Table_Players_Add.setShowHorizontalLines(false);
        Table_Players_Add.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Table_Players_Add);

        jPanel2.setBackground(new java.awt.Color(127, 140, 141));
        jPanel2.setForeground(new java.awt.Color(60, 63, 65));

        lbl_bilde.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\Jerseys\\PSD\\default_jersey.png")); // NOI18N

        lbl_garums.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_garums.setForeground(new java.awt.Color(255, 255, 255));
        lbl_garums.setText("Garums (cm):");

        ind_uzvards.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        ComboBox_Komandas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        ComboBox_Komandas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        ComboBox_Komandas.setNextFocusableComponent(cmd_addPlayer_jersey);

        txt_gadi.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_gadi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_gadi.setForeground(new java.awt.Color(204, 255, 255));
        txt_gadi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_gadi.setBorder(null);
        txt_gadi.setOpaque(false);
        txt_gadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_gadiKeyTyped(evt);
            }
        });

        cmd_addPlayer_save.setBackground(new java.awt.Color(46, 204, 113));
        cmd_addPlayer_save.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        cmd_addPlayer_save.setForeground(new java.awt.Color(255, 255, 255));
        cmd_addPlayer_save.setText("Saglabāt");
        cmd_addPlayer_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_addPlayer_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_addPlayer_saveMousePressed(evt);
            }
        });
        cmd_addPlayer_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_addPlayer_saveActionPerformed(evt);
            }
        });

        txt_uzvards.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_uzvards.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_uzvards.setForeground(new java.awt.Color(204, 255, 255));
        txt_uzvards.setBorder(null);
        txt_uzvards.setNextFocusableComponent(txt_garums);
        txt_uzvards.setOpaque(false);
        txt_uzvards.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_uzvardsKeyTyped(evt);
            }
        });

        lbl_vards.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_vards.setForeground(new java.awt.Color(255, 255, 255));
        lbl_vards.setText("Vārds:");

        cmd_addPlayer_jersey.setBackground(new java.awt.Color(255, 255, 255));
        cmd_addPlayer_jersey.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        cmd_addPlayer_jersey.setForeground(new java.awt.Color(0, 0, 0));
        cmd_addPlayer_jersey.setText("Izvēlies failu");
        cmd_addPlayer_jersey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_addPlayer_jersey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_addPlayer_jerseyActionPerformed(evt);
            }
        });

        txt_svars.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_svars.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_svars.setForeground(new java.awt.Color(204, 255, 255));
        txt_svars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_svars.setBorder(null);
        txt_svars.setNextFocusableComponent(txt_gadi);
        txt_svars.setOpaque(false);
        txt_svars.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_svarsKeyTyped(evt);
            }
        });

        lbl_svars.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_svars.setForeground(new java.awt.Color(255, 255, 255));
        lbl_svars.setText("Svars (kg):");

        ind_vards.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        ind_garums.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_komanda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_komanda.setForeground(new java.awt.Color(255, 255, 255));
        lbl_komanda.setText("Komanda:");

        lbl_uzvards.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_uzvards.setForeground(new java.awt.Color(255, 255, 255));
        lbl_uzvards.setText("Uzvārds:");

        ind_svars.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        lbl_gadi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_gadi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gadi.setText("Gadi:");

        lbl_komandasKrekls.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_komandasKrekls.setForeground(new java.awt.Color(255, 255, 255));
        lbl_komandasKrekls.setText("Komandas krekls:");

        txt_garums.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_garums.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_garums.setForeground(new java.awt.Color(204, 255, 255));
        txt_garums.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_garums.setBorder(null);
        txt_garums.setNextFocusableComponent(txt_svars);
        txt_garums.setOpaque(false);
        txt_garums.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_garumsKeyTyped(evt);
            }
        });

        lbl_valsts.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl_valsts.setForeground(new java.awt.Color(255, 255, 255));
        lbl_valsts.setText("Valsts:");

        ind_gadi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        txt_vards.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_vards.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txt_vards.setForeground(new java.awt.Color(204, 255, 255));
        txt_vards.setBorder(null);
        txt_vards.setNextFocusableComponent(txt_uzvards);
        txt_vards.setOpaque(false);
        txt_vards.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_vardsKeyTyped(evt);
            }
        });

        ComboBox_Valstis.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        ComboBox_Valstis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        ComboBox_Valstis.setNextFocusableComponent(cmd_addPlayer_jersey);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(508, 508, 508)
                                .addComponent(lbl_gadi)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ind_gadi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_gadi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbl_uzvards)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_uzvards)
                                                    .addComponent(ind_uzvards, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbl_vards)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_vards)
                                                    .addComponent(ind_vards, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_valsts)
                                        .addGap(18, 18, 18)
                                        .addComponent(ComboBox_Valstis, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lbl_svars)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ind_svars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_svars, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_garums)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_garums)
                                            .addComponent(ind_garums, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_komanda)
                                            .addComponent(lbl_komandasKrekls))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmd_addPlayer_jersey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComboBox_Komandas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(cmd_addPlayer_save, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lbl_bilde, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_vards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_vards))
                                .addGap(1, 1, 1)
                                .addComponent(ind_vards))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_gadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_gadi))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ind_gadi)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_uzvards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_uzvards))
                        .addGap(1, 1, 1)
                        .addComponent(ind_uzvards))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_garums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_garums))
                        .addGap(1, 1, 1)
                        .addComponent(ind_garums)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_svars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_svars))
                        .addGap(1, 1, 1)
                        .addComponent(ind_svars)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_valsts)
                        .addComponent(ComboBox_Valstis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_komanda)
                            .addComponent(ComboBox_Komandas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_komandasKrekls)
                            .addComponent(cmd_addPlayer_jersey, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lbl_bilde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_addPlayer_save)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout SpeletajuInfo_Pievienot_PanelLayout = new javax.swing.GroupLayout(SpeletajuInfo_Pievienot_Panel);
        SpeletajuInfo_Pievienot_Panel.setLayout(SpeletajuInfo_Pievienot_PanelLayout);
        SpeletajuInfo_Pievienot_PanelLayout.setHorizontalGroup(
            SpeletajuInfo_Pievienot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpeletajuInfo_Pievienot_PanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(742, Short.MAX_VALUE))
        );
        SpeletajuInfo_Pievienot_PanelLayout.setVerticalGroup(
            SpeletajuInfo_Pievienot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpeletajuInfo_Pievienot_PanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(SpeletajuInfo_Pievienot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(404, Short.MAX_VALUE))
        );

        SpeletajuInfo_Rediget_Panel.setBackground(new java.awt.Color(255, 255, 204));
        SpeletajuInfo_Rediget_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        javax.swing.GroupLayout SpeletajuInfo_Rediget_PanelLayout = new javax.swing.GroupLayout(SpeletajuInfo_Rediget_Panel);
        SpeletajuInfo_Rediget_Panel.setLayout(SpeletajuInfo_Rediget_PanelLayout);
        SpeletajuInfo_Rediget_PanelLayout.setHorizontalGroup(
            SpeletajuInfo_Rediget_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2686, Short.MAX_VALUE)
        );
        SpeletajuInfo_Rediget_PanelLayout.setVerticalGroup(
            SpeletajuInfo_Rediget_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );

        SpeletajuInfo_Dzest_Panel.setBackground(new java.awt.Color(153, 153, 255));
        SpeletajuInfo_Dzest_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        javax.swing.GroupLayout SpeletajuInfo_Dzest_PanelLayout = new javax.swing.GroupLayout(SpeletajuInfo_Dzest_Panel);
        SpeletajuInfo_Dzest_Panel.setLayout(SpeletajuInfo_Dzest_PanelLayout);
        SpeletajuInfo_Dzest_PanelLayout.setHorizontalGroup(
            SpeletajuInfo_Dzest_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2686, Short.MAX_VALUE)
        );
        SpeletajuInfo_Dzest_PanelLayout.setVerticalGroup(
            SpeletajuInfo_Dzest_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );

        SpeluInfo_Panel.setBackground(new java.awt.Color(255, 153, 204));
        SpeluInfo_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        javax.swing.GroupLayout SpeluInfo_PanelLayout = new javax.swing.GroupLayout(SpeluInfo_Panel);
        SpeluInfo_Panel.setLayout(SpeluInfo_PanelLayout);
        SpeluInfo_PanelLayout.setHorizontalGroup(
            SpeluInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2686, Short.MAX_VALUE)
        );
        SpeluInfo_PanelLayout.setVerticalGroup(
            SpeluInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );

        SpeluInfo_Pievienot_Panel.setBackground(new java.awt.Color(255, 255, 153));
        SpeluInfo_Pievienot_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        javax.swing.GroupLayout SpeluInfo_Pievienot_PanelLayout = new javax.swing.GroupLayout(SpeluInfo_Pievienot_Panel);
        SpeluInfo_Pievienot_Panel.setLayout(SpeluInfo_Pievienot_PanelLayout);
        SpeluInfo_Pievienot_PanelLayout.setHorizontalGroup(
            SpeluInfo_Pievienot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2686, Short.MAX_VALUE)
        );
        SpeluInfo_Pievienot_PanelLayout.setVerticalGroup(
            SpeluInfo_Pievienot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );

        SpeluInfo_Rediget_Panel.setBackground(new java.awt.Color(102, 102, 255));
        SpeluInfo_Rediget_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        javax.swing.GroupLayout SpeluInfo_Rediget_PanelLayout = new javax.swing.GroupLayout(SpeluInfo_Rediget_Panel);
        SpeluInfo_Rediget_Panel.setLayout(SpeluInfo_Rediget_PanelLayout);
        SpeluInfo_Rediget_PanelLayout.setHorizontalGroup(
            SpeluInfo_Rediget_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2674, Short.MAX_VALUE)
        );
        SpeluInfo_Rediget_PanelLayout.setVerticalGroup(
            SpeluInfo_Rediget_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1323, Short.MAX_VALUE)
        );

        SpeluInfo_Dzest_Panel.setBackground(new java.awt.Color(255, 102, 204));
        SpeluInfo_Dzest_Panel.setPreferredSize(new java.awt.Dimension(2375, 1323));

        javax.swing.GroupLayout SpeluInfo_Dzest_PanelLayout = new javax.swing.GroupLayout(SpeluInfo_Dzest_Panel);
        SpeluInfo_Dzest_Panel.setLayout(SpeluInfo_Dzest_PanelLayout);
        SpeluInfo_Dzest_PanelLayout.setHorizontalGroup(
            SpeluInfo_Dzest_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2668, Short.MAX_VALUE)
        );
        SpeluInfo_Dzest_PanelLayout.setVerticalGroup(
            SpeluInfo_Dzest_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1317, Short.MAX_VALUE)
        );

        MansProfils_Panel.setBackground(new java.awt.Color(255, 255, 102));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Ienākt / Reģistrēties");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout MansProfils_PanelLayout = new javax.swing.GroupLayout(MansProfils_Panel);
        MansProfils_Panel.setLayout(MansProfils_PanelLayout);
        MansProfils_PanelLayout.setHorizontalGroup(
            MansProfils_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MansProfils_PanelLayout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1876, Short.MAX_VALUE))
        );
        MansProfils_PanelLayout.setVerticalGroup(
            MansProfils_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MansProfils_PanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1092, Short.MAX_VALUE))
        );

        Drizuma_Panel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Drizuma_PanelLayout = new javax.swing.GroupLayout(Drizuma_Panel);
        Drizuma_Panel.setLayout(Drizuma_PanelLayout);
        Drizuma_PanelLayout.setHorizontalGroup(
            Drizuma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2375, Short.MAX_VALUE)
        );
        Drizuma_PanelLayout.setVerticalGroup(
            Drizuma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1323, Short.MAX_VALUE)
        );

        ProgrammasInfo_Panel.setBackground(new java.awt.Color(52, 73, 94));

        Programm_Info.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\Programmas_info photoshop file.png")); // NOI18N

        NP_picture.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\36988094_2043389069065588_7157785130197581824_n1111.png")); // NOI18N

        jPanel1.setBackground(null);
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(null);

        Instagram_icon.setIcon(new javax.swing.ImageIcon("D:\\Users\\user\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\instagram (2).png")); // NOI18N
        Instagram_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Instagram_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Instagram_iconMousePressed(evt);
            }
        });
        jPanel1.add(Instagram_icon);
        Instagram_icon.setBounds(580, 400, 64, 64);

        Facebook_icon.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\facebook (2).png")); // NOI18N
        Facebook_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Facebook_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Facebook_iconMousePressed(evt);
            }
        });
        jPanel1.add(Facebook_icon);
        Facebook_icon.setBounds(510, 400, 64, 64);

        GitHub_icon.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\github (2).png")); // NOI18N
        GitHub_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GitHub_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GitHub_iconMousePressed(evt);
            }
        });
        jPanel1.add(GitHub_icon);
        GitHub_icon.setBounds(650, 400, 64, 64);

        jLabel2.setForeground(new java.awt.Color(60, 63, 65));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\Info par mani.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(6, 0, 736, 503);

        javax.swing.GroupLayout ProgrammasInfo_PanelLayout = new javax.swing.GroupLayout(ProgrammasInfo_Panel);
        ProgrammasInfo_Panel.setLayout(ProgrammasInfo_PanelLayout);
        ProgrammasInfo_PanelLayout.setHorizontalGroup(
            ProgrammasInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProgrammasInfo_PanelLayout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(ProgrammasInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Programm_Info)
                    .addGroup(ProgrammasInfo_PanelLayout.createSequentialGroup()
                        .addComponent(NP_picture)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        ProgrammasInfo_PanelLayout.setVerticalGroup(
            ProgrammasInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgrammasInfo_PanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(Programm_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProgrammasInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NP_picture)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(SakumaEkrans_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeletajuInfo_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeletajuInfo_Pievienot_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeletajuInfo_Rediget_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeletajuInfo_Dzest_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeluInfo_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeluInfo_Pievienot_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeluInfo_Rediget_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeluInfo_Dzest_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MansProfils_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Drizuma_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ProgrammasInfo_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SakumaEkrans_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MansProfils_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Drizuma_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ProgrammasInfo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Pievienot_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Rediget_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Dzest_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Pievienot_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Rediget_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Dzest_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 2686, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SakumaEkrans_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MansProfils_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Drizuma_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ProgrammasInfo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Pievienot_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Rediget_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeluInfo_Dzest_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Pievienot_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Rediget_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SpeletajuInfo_Dzest_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Background_PanelLayout = new javax.swing.GroupLayout(Background_Panel);
        Background_Panel.setLayout(Background_PanelLayout);
        Background_PanelLayout.setHorizontalGroup(
            Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_PanelLayout.createSequentialGroup()
                .addComponent(Side_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(WhiteBar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        Background_PanelLayout.setVerticalGroup(
            Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Side_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WhiteBar_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_SakumaEkransMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_SakumaEkransMousePressed

         SakumaEkrans_Panel.show();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	setColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(true);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_SakumaEkransMousePressed

    private void button_SpeletajuInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_SpeletajuInfoMousePressed

         SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.show();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         setColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(true);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_SpeletajuInfoMousePressed

    private void button_MansProfilsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_MansProfilsMousePressed

	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.show();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         setColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(true);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_MansProfilsMousePressed

    private void button_DrizumaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_DrizumaMousePressed

	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.show();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         setColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(true);
    }//GEN-LAST:event_button_DrizumaMousePressed

    private void button_ProgrammasInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_ProgrammasInfoMousePressed

	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.show();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         setColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(true);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_ProgrammasInfoMousePressed

    private void button_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_exitMousePressed
        this.dispose();
    }//GEN-LAST:event_button_exitMousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        Login_Form s = new Login_Form();		// Shows new Form - Player_info
        s.setVisible(true);
    }//GEN-LAST:event_jButton2MousePressed

    private void Instagram_iconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Instagram_iconMousePressed
        try
        {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/nawris_p/"));
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something wrong with URI link!");
        }
    }//GEN-LAST:event_Instagram_iconMousePressed

    private void Facebook_iconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Facebook_iconMousePressed
        try
        {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/nauris.putans.7"));
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something wrong with URI link!");
        }
    }//GEN-LAST:event_Facebook_iconMousePressed

    private void GitHub_iconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GitHub_iconMousePressed
        try
        {
            Desktop.getDesktop().browse(new URI("https://github.com/Nauris-Putans"));
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something wrong with URI link!");
        }
    }//GEN-LAST:event_GitHub_iconMousePressed

    private void button_PievienotSpeletajusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_PievienotSpeletajusMousePressed

	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.show();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         setColor(button_SpeletajuInfo);
		setColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(true);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
		 
	Player_Add_Update_table();
	FillComboCountry();
	FillComboTeams();
    }//GEN-LAST:event_button_PievienotSpeletajusMousePressed

    private void button_RedigetSpeletajusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_RedigetSpeletajusMousePressed
	
	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.show();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         setColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		setColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(true);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_RedigetSpeletajusMousePressed

    private void button_DzestSpeletajusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_DzestSpeletajusMousePressed
     
	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.show();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         setColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		setColor(button_DzestSpeletajus);
         resetColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(true);
	ind_SpeluInfo.setOpaque(false);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_DzestSpeletajusMousePressed

    private void button_SpeluInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_SpeluInfoMousePressed
        
	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.show();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         setColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(true);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_SpeluInfoMousePressed

    private void button_DzestSpelesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_DzestSpelesMousePressed
        
	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.show();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         setColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		setColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(true);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_DzestSpelesMousePressed

    private void button_RedigetSpelesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_RedigetSpelesMousePressed
        
	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.hide();
		SpeluInfo_Rediget_Panel.show();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         setColor(button_SpeluInfo);
		resetColor(button_PievienotSpeles);
		setColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(true);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_RedigetSpelesMousePressed

    private void button_PievienotSpelesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_PievienotSpelesMousePressed
        
	SakumaEkrans_Panel.hide();
         SpeletajuInfo_Panel.hide();
		SpeletajuInfo_Pievienot_Panel.hide();
		SpeletajuInfo_Rediget_Panel.hide();
		SpeletajuInfo_Dzest_Panel.hide();
	SpeluInfo_Panel.hide();
		SpeluInfo_Pievienot_Panel.show();
		SpeluInfo_Rediget_Panel.hide();
		SpeluInfo_Dzest_Panel.hide();
         MansProfils_Panel.hide();
         Drizuma_Panel.hide();
         ProgrammasInfo_Panel.hide();
	
	resetColor(button_SakumaEkrans);
         resetColor(button_SpeletajuInfo);
		resetColor(button_PievienotSpeletajus);
		resetColor(button_RedigetSpeletajus);
		resetColor(button_DzestSpeletajus);
         setColor(button_SpeluInfo);
		setColor(button_PievienotSpeles);
		resetColor(button_RedigetSpeles);
		resetColor(button_DzestSpeles);
         resetColor(button_MansProfils);
         resetColor(button_Drizuma);
         resetColor(button_ProgrammasInfo);

         // Indicators

         ind_SakumaEkrans.setOpaque(false);
         ind_SpeletajuInfo.setOpaque(false);
	ind_SpeluInfo.setOpaque(true);
         ind_MansProfils.setOpaque(false);
	ind_ProgrammasInfo.setOpaque(false);
         ind_Drizuma.setOpaque(false);
    }//GEN-LAST:event_button_PievienotSpelesMousePressed

    private void txt_svarsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_svarsKeyTyped
         if(!(Character.isDigit(evt.getKeyChar()))){
		evt.consume();
         }
	
	else if(txt_svars.getText().length()>=3) 
	{  
		evt.consume();
	}
    }//GEN-LAST:event_txt_svarsKeyTyped

    private void txt_garumsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_garumsKeyTyped
         if(!(Character.isDigit(evt.getKeyChar()))){
		evt.consume();
         }
	
	else if(txt_garums.getText().length()>=3) 
	{  
		evt.consume();
	}
    }//GEN-LAST:event_txt_garumsKeyTyped

    private void txt_gadiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gadiKeyTyped
         if(!(Character.isDigit(evt.getKeyChar()))){
		evt.consume();
         }
	
	else if(txt_gadi.getText().length()>=2) 
	{  
		evt.consume();
	}
    }//GEN-LAST:event_txt_gadiKeyTyped

    private void txt_uzvardsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_uzvardsKeyTyped
         if(!(Character.isLetter(evt.getKeyChar()))){
		evt.consume();
         }
	
	else if(txt_uzvards.getText().length()>=18) 
	{  
		evt.consume();
	}
    }//GEN-LAST:event_txt_uzvardsKeyTyped

    private void txt_vardsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_vardsKeyTyped
         if(!(Character.isLetter(evt.getKeyChar()))){
		evt.consume();
         }
	
	else if(txt_vards.getText().length()>=18) 
	{  
		evt.consume();
	}
    }//GEN-LAST:event_txt_vardsKeyTyped

    private void cmd_addPlayer_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_addPlayer_saveActionPerformed
	
	String Vards = txt_vards.getText();
	String Uzvards = txt_uzvards.getText();	
	String Gadi = txt_gadi.getText();
	String Garums = txt_garums.getText();
	String Svars = txt_svars.getText();
	String Valsts = ComboBox_Valstis.getSelectedItem().toString();
	String Komanda = ComboBox_Komandas.getSelectedItem().toString();
	
	if (Vards.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno vārdu");
	}
	
	else if (Uzvards.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno uzvārdu");
	}
	
	else if (Garums.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno garumu");
	}
	
	else if (Integer.valueOf(Garums) < 140 || Integer.valueOf(Garums) > 230)
	{
		JOptionPane.showMessageDialog(null, "Garums nav pieņemams");
	}
	
	else if (Svars.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno svaru");
	}
	
	else if (Integer.valueOf(Svars) < 60 || Integer.valueOf(Svars) > 150)
	{
		JOptionPane.showMessageDialog(null, "Svars nav pieņemams");
	}
	
	else if (Gadi.equals(""))
	{
		JOptionPane.showMessageDialog(null, "Pievieno gadus");
	}
	
	else if (Integer.valueOf(Gadi) < 1 || Integer.valueOf(Gadi) > 90)
	{
		JOptionPane.showMessageDialog(null, "Gadi nav pieņemami");
	}
	
	else if (Komanda.equals("")) 
	{
		JOptionPane.showMessageDialog(null, "Pievieno komandu");
	}
	
	else {
		
		String sql = "insert into dfa.speletaji (Vards, Uzvards, Gadi, Garums_cm, Svars_kg, Valsts_nosaukums, Komanda, Komandas_krekls)" + " values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			pst = conn.prepareStatement(sql);
			
			InputStream Bilde = new FileInputStream(new File(k));
		
			pst.setString(1, Vards);
			pst.setString(2, Uzvards);
			pst.setString(3, Gadi);
			pst.setString(4, Garums);
			pst.setString(5, Svars);
			pst.setString(6, Valsts);
			pst.setString(7, Komanda);
			pst.setBlob(8, Bilde);
			
			if(pst.executeUpdate() > 0) {
				
				txt_vards.setText("");
				txt_uzvards.setText("");
				txt_gadi.setText("");
				txt_garums.setText("");
				txt_svars.setText("");
				ComboBox_Valstis.setSelectedIndex(0);
				ComboBox_Komandas.setSelectedIndex(0);
				lbl_bilde.setIcon(ResizeImage("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\Jerseys\\PSD\\default_jersey.png"));
				
				JOptionPane.showMessageDialog(null, "Spēlētājs " + Vards + " " + Uzvards + " ir pievienots!");
				Player_Add_Update_table();
			}
		}

		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Kautkas nav pareizi sql syntaxe");
			System.out.println("SQLException: " + ex.getMessage());
		}
		
		finally {
			try { rs.close(); } catch (Exception e) { /* ignored */ }
			try { pst.close(); } catch (Exception e) { /* ignored */ }
			try { conn.close(); } catch (Exception e) { /* ignored */ }
		}
	}
    }//GEN-LAST:event_cmd_addPlayer_saveActionPerformed

    private void cmd_addPlayer_jerseyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_addPlayer_jerseyActionPerformed

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("D:\\Users\\user\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\Jerseys"));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
		fileChooser.addChoosableFileFilter(filter);
		int result = fileChooser.showSaveDialog(null);
			
		if(result == JFileChooser.APPROVE_OPTION)
		{
			File selectedFile = fileChooser.getSelectedFile();
			String path = selectedFile.getAbsolutePath();
			lbl_bilde.setIcon(ResizeImage(path));
			k = path;
		}
			
		else if(result == JFileChooser.CANCEL_OPTION)
		{
			System.out.println("No Data");
		}
 
    }//GEN-LAST:event_cmd_addPlayer_jerseyActionPerformed

    private void cmd_addPlayer_saveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_addPlayer_saveMousePressed

    }//GEN-LAST:event_cmd_addPlayer_saveMousePressed

	public ImageIcon ResizeImage(String imgPath){
			ImageIcon MyImage = new ImageIcon(imgPath);
			Image img = MyImage.getImage();
			Image newImage = img.getScaledInstance(lbl_bilde.getWidth(), lbl_bilde.getHeight(),Image.SCALE_SMOOTH);
			ImageIcon image = new ImageIcon(newImage);
			return image;
	}
	
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
			java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Admin_Form().setVisible(true);
			}
		});
	}
	
	void setColor(JPanel panel) {
		panel.setBackground(new Color(86,65,118));
	}
	
	void resetColor(JPanel panel) {
		panel.setBackground(new Color(52,152,219));
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Panel;
    public javax.swing.JComboBox<String> ComboBox_Komandas;
    public javax.swing.JComboBox<String> ComboBox_Valstis;
    private javax.swing.JLabel DFA_Logo;
    public javax.swing.JPanel Drizuma_Panel;
    private javax.swing.JLabel Facebook_icon;
    private javax.swing.JLabel GitHub_icon;
    private javax.swing.JLabel Instagram_icon;
    public javax.swing.JPanel MansProfils_Panel;
    private javax.swing.JLabel NP_picture;
    private javax.swing.JLabel Programm_Info;
    public javax.swing.JPanel ProgrammasInfo_Panel;
    public javax.swing.JPanel SakumaEkrans_Panel;
    private javax.swing.JPanel Side_Panel;
    public javax.swing.JPanel SpeletajuInfo_Dzest_Panel;
    public javax.swing.JPanel SpeletajuInfo_Panel;
    public javax.swing.JPanel SpeletajuInfo_Pievienot_Panel;
    public javax.swing.JPanel SpeletajuInfo_Rediget_Panel;
    public javax.swing.JPanel SpeluInfo_Dzest_Panel;
    public javax.swing.JPanel SpeluInfo_Panel;
    public javax.swing.JPanel SpeluInfo_Pievienot_Panel;
    public javax.swing.JPanel SpeluInfo_Rediget_Panel;
    public javax.swing.JTable Table_Players_Add;
    private javax.swing.JPanel WhiteBar_Panel;
    private javax.swing.JPanel button_Drizuma;
    private javax.swing.JPanel button_DzestSpeles;
    private javax.swing.JPanel button_DzestSpeletajus;
    private javax.swing.JPanel button_MansProfils;
    private javax.swing.JPanel button_PievienotSpeles;
    private javax.swing.JPanel button_PievienotSpeletajus;
    private javax.swing.JPanel button_ProgrammasInfo;
    private javax.swing.JPanel button_RedigetSpeles;
    private javax.swing.JPanel button_RedigetSpeletajus;
    private javax.swing.JPanel button_SakumaEkrans;
    private javax.swing.JPanel button_SpeletajuInfo;
    private javax.swing.JPanel button_SpeluInfo;
    private javax.swing.JButton button_exit;
    public javax.swing.JButton cmd_addPlayer_jersey;
    public javax.swing.JButton cmd_addPlayer_save;
    private javax.swing.JPanel ind_Drizuma;
    private javax.swing.JPanel ind_MansProfils;
    private javax.swing.JPanel ind_ProgrammasInfo;
    private javax.swing.JPanel ind_SakumaEkrans;
    private javax.swing.JPanel ind_SpeletajuInfo;
    private javax.swing.JPanel ind_SpeluInfo;
    private javax.swing.JLabel ind_gadi;
    private javax.swing.JLabel ind_garums;
    private javax.swing.JLabel ind_svars;
    private javax.swing.JLabel ind_uzvards;
    private javax.swing.JLabel ind_vards;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_bilde;
    private javax.swing.JLabel lbl_gadi;
    private javax.swing.JLabel lbl_garums;
    private javax.swing.JLabel lbl_komanda;
    private javax.swing.JLabel lbl_komandasKrekls;
    private javax.swing.JLabel lbl_svars;
    private javax.swing.JLabel lbl_uzvards;
    private javax.swing.JLabel lbl_valsts;
    private javax.swing.JLabel lbl_vards;
    public javax.swing.JTextField txt_gadi;
    public javax.swing.JTextField txt_garums;
    public javax.swing.JTextField txt_svars;
    public javax.swing.JTextField txt_uzvards;
    public javax.swing.JTextField txt_vards;
    // End of variables declaration//GEN-END:variables
}
