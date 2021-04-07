
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Billy
 */
public class AdminNetbeans extends javax.swing.JFrame {

    /**
     * Creates new form AdminNetbeans
     */
    public AdminNetbeans() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 700));

        menuPanel.setBackground(new java.awt.Color(75, 74, 103));
        menuPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(102, 102, 102)));

        branchBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        branchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_globe_32px.png"))); // NOI18N
        branchBtn.setText("Branches");
        branchBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(240, 240, 240)));
        branchBtn.setBorderPainted(false);
        branchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        branchBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        branchBtn.setFocusPainted(false);
        branchBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        branchBtn.setIconTextGap(10);
        branchBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        branchBtn.setPreferredSize(new java.awt.Dimension(117, 32));
        branchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                branchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                branchBtnMouseExited(evt);
            }
        });
        branchBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                branchBtnKeyPressed(evt);
            }
        });

        employeesBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        employeesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_person_32px.png"))); // NOI18N
        employeesBtn.setText("Employees");
        employeesBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(240, 240, 240)));
        employeesBtn.setBorderPainted(false);
        employeesBtn.setFocusPainted(false);
        employeesBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employeesBtn.setIconTextGap(10);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(branchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
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
        explorerLbl.setText("explorer/");
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
    }// </editor-fold>//GEN-END:initComponents

    private void branchBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchBtnKeyPressed
        System.out.println("Hey");
    }//GEN-LAST:event_branchBtnKeyPressed

    private void branchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchBtnMouseExited
        Component c = evt.getComponent();
        c.setBackground(new Color(241, 241, 241));
    }//GEN-LAST:event_branchBtnMouseExited

    private void branchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchBtnMouseEntered
        Component c = evt.getComponent();
        c.setBackground(new Color(236, 252, 250));
        c.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_branchBtnMouseEntered

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
            java.util.logging.Logger.getLogger(AdminNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminNetbeans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsernameLbl;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton branchBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton employeesBtn;
    private javax.swing.JLabel explorerLbl;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JPanel topInfoPanel;
    // End of variables declaration//GEN-END:variables
}
