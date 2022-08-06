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

        backgroundPanel = new javax.swing.JPanel();
        panelTitlebar = new javax.swing.JPanel();
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
        lblOrigin = new javax.swing.JLabel();
        destinationPanel = new javax.swing.JPanel();
        lblDestinationSelected = new javax.swing.JLabel();
        pricePanel = new javax.swing.JPanel();
        lblSolesSymbol = new javax.swing.JLabel();
        lblPriceSoles = new javax.swing.JLabel();
        confirmPanel = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(902, 658));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitlebar.setBackground(new java.awt.Color(0, 0, 102));
        panelTitlebar.setPreferredSize(new java.awt.Dimension(902, 40));

        btnClose.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");

        javax.swing.GroupLayout panelTitlebarLayout = new javax.swing.GroupLayout(panelTitlebar);
        panelTitlebar.setLayout(panelTitlebarLayout);
        panelTitlebarLayout.setHorizontalGroup(
            panelTitlebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelTitlebarLayout.setVerticalGroup(
            panelTitlebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        backgroundPanel.add(panelTitlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        graphPanel.setBackground(new java.awt.Color(242, 250, 250));

        lblGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/graphImg.jpeg"))); // NOI18N

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(lblGraph)
                .addGap(48, 48, 48))
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGraph)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        backgroundPanel.add(graphPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 710, 280));

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
            .addGroup(returnPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnPanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backgroundPanel.add(returnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, -1));

        infoPanel.setBackground(new java.awt.Color(249, 237, 243));

        lblOriginTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblOriginTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblOriginTitle.setText("Origen");

        lblPriceTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblPriceTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblPriceTitle.setText("Precio del boleto");

        lblDestinationTitle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblDestinationTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblDestinationTitle.setText("Destino");

        originPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblOrigin.setText("Lima");

        javax.swing.GroupLayout originPanelLayout = new javax.swing.GroupLayout(originPanel);
        originPanel.setLayout(originPanelLayout);
        originPanelLayout.setHorizontalGroup(
            originPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, originPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblOrigin)
                .addGap(53, 53, 53))
        );
        originPanelLayout.setVerticalGroup(
            originPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(originPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrigin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        destinationPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblDestinationSelected.setText("Destino");

        javax.swing.GroupLayout destinationPanelLayout = new javax.swing.GroupLayout(destinationPanel);
        destinationPanel.setLayout(destinationPanelLayout);
        destinationPanelLayout.setHorizontalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblDestinationSelected)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        destinationPanelLayout.setVerticalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDestinationSelected)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pricePanel.setBackground(new java.awt.Color(255, 255, 255));

        lblSolesSymbol.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        lblSolesSymbol.setForeground(new java.awt.Color(70, 70, 70));
        lblSolesSymbol.setText("S/");

        lblPriceSoles.setText("100");

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSolesSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPriceSoles)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblSolesSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(lblPriceSoles))
        );

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblOriginTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDestinationTitle)
                .addGap(134, 134, 134))
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(originPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(destinationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPriceTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOriginTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestinationTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(destinationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(originPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPriceTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        backgroundPanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 690, 150));

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
            .addGroup(confirmPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        confirmPanelLayout.setVerticalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmPanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backgroundPanel.add(confirmPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, -1, -1));

        lblTitle.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(41, 29, 124));
        lblTitle.setText("R E C O R R I D O");
        backgroundPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    public javax.swing.JLabel btnClose;
    public javax.swing.JLabel btnConfirm;
    public javax.swing.JLabel btnReturn;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JPanel destinationPanel;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JPanel infoPanel;
    public javax.swing.JLabel lblDestinationSelected;
    private javax.swing.JLabel lblDestinationTitle;
    private javax.swing.JLabel lblGraph;
    private javax.swing.JLabel lblOrigin;
    private javax.swing.JLabel lblOriginTitle;
    public javax.swing.JLabel lblPriceSoles;
    private javax.swing.JLabel lblPriceTitle;
    private javax.swing.JLabel lblSolesSymbol;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel originPanel;
    public javax.swing.JPanel panelTitlebar;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JPanel returnPanel;
    // End of variables declaration//GEN-END:variables
}