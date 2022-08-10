package com.g4.view;
  
import java.util.Date;

public class frmDestination extends javax.swing.JFrame {

    public frmDestination() {
        initComponents();
        Date currentDate = new Date();
        jDateChooser.setMinSelectableDate(currentDate);
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
        lblTitle = new javax.swing.JLabel();
        lblCityImg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblOrigin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblDepartureDate = new javax.swing.JLabel();
        boxOrigin = new javax.swing.JComboBox<>();
        returnPanel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JLabel();
        continuePanel = new javax.swing.JPanel();
        btnContinue = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        titlePanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        boxDestination = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("DESTINOS NACIONALES");
        bgPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblCityImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/destinationImg.jpg"))); // NOI18N
        bgPanel.add(lblCityImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 350, 630));
        bgPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 470, 10));

        lblOrigin.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblOrigin.setForeground(new java.awt.Color(0, 0, 0));
        lblOrigin.setText("Seleccionar Origen:");
        bgPanel.add(lblOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        bgPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 470, 10));

        lblDepartureDate.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblDepartureDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartureDate.setText("Fecha Ida:");
        bgPanel.add(lblDepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        boxOrigin.setBackground(new java.awt.Color(255, 255, 255));
        boxOrigin.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        boxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Origen", "Lima", "Tumbes", "Iquitos", "Piura", "Cajamarca", "Trujillo", "Tarapoto", "Pucallpa", "Puerto Maldonado", "Ayacucho", "Cuzco", "Arequipa", "Juliaca", "Tacna" }));
        boxOrigin.setToolTipText("");
        boxOrigin.setBorder(null);
        boxOrigin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgPanel.add(boxOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 300, 40));

        returnPanel.setBackground(new java.awt.Color(0, 22, 59));
        returnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnReturn.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturn.setText("Regresar");

        javax.swing.GroupLayout returnPanelLayout = new javax.swing.GroupLayout(returnPanel);
        returnPanel.setLayout(returnPanelLayout);
        returnPanelLayout.setHorizontalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bgPanel.add(returnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        continuePanel.setBackground(new java.awt.Color(0, 22, 59));
        continuePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnContinue.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContinue.setText("Continuar");

        javax.swing.GroupLayout continuePanelLayout = new javax.swing.GroupLayout(continuePanel);
        continuePanel.setLayout(continuePanelLayout);
        continuePanelLayout.setHorizontalGroup(
            continuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnContinue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        continuePanelLayout.setVerticalGroup(
            continuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnContinue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bgPanel.add(continuePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));
        bgPanel.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 300, 40));

        titlePanel.setBackground(new java.awt.Color(0, 22, 59));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addGap(0, 875, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        lblDestination.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblDestination.setForeground(new java.awt.Color(0, 0, 0));
        lblDestination.setText("Seleccionar Destino:");
        bgPanel.add(lblDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        boxDestination.setBackground(new java.awt.Color(255, 255, 255));
        boxDestination.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        boxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Destino", "Lima", "Tumbes", "Iquitos", "Piura", "Cajamarca", "Trujillo", "Tarapoto", "Pucallpa", "Puerto Maldonado", "Ayacucho", "Cuzco", "Arequipa", "Juliaca", "Tacna" }));
        boxDestination.setToolTipText("");
        boxDestination.setBorder(null);
        boxDestination.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgPanel.add(boxDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 300, 40));
        bgPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 470, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    public javax.swing.JComboBox<String> boxDestination;
    public javax.swing.JComboBox<String> boxOrigin;
    public javax.swing.JLabel btnContinue;
    public javax.swing.JLabel btnExit;
    public javax.swing.JLabel btnReturn;
    private javax.swing.JPanel continuePanel;
    public com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCityImg;
    private javax.swing.JLabel lblDepartureDate;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblOrigin;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel returnPanel;
    public javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}