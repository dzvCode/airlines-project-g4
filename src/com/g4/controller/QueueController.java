package com.g4.controller;

import com.g4.model.entity.MyQueue;
import com.g4.model.entity.User;
import com.g4.view.frmDestination;
import com.g4.view.frmQueue;
import com.g4.view.frmRegistration;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;

public class QueueController implements MouseListener, MouseMotionListener {
    
    public static frmQueue queueView;

    public QueueController(frmQueue queueView) {
        this.queueView = queueView;
        this.queueView.btnExit.addMouseListener(this);
        this.queueView.titlePanel.addMouseListener(this);
        this.queueView.titlePanel.addMouseMotionListener(this);
        this.queueView.btnAdd.addMouseListener(this);
        this.queueView.btnServe.addMouseListener(this);
        this.queueView.btnDequeue.addMouseListener(this);
    }
        
    public void init() {
        queueView.setLocationRelativeTo(null);
        this.queueView.txtAdmin.setText(LoginController.admin.getName());
    }
    
    public void goToUserView() {
        queueView.dispose();
        User user = new User();
        frmRegistration fr = new frmRegistration();
        RegistrationController uc = new RegistrationController(user, fr);
        uc.init();
        fr.setVisible(true);
    }
    
    public void goToDestinationView() {
        queueView.dispose();
        frmDestination fd = new frmDestination();
        DestinationController dc = new DestinationController(fd);
        dc.init();
        fd.setVisible(true);
    }

    public void goToQueueView() {
        queueView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true); 
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
       if (e.getSource() == queueView.btnExit) {
           System.exit(0);
       }
       
       if (e.getSource() == queueView.btnAdd) {
           if (MyQueue.counter > MyQueue.capacity) {
               JOptionPane.showMessageDialog(null, "La cola esta llena");
           } else {
               goToUserView();
           }
       }
       
       if (e.getSource() == queueView.btnServe) {
           if (MyQueue.counter == 0) {
               JOptionPane.showMessageDialog(null, "Cola vacia");
           } else {
               goToDestinationView();
           }
       }
       
       if (e.getSource() == queueView.btnDequeue) {
           if(MyQueue.front != null) {
               MyQueue.dequeue();
               goToQueueView();
           } else {
               JOptionPane.showMessageDialog(null, "Cola vacia");
           }           
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