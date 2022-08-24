package com.g4.controller;

import com.g4.model.entity.MyQueue;
import com.g4.model.entity.User;
import com.g4.view.frmDestination;
import com.g4.view.frmQueue;
import com.g4.view.frmRegistration;
import com.g4.view.frmStart;
import java.awt.Color;
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
        this.queueView.btnReturn.addMouseListener(this);
        this.queueView.cont.setText("En cola: " + String.valueOf(MyQueue.counter));
        this.queueView.capacity.setText("Capacidad: " + String.valueOf(MyQueue.capacity + 1));
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
    
    public void goToStartView() {
        queueView.dispose();
        frmStart fs = new frmStart();
        StartController sc = new StartController(fs);
        sc.init();
        fs.setVisible(true); 
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
       if (e.getSource() == queueView.btnExit) {
           goToStartView();
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
       
       if (e.getSource() == queueView.btnReturn) {
           goToStartView();
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
        if (e.getSource() == queueView.btnExit) {
            queueView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == queueView.btnExit) {
            queueView.exitPanel.setBackground(new Color(0, 22, 59));
        }
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