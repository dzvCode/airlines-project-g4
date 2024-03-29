package com.g4.view;

public class frmLogin extends javax.swing.JFrame {    
    public int mouseX, mouseY;
    
    public frmLogin() {
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

        bgPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JPanel();
        handsawnombre = new javax.swing.JLabel();
        lblMap = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAdminUser = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCode = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        pfPassword = new javax.swing.JPasswordField();
        loginPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        exitPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(0, 153, 153));

        handsawnombre.setFont(new java.awt.Font("Roboto Medium", 3, 24)); // NOI18N
        handsawnombre.setForeground(new java.awt.Color(255, 255, 255));
        handsawnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        handsawnombre.setText("Handsaw ETS Airlines");

        javax.swing.GroupLayout lblTitleLayout = new javax.swing.GroupLayout(lblTitle);
        lblTitle.setLayout(lblTitleLayout);
        lblTitleLayout.setHorizontalGroup(
            lblTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(handsawnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        lblTitleLayout.setVerticalGroup(
            lblTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(handsawnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bgPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        lblMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/map.png"))); // NOI18N
        bgPanel.add(lblMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, 560));

        lblLogin.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 22, 59));
        lblLogin.setText("INICIAR SESION");
        bgPanel.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/adminImg.png"))); // NOI18N
        bgPanel.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 201));

        lblPassword.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("C O N T R A S E Ñ A");
        bgPanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 220, -1));

        lblAdminUser.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblAdminUser.setForeground(new java.awt.Color(51, 51, 51));
        lblAdminUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminUser.setText("U S U A R I O");
        bgPanel.add(lblAdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 220, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        bgPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 220, 20));

        txtCode.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(102, 102, 102));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode.setText("Ingrese su nombre de usuario");
        txtCode.setBorder(null);
        bgPanel.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 220, 20));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        bgPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 220, 20));

        pfPassword.setForeground(new java.awt.Color(102, 102, 102));
        pfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pfPassword.setText("******************");
        pfPassword.setBorder(null);
        bgPanel.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 220, -1));

        loginPanel.setBackground(new java.awt.Color(0, 22, 59));
        loginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLogin.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("I N G R E S A R");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bgPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 150, -1));

        titlePanel.setBackground(new java.awt.Color(0, 22, 59));

        exitPanel.setBackground(new java.awt.Color(0, 22, 59));

        btnExit.setBackground(new java.awt.Color(0, 22, 59));
        btnExit.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addGap(0, 860, Short.MAX_VALUE)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    public javax.swing.JLabel btnExit;
    public javax.swing.JLabel btnLogin;
    public javax.swing.JPanel exitPanel;
    private javax.swing.JLabel handsawnombre;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAdminUser;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel lblTitle;
    private javax.swing.JLabel lblUser;
    public javax.swing.JPanel loginPanel;
    public javax.swing.JPasswordField pfPassword;
    public javax.swing.JPanel titlePanel;
    public javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}