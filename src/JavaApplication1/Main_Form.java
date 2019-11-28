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
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Players = new javax.swing.JTable();
        Side_Panel = new javax.swing.JPanel();
        DFA_Logo = new javax.swing.JLabel();
        WhiteBar_Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background_Panel.setBackground(new java.awt.Color(52, 73, 94));

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

        Side_Panel.setBackground(new java.awt.Color(230, 126, 34));

        DFA_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DFA_Logo.setIcon(new javax.swing.ImageIcon("D:\\Users\\User\\Documents\\NetBeansProjects\\JavaApplication1\\images for project\\DFA_Logo.png")); // NOI18N
        DFA_Logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DFA_Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Side_PanelLayout = new javax.swing.GroupLayout(Side_Panel);
        Side_Panel.setLayout(Side_PanelLayout);
        Side_PanelLayout.setHorizontalGroup(
            Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Side_PanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(DFA_Logo)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        Side_PanelLayout.setVerticalGroup(
            Side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Side_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DFA_Logo)
                .addGap(21, 21, 21))
        );

        WhiteBar_Panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout WhiteBar_PanelLayout = new javax.swing.GroupLayout(WhiteBar_Panel);
        WhiteBar_Panel.setLayout(WhiteBar_PanelLayout);
        WhiteBar_PanelLayout.setHorizontalGroup(
            WhiteBar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        WhiteBar_PanelLayout.setVerticalGroup(
            WhiteBar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Background_PanelLayout = new javax.swing.GroupLayout(Background_Panel);
        Background_Panel.setLayout(Background_PanelLayout);
        Background_PanelLayout.setHorizontalGroup(
            Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_PanelLayout.createSequentialGroup()
                .addComponent(Side_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(WhiteBar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(Background_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );
        Background_PanelLayout.setVerticalGroup(
            Background_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_PanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 788, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(Side_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WhiteBar_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Panel;
    private javax.swing.JLabel DFA_Logo;
    private javax.swing.JPanel Side_Panel;
    public javax.swing.JTable Table_Players;
    private javax.swing.JPanel WhiteBar_Panel;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
