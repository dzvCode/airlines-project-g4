package com.g4.view;

import com.g4.model.entity.MyQueue;
import javax.swing.table.DefaultTableModel;

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

        modelo.addColumn("Cliente");
        
        this.tblClients.setModel(modelo);

        tblClients.getTableHeader().setReorderingAllowed(false);
        tblClients.setRowHeight(30);
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
        queueLabel = new javax.swing.JLabel();
        scrollClients = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        addPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JLabel();
        servePanel = new javax.swing.JPanel();
        btnServe = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        dequeuePanel = new javax.swing.JPanel();
        btnDequeue = new javax.swing.JLabel();
        btnReturn = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        exitPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        cont = new javax.swing.JLabel();
        capacity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        queueLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        queueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        queueLabel.setText("COLA DE CLIENTES");
        bgPanel.add(queueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 540, -1));

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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
            tblClients.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        bgPanel.add(scrollClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 470, 250));

        addPanel.setBackground(new java.awt.Color(0, 22, 59));
        addPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdd.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setText("Añadir");
        btnAdd.setToolTipText("");

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

        bgPanel.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

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
            .addComponent(btnServe, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        servePanelLayout.setVerticalGroup(
            servePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnServe, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgPanel.add(servePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/queueImg.png"))); // NOI18N
        bgPanel.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 280, 630));

        dequeuePanel.setBackground(new java.awt.Color(255, 0, 0));
        dequeuePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDequeue.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        btnDequeue.setForeground(new java.awt.Color(255, 255, 255));
        btnDequeue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDequeue.setText("X");

        javax.swing.GroupLayout dequeuePanelLayout = new javax.swing.GroupLayout(dequeuePanel);
        dequeuePanel.setLayout(dequeuePanelLayout);
        dequeuePanelLayout.setHorizontalGroup(
            dequeuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dequeuePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dequeuePanelLayout.setVerticalGroup(
            dequeuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dequeuePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgPanel.add(dequeuePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 20, 20));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/g4/view/images/return.png"))); // NOI18N
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgPanel.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, 30));

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

        txtAdmin.setBackground(new java.awt.Color(204, 255, 204));
        txtAdmin.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        txtAdmin.setForeground(new java.awt.Color(0, 0, 0));
        txtAdmin.setText("Admin");
        txtAdmin.setToolTipText("");
        txtAdmin.setRequestFocusEnabled(false);
        bgPanel.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 340, -1));

        lblAdmin.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(0, 0, 0));
        lblAdmin.setText("Administrador:");
        bgPanel.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, -1));

        cont.setText("Cont:");
        bgPanel.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        capacity.setText("Capacidad:");
        bgPanel.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public javax.swing.JLabel btnDequeue;
    public javax.swing.JLabel btnExit;
    public javax.swing.JLabel btnReturn;
    public javax.swing.JLabel btnServe;
    public javax.swing.JLabel capacity;
    public javax.swing.JLabel cont;
    private javax.swing.JPanel dequeuePanel;
    public javax.swing.JPanel exitPanel;
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