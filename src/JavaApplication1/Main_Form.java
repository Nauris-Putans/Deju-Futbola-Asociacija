package JavaApplication1;

//---------------Imports---------------//

import static JavaApplication1.javaConnect.DB_URL;
import static JavaApplication1.javaConnect.PASS;
import static JavaApplication1.javaConnect.USER;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

//----------------------------------------//

public class Main_Form extends javax.swing.JFrame {
		
	Connection conn=null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	public Main_Form() {	// Creates new form Main_Form
		initComponents();
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);	    // Sets the JFrame to maximize by default on opening
		Table_Players.setDefaultEditor(Object.class, null);	// Disables edit in table
		Table_Players.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
		Table_Players.getTableHeader().setOpaque(false);
		Table_Players.getTableHeader().setBackground(Color.blue);
		Table_Players.getTableHeader().setForeground(new Color(255, 255, 255));
		Table_Players.setRowHeight(25);
		
		this.setLocationRelativeTo(null);
		
		try 
		{	
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} 
		
		catch (SQLException ex) 
		{
			Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		Update_table();	
	}
	
private void Update_table() {
	
	String insert = "select * from speletaji";
	
	try {
		pst = conn.prepareStatement(insert);   
		rs = pst.executeQuery();
		Table_Players.setModel(DbUtils.resultSetToTableModel(rs));
	}
	
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
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
        button_Administrators = new javax.swing.JPanel();
        ind_Administrators = new javax.swing.JPanel();
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        SakumaEkrans_Panel = new javax.swing.JPanel();
        SpeletajuInfo_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Players = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

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

        Side_Panel.setBackground(new java.awt.Color(230, 126, 34));

        DFA_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DFA_Logo.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\DFA_Logo.png")); // NOI18N
        DFA_Logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DFA_Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_SakumaEkrans.setBackground(new java.awt.Color(230, 126, 34));
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

        button_SpeletajuInfo.setBackground(new java.awt.Color(230, 126, 34));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        button_Administrators.setBackground(new java.awt.Color(230, 126, 34));
        button_Administrators.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_Administrators.setPreferredSize(new java.awt.Dimension(157, 50));
        button_Administrators.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_AdministratorsMousePressed(evt);
            }
        });

        ind_Administrators.setBackground(new java.awt.Color(255, 255, 255));
        ind_Administrators.setOpaque(false);
        ind_Administrators.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout ind_AdministratorsLayout = new javax.swing.GroupLayout(ind_Administrators);
        ind_Administrators.setLayout(ind_AdministratorsLayout);
        ind_AdministratorsLayout.setHorizontalGroup(
            ind_AdministratorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind_AdministratorsLayout.setVerticalGroup(
            ind_AdministratorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Administrātors");

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\administrator-2-24.png")); // NOI18N

        javax.swing.GroupLayout button_AdministratorsLayout = new javax.swing.GroupLayout(button_Administrators);
        button_Administrators.setLayout(button_AdministratorsLayout);
        button_AdministratorsLayout.setHorizontalGroup(
            button_AdministratorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_AdministratorsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ind_Administrators, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button_AdministratorsLayout.setVerticalGroup(
            button_AdministratorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_Administrators, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(button_AdministratorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_AdministratorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(button_AdministratorsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        button_Drizuma.setBackground(new java.awt.Color(230, 126, 34));
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

        button_ProgrammasInfo.setBackground(new java.awt.Color(230, 126, 34));
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

        javax.swing.GroupLayout Side_PanelLayout = new javax.swing.GroupLayout(Side_Panel);
        Side_Panel.setLayout(Side_PanelLayout);
        Side_PanelLayout.setHorizontalGroup(
            Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_SakumaEkrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_SpeletajuInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_Administrators, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_Drizuma, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addComponent(button_ProgrammasInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
            .addGroup(Side_PanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(DFA_Logo)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        Side_PanelLayout.setVerticalGroup(
            Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Side_PanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(button_SakumaEkrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_SpeletajuInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Administrators, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Drizuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(button_ProgrammasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                .addComponent(DFA_Logo)
                .addGap(24, 24, 24))
        );

        SakumaEkrans_Panel.setBackground(new java.awt.Color(153, 0, 255));

        javax.swing.GroupLayout SakumaEkrans_PanelLayout = new javax.swing.GroupLayout(SakumaEkrans_Panel);
        SakumaEkrans_Panel.setLayout(SakumaEkrans_PanelLayout);
        SakumaEkrans_PanelLayout.setHorizontalGroup(
            SakumaEkrans_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2156, Short.MAX_VALUE)
        );
        SakumaEkrans_PanelLayout.setVerticalGroup(
            SakumaEkrans_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1311, Short.MAX_VALUE)
        );

        SpeletajuInfo_Panel.setBackground(new java.awt.Color(51, 255, 102));

        Table_Players.setAutoCreateRowSorter(true);
        Table_Players.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table_Players.setForeground(new java.awt.Color(44, 62, 80));
        Table_Players.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Players.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Table_Players.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Table_Players.setRowHeight(25);
        Table_Players.setSelectionBackground(new java.awt.Color(46, 204, 113));
        Table_Players.setSelectionForeground(new java.awt.Color(44, 62, 80));
        Table_Players.setShowHorizontalLines(false);
        Table_Players.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table_Players);
        Table_Players.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout SpeletajuInfo_PanelLayout = new javax.swing.GroupLayout(SpeletajuInfo_Panel);
        SpeletajuInfo_Panel.setLayout(SpeletajuInfo_PanelLayout);
        SpeletajuInfo_PanelLayout.setHorizontalGroup(
            SpeletajuInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpeletajuInfo_PanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1287, Short.MAX_VALUE))
        );
        SpeletajuInfo_PanelLayout.setVerticalGroup(
            SpeletajuInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpeletajuInfo_PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(SakumaEkrans_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SpeletajuInfo_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SpeletajuInfo_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SakumaEkrans_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpeletajuInfo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SakumaEkrans_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(WhiteBar_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1311, Short.MAX_VALUE)
            .addGroup(Background_PanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
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
		
	setColor(button_SakumaEkrans);
		resetColor(button_SpeletajuInfo);
			resetColor(button_Administrators);
				resetColor(button_Drizuma);
					resetColor(button_ProgrammasInfo);
				
				// Indicators
				
				ind_Drizuma.setOpaque(false);
				ind_SakumaEkrans.setOpaque(true);
				ind_SpeletajuInfo.setOpaque(false);
				ind_Administrators.setOpaque(false);
				ind_ProgrammasInfo.setOpaque(false);
    }//GEN-LAST:event_button_SakumaEkransMousePressed

    private void button_SpeletajuInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_SpeletajuInfoMousePressed
        
	SakumaEkrans_Panel.hide();
	SpeletajuInfo_Panel.show();
		
	setColor(button_SpeletajuInfo);
		resetColor(button_SakumaEkrans);
			resetColor(button_Administrators);
				resetColor(button_Drizuma);
					resetColor(button_ProgrammasInfo);
				
				// Indicators
				
				ind_Drizuma.setOpaque(false);
				ind_SakumaEkrans.setOpaque(false);
				ind_SpeletajuInfo.setOpaque(true);
				ind_Administrators.setOpaque(false);
				ind_ProgrammasInfo.setOpaque(false);
    }//GEN-LAST:event_button_SpeletajuInfoMousePressed

    private void button_AdministratorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AdministratorsMousePressed
         setColor(button_Administrators);
		resetColor(button_SakumaEkrans);
			resetColor(button_SpeletajuInfo);
				resetColor(button_Drizuma);
					resetColor(button_ProgrammasInfo);
				
				// Indicators
				
				ind_Drizuma.setOpaque(false);
				ind_SakumaEkrans.setOpaque(false);
				ind_SpeletajuInfo.setOpaque(false);
				ind_Administrators.setOpaque(true);
				ind_ProgrammasInfo.setOpaque(false);
    }//GEN-LAST:event_button_AdministratorsMousePressed

    private void button_DrizumaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_DrizumaMousePressed
         setColor(button_Drizuma);
		resetColor(button_SakumaEkrans);
			resetColor(button_SpeletajuInfo);
				resetColor(button_Administrators);
					resetColor(button_ProgrammasInfo);
				
				// Indicators
				
				ind_Drizuma.setOpaque(true);
				ind_SakumaEkrans.setOpaque(false);
				ind_SpeletajuInfo.setOpaque(false);
				ind_Administrators.setOpaque(false);
				ind_ProgrammasInfo.setOpaque(false);
    }//GEN-LAST:event_button_DrizumaMousePressed

    private void button_ProgrammasInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_ProgrammasInfoMousePressed
         setColor(button_ProgrammasInfo);
		resetColor(button_SakumaEkrans);
			resetColor(button_SpeletajuInfo);
				resetColor(button_Administrators);
					resetColor(button_Drizuma);
				
				// Indicators
				
				ind_Drizuma.setOpaque(false);
				ind_SakumaEkrans.setOpaque(false);
				ind_SpeletajuInfo.setOpaque(false);
				ind_Administrators.setOpaque(false);
				ind_ProgrammasInfo.setOpaque(true);
				
    }//GEN-LAST:event_button_ProgrammasInfoMousePressed

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
			java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main_Form().setVisible(true);
				
			}
		});
	}

	void setColor(JPanel panel) {
		panel.setBackground(new Color(86,65,118));
	}
	
	void resetColor(JPanel panel) {
		panel.setBackground(new Color(230,126,34));
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Panel;
    private javax.swing.JLabel DFA_Logo;
    private javax.swing.JPanel SakumaEkrans_Panel;
    private javax.swing.JPanel Side_Panel;
    public javax.swing.JPanel SpeletajuInfo_Panel;
    public javax.swing.JTable Table_Players;
    private javax.swing.JPanel WhiteBar_Panel;
    private javax.swing.JPanel button_Administrators;
    private javax.swing.JPanel button_Drizuma;
    private javax.swing.JPanel button_ProgrammasInfo;
    private javax.swing.JPanel button_SakumaEkrans;
    private javax.swing.JPanel button_SpeletajuInfo;
    private javax.swing.JPanel ind_Administrators;
    private javax.swing.JPanel ind_Drizuma;
    private javax.swing.JPanel ind_ProgrammasInfo;
    private javax.swing.JPanel ind_SakumaEkrans;
    private javax.swing.JPanel ind_SpeletajuInfo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
