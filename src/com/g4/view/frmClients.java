package com.g4.view;

import javax.swing.table.DefaultTableModel;

public class frmClients extends javax.swing.JFrame {

    public static DefaultTableModel modelo;
    /**
     * Creates new form frmClients
     */
    public frmClients() {
        initComponents();
        
        this.setResizable(false);
        
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Origen");
        modelo.addColumn("Destino");
        modelo.addColumn("Fecha de vuelo");
        
        this.tblClients.setModel(modelo);
        
        //Método para que no se pueda editar la tabla
        tblClients.getTableHeader().setReorderingAllowed(false);

        //Método para establecer un alto a cada casilla
        tblClients.setRowHeight(30);
        
        tblClients.setRowSelectionAllowed(false);
        tblClients.setCellSelectionEnabled(false);

        //Método que ingresa la tabla al scrollPanel
        scrollClients.setViewportView(tblClients);
        
            
    }
    
    public void update() {
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        scrollClients = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        btnReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(0, 22, 59));
        titlePanel.setPreferredSize(new java.awt.Dimension(100, 34));

        btnExit.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("  X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        lblTitle.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Tickets Generados");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblAdmin.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(0, 0, 0));
        lblAdmin.setText("Administrador:");
        jPanel1.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, -1));

        txtAdmin.setBackground(new java.awt.Color(204, 255, 204));
        txtAdmin.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        txtAdmin.setForeground(new java.awt.Color(0, 0, 0));
        txtAdmin.setText("Jeremy Smith Machare Ramirez");
        txtAdmin.setToolTipText("");
        jPanel1.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 420, -1));

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "DNI", "Telefono", "Email", "Origen", "Destino", "Fecha de Vuelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClients.setPreferredSize(new java.awt.Dimension(200, 250));
        tblClients.setRowHeight(30);
        scrollClients.setViewportView(tblClients);

        jPanel1.add(scrollClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 850, 290));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/return.png"))); // NOI18N
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnExit;
    public javax.swing.JLabel btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JScrollPane scrollClients;
    public javax.swing.JTable tblClients;
    public javax.swing.JPanel titlePanel;
    public javax.swing.JLabel txtAdmin;
    // End of variables declaration//GEN-END:variables
}