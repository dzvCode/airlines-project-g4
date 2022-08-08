package com.g4.view;

public class frmTicket extends javax.swing.JFrame {

    /**
     * Creates new form frmTicket
     */
    public frmTicket() {
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

        originPanel1 = new javax.swing.JPanel();
        lblOrigin1 = new javax.swing.JLabel();
        bgPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        graphPanel = new javax.swing.JPanel();
        lblGraph = new javax.swing.JLabel();
        returnPanel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        lblOriginTitle = new javax.swing.JLabel();
        lblPriceTitle = new javax.swing.JLabel();
        lblDestinationTitle = new javax.swing.JLabel();
        originPanel = new javax.swing.JPanel();
        txtOriginSelected = new javax.swing.JLabel();
        pricePanel = new javax.swing.JPanel();
        lblSolesSymbol = new javax.swing.JLabel();
        txtPriceSoles = new javax.swing.JLabel();
        lblRouteTitle = new javax.swing.JLabel();
        routePanel = new javax.swing.JPanel();
        txtRouteCalculated = new javax.swing.JLabel();
        destinationPanel = new javax.swing.JPanel();
        txtDestinationSelected = new javax.swing.JLabel();
        lblDistanceTitle = new javax.swing.JLabel();
        distancePanel = new javax.swing.JPanel();
        lblKm = new javax.swing.JLabel();
        txtDistance = new javax.swing.JLabel();
        lblPricePerKmInfo = new javax.swing.JLabel();
        confirmPanel = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        originPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblOrigin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrigin1.setText("Lima");

        javax.swing.GroupLayout originPanel1Layout = new javax.swing.GroupLayout(originPanel1);
        originPanel1.setLayout(originPanel1Layout);
        originPanel1Layout.setHorizontalGroup(
            originPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, originPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblOrigin1)
                .addGap(53, 53, 53))
        );
        originPanel1Layout.setVerticalGroup(
            originPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(originPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrigin1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setPreferredSize(new java.awt.Dimension(902, 658));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(0, 0, 102));
        titlePanel.setPreferredSize(new java.awt.Dimension(902, 40));

        btnClose.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(866, 866, 866))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        graphPanel.setBackground(new java.awt.Color(242, 250, 250));

        lblGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/graph.png"))); // NOI18N

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblGraph)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bgPanel.add(graphPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 440, 620));

        returnPanel.setBackground(new java.awt.Color(153, 186, 186));
        returnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnReturn.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturn.setText("REGRESAR");

        javax.swing.GroupLayout returnPanelLayout = new javax.swing.GroupLayout(returnPanel);
        returnPanel.setLayout(returnPanelLayout);
        returnPanelLayout.setHorizontalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        bgPanel.add(returnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        infoPanel.setBackground(new java.awt.Color(249, 237, 243));

        lblOriginTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblOriginTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblOriginTitle.setText("Origen");

        lblPriceTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblPriceTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblPriceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPriceTitle.setText("Precio del boleto");

        lblDestinationTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblDestinationTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblDestinationTitle.setText("Destino");

        originPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtOriginSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOriginSelected.setText("Lima");

        javax.swing.GroupLayout originPanelLayout = new javax.swing.GroupLayout(originPanel);
        originPanel.setLayout(originPanelLayout);
        originPanelLayout.setHorizontalGroup(
            originPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(originPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOriginSelected, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        originPanelLayout.setVerticalGroup(
            originPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(originPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOriginSelected)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pricePanel.setBackground(new java.awt.Color(255, 255, 255));

        lblSolesSymbol.setBackground(new java.awt.Color(0, 0, 0));
        lblSolesSymbol.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lblSolesSymbol.setForeground(new java.awt.Color(70, 70, 70));
        lblSolesSymbol.setText("S/");

        txtPriceSoles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPriceSoles.setText("100");

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pricePanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblSolesSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPriceSoles, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblSolesSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPriceSoles, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblRouteTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblRouteTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblRouteTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRouteTitle.setText("Ruta");

        routePanel.setBackground(new java.awt.Color(255, 255, 255));

        txtRouteCalculated.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRouteCalculated.setText("Ruta");

        javax.swing.GroupLayout routePanelLayout = new javax.swing.GroupLayout(routePanel);
        routePanel.setLayout(routePanelLayout);
        routePanelLayout.setHorizontalGroup(
            routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRouteCalculated, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );
        routePanelLayout.setVerticalGroup(
            routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRouteCalculated, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        destinationPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtDestinationSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDestinationSelected.setText("Destino");

        javax.swing.GroupLayout destinationPanelLayout = new javax.swing.GroupLayout(destinationPanel);
        destinationPanel.setLayout(destinationPanelLayout);
        destinationPanelLayout.setHorizontalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDestinationSelected, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        destinationPanelLayout.setVerticalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDestinationSelected)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDistanceTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblDistanceTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblDistanceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistanceTitle.setText("Recorrido minimo");

        distancePanel.setBackground(new java.awt.Color(255, 255, 255));

        lblKm.setBackground(new java.awt.Color(0, 0, 0));
        lblKm.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lblKm.setForeground(new java.awt.Color(70, 70, 70));
        lblKm.setText("Km");

        txtDistance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDistance.setText("100");

        javax.swing.GroupLayout distancePanelLayout = new javax.swing.GroupLayout(distancePanel);
        distancePanel.setLayout(distancePanelLayout);
        distancePanelLayout.setHorizontalGroup(
            distancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distancePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        distancePanelLayout.setVerticalGroup(
            distancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblKm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblPricePerKmInfo.setText("* precio/km:  ");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblOriginTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDestinationTitle)
                        .addGap(94, 94, 94))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(routePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(originPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(destinationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRouteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDistanceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(distancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPricePerKmInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPriceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(lblOriginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(originPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(lblDestinationTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destinationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblRouteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(routePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPriceTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDistanceTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(distancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(lblPricePerKmInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        bgPanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 420, 380));

        confirmPanel.setBackground(new java.awt.Color(0, 153, 153));
        confirmPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnConfirm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfirm.setText("CONFIRMAR");

        javax.swing.GroupLayout confirmPanelLayout = new javax.swing.GroupLayout(confirmPanel);
        confirmPanel.setLayout(confirmPanelLayout);
        confirmPanelLayout.setHorizontalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        confirmPanelLayout.setVerticalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        bgPanel.add(confirmPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, -1, -1));

        lblTitle.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("TRAYECTO");
        bgPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 350, -1));

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    public javax.swing.JLabel btnClose;
    public javax.swing.JLabel btnConfirm;
    public javax.swing.JLabel btnReturn;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JPanel destinationPanel;
    private javax.swing.JPanel distancePanel;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel lblDestinationTitle;
    private javax.swing.JLabel lblDistanceTitle;
    private javax.swing.JLabel lblGraph;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblOrigin1;
    private javax.swing.JLabel lblOriginTitle;
    public javax.swing.JLabel lblPricePerKmInfo;
    private javax.swing.JLabel lblPriceTitle;
    private javax.swing.JLabel lblRouteTitle;
    private javax.swing.JLabel lblSolesSymbol;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel originPanel;
    private javax.swing.JPanel originPanel1;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JPanel routePanel;
    public javax.swing.JPanel titlePanel;
    public javax.swing.JLabel txtDestinationSelected;
    public javax.swing.JLabel txtDistance;
    public javax.swing.JLabel txtOriginSelected;
    public javax.swing.JLabel txtPriceSoles;
    public javax.swing.JLabel txtRouteCalculated;
    // End of variables declaration//GEN-END:variables
}