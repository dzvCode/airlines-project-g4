package com.g4.view;

import com.g4.model.entity.MyQueue;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmQueue extends javax.swing.JFrame {
    public int mouseX, mouseY;
    public static DefaultTableModel modelo;
    
    public frmQueue() {
        initComponents();
        
        this.setResizable(false);
       
        modelo = new DefaultTableModel() {
            @Override
            //Sobreescribiendo método para que no sean editados los datos
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("Nombre");
        
        this.tblClients.setModel(modelo);
       
        //Método para que no se pueda editar la tabla
        tblClients.getTableHeader().setReorderingAllowed(false);

        //Método para establecer un alto a cada casilla
        tblClients.setRowHeight(30);
        /*
        TableColumnModel columnModel = tblClients.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(50);
        */
        CargaDeDatos();
        tblClients.setRowSelectionAllowed(false);
        tblClients.setCellSelectionEnabled(false);

        //Método que ingresa la tabla al scrollPanel
        scrollClients.setViewportView(tblClients);
    }
    
    public void CargaDeDatos() {
        for (Object[] object : MyQueue.upload()) {
            modelo.addRow(object);
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

        bgPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        queueLabel = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        scrollClients = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        addPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JLabel();
        servePanel = new javax.swing.JPanel();
        btnServe = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(0, 22, 59));
        titlePanel.setPreferredSize(new java.awt.Dimension(100, 34));

        btnExit.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
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

        bgPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        queueLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        queueLabel.setText("COLA DE CLIENTES");
        bgPanel.add(queueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblAdmin.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblAdmin.setText("Administrador:");
        bgPanel.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 120, -1));

        txtAdmin.setBackground(new java.awt.Color(204, 255, 204));
        txtAdmin.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        txtAdmin.setToolTipText("");
        bgPanel.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 155, 350, 30));

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ticket", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClients.setPreferredSize(new java.awt.Dimension(200, 250));
        tblClients.setRowHeight(30);
        scrollClients.setViewportView(tblClients);
        if (tblClients.getColumnModel().getColumnCount() > 0) {
            tblClients.getColumnModel().getColumn(0).setResizable(false);
            tblClients.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblClients.getColumnModel().getColumn(1).setResizable(false);
            tblClients.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        bgPanel.add(scrollClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 470, 230));

        addPanel.setBackground(new java.awt.Color(0, 22, 59));
        addPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdd.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setText("Añadir");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        bgPanel.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));

        servePanel.setBackground(new java.awt.Color(0, 22, 59));
        servePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnServe.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        btnServe.setForeground(new java.awt.Color(255, 255, 255));
        btnServe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnServe.setText("Atender");

        javax.swing.GroupLayout servePanelLayout = new javax.swing.GroupLayout(servePanel);
        servePanel.setLayout(servePanelLayout);
        servePanelLayout.setHorizontalGroup(
            servePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnServe, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        servePanelLayout.setVerticalGroup(
            servePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnServe, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        bgPanel.add(servePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/imgcola1.png"))); // NOI18N
        bgPanel.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 28, -1, 650));

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
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel bgPanel;
    public javax.swing.JLabel btnAdd;
    public javax.swing.JLabel btnExit;
    public javax.swing.JLabel btnServe;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel queueLabel;
    public javax.swing.JScrollPane scrollClients;
    private javax.swing.JPanel servePanel;
    public javax.swing.JTable tblClients;
    public javax.swing.JPanel titlePanel;
    public javax.swing.JLabel txtAdmin;
    // End of variables declaration//GEN-END:variables
}
