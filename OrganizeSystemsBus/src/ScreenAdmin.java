import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ScreenAdmin extends JFrame {
	private JPanel backgroundPanel;
	private JPanel menuPanel;
	private JPanel topInfoPanel;
	private JPanel contentPanel;
	private JLabel UsernameLbl;
	private JButton closeBtn;
	private JButton minimizeBtn;
	private JLabel explorerLbl;
	private JPanel branchesBtnPanel;
	private JLabel iconLbl;
	private JLabel textLbl;
	private JButton branchBtn;
	private JButton employeesBtn;
	
	private Server server;
	private User user;
	
	public ScreenAdmin(User user) {
		this.user = user;
	}
	
	public void createGUI() {
		server = new Server();
		
		initComponents();
		CreateEvents();

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setSize(dim.width - 200, dim.height - 100);
		this.setLocation(dim.width/2-this.getSize().width/2, 10);
		this.setTitle("Admin System Screen");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.setMinimumSize(new java.awt.Dimension(800, 700));
		this.setVisible(true);
		//this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	
	private void initComponents() {

		backgroundPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        branchBtn = new javax.swing.JButton();
        employeesBtn = new javax.swing.JButton();
        topInfoPanel = new javax.swing.JPanel();
        UsernameLbl = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        minimizeBtn = new javax.swing.JButton();
        explorerLbl = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setUndecorated(false);
        
        menuPanel.setBackground(new java.awt.Color(75, 74, 103));
        menuPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 3, 3, new java.awt.Color(102, 102, 102)));

        branchBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        //branchBtn.setIcon(new ImageIcon(getClass().getResource("images/icons8_globe_32px.png"))); // NOI18N
        branchBtn.setText("Branches");
        branchBtn.setBackground(new Color(240, 240, 240));
        branchBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(240, 240, 240)));
        branchBtn.setBorderPainted(false);
        branchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        branchBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        branchBtn.setFocusPainted(false);
        branchBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        branchBtn.setIconTextGap(10);
        branchBtn.setPreferredSize(new java.awt.Dimension(117, 32));

        employeesBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        //employeesBtn.setIcon(new ImageIcon(getClass().getResource("./images/icons8_person_32px.png"))); // NOI18N
        employeesBtn.setText("Employees");
        employeesBtn.setBackground(new Color(240, 240, 240));
        employeesBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(240, 240, 240)));
        employeesBtn.setBorderPainted(false);
        employeesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeesBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        employeesBtn.setFocusPainted(false);
        employeesBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employeesBtn.setIconTextGap(10);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addComponent(branchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(branchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topInfoPanel.setBackground(new java.awt.Color(247, 243, 246));
        topInfoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(102, 0, 0)));

        UsernameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameLbl.setText("User : ");

        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(51, 51, 51));
        closeBtn.setText("x");
        closeBtn.setContentAreaFilled(false);

        minimizeBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        minimizeBtn.setForeground(new java.awt.Color(51, 51, 51));
        minimizeBtn.setText("-");
        minimizeBtn.setContentAreaFilled(false);

        explorerLbl.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        explorerLbl.setText("Explorer/");
        explorerLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        explorerLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout topInfoPanelLayout = new javax.swing.GroupLayout(topInfoPanel);
        topInfoPanel.setLayout(topInfoPanelLayout);
        topInfoPanelLayout.setHorizontalGroup(
            topInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topInfoPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(explorerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 705, Short.MAX_VALUE)
                .addComponent(minimizeBtn)
                .addGap(0, 0, 0)
                .addComponent(closeBtn))
            .addGroup(topInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        topInfoPanelLayout.setVerticalGroup(
            topInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topInfoPanelLayout.createSequentialGroup()
                .addGroup(topInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(explorerLbl))
                    .addGroup(topInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(minimizeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(UsernameLbl)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(126, 137, 135));
        contentPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 3, 3, new java.awt.Color(75, 74, 103)));
        contentPanel.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(topInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
	
	private void CreateEvents() {
		
		minimizeBtn.addActionListener(e -> {
			setState(JFrame.ICONIFIED);
		});
		closeBtn.addActionListener(e -> {
			System.exit(0);
		});
	}
}
