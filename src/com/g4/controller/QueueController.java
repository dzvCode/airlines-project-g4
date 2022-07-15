package com.g4.controller;

import com.g4.model.entity.MyQueue;
import com.g4.view.frmQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class QueueController implements MouseListener, MouseMotionListener {
    
    private frmQueue queueView;

    public QueueController(frmQueue queueView) {
        this.queueView = queueView;
        this.queueView.txtAdmin.setText(LoginController.admin.getName());
        this.queueView.btnExit.addMouseListener(this);
        this.queueView.titlePanel.addMouseListener(this);
        this.queueView.titlePanel.addMouseMotionListener(this);
    }
        
    public void init() {
        //queueView.setTitle("Cola");
        queueView.setLocationRelativeTo(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
       if (e.getSource() == queueView.btnExit) {
           System.exit(0);
       }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == queueView.titlePanel) {
            queueView.mouseX = e.getX();
            queueView.mouseY = e.getY();
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
        if (e.getSource() == queueView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            queueView.setLocation(x - queueView.mouseX, y - queueView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}