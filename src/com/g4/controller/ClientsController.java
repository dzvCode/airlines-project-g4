package com.g4.controller;

import com.g4.view.frmClients;
import com.g4.view.frmQueue;
import com.g4.view.frmStart;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ClientsController implements MouseListener, MouseMotionListener  {
    public static frmClients clientsView;
    
    public ClientsController (frmClients clientsView) {
        this.clientsView = clientsView;
        this.clientsView.btnExit.addMouseListener(this);
        this.clientsView.titlePanel.addMouseListener(this);
        this.clientsView.titlePanel.addMouseMotionListener(this);
        this.clientsView.btnReturn.addMouseListener(this);
    }

    public void init() {
        clientsView.setLocationRelativeTo(null);
        clientsView.txtAdmin.setText(LoginController.admin.getName());
    }
    
    public void goToStartView() {
        clientsView.dispose();
        frmStart fs = new frmStart();
        StartController sc = new StartController(fs);
        sc.init();
        fs.setVisible(true); 
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == clientsView.btnReturn) {
            goToStartView();
        }
        
        if (e.getSource() == clientsView.btnExit) {
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == clientsView.titlePanel) {
            clientsView.mouseX = e.getX();
            clientsView.mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == clientsView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            clientsView.setLocation(x - clientsView.mouseX, y - clientsView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
   }
}