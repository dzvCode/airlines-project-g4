package com.g4.controller;

import com.g4.view.frmClients;
import com.g4.view.frmQueue;
import com.g4.view.frmStart;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class StartController implements MouseListener, MouseMotionListener {
    public static frmStart startView;
    
      public StartController (frmStart startView) {
        this.startView = startView;
        this.startView.btnExit.addMouseListener(this);
        this.startView.titlePanel.addMouseListener(this);
        this.startView.titlePanel.addMouseMotionListener(this);
        this.startView.btnGoToQueue.addMouseListener(this);
        this.startView.btnGoToDatabase.addMouseListener(this);
    }
      
    public void init() {
        startView.setLocationRelativeTo(null);
        this.startView.txtAdmin.setText(LoginController.admin.getName());
    } 
    
    public void goToQueueView() {
        startView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true);   
    }
     
    public void goToClients() {
        startView.dispose();
        frmClients fc = new frmClients();
        ClientsController cc = new ClientsController(fc);
        cc.init();
        fc.setVisible(true);   
    }
      
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == startView.btnGoToQueue) {
            goToQueueView();
        }
        
        if (e.getSource() == startView.btnGoToDatabase) {
            goToClients();
        }
        
        if (e.getSource() == startView.btnExit) {
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == startView.titlePanel) {
            startView.mouseX = e.getX();
            startView.mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == startView.btnExit) {
            startView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == startView.btnExit) {
            startView.exitPanel.setBackground(new Color(0, 22, 59));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == startView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            startView.setLocation(x - startView.mouseX, y - startView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
