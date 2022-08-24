package com.g4.controller;

import com.g4.model.entity.User;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmFindClient;
import com.g4.view.frmTicket;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;


public class FindClientController implements MouseListener, MouseMotionListener {
    public static frmFindClient findClientView;
    public static frmTicket ticketView;
    
    public FindClientController(frmFindClient findClientView) {
        this.findClientView = findClientView;
        this.findClientView.btnFindById.addMouseListener(this);
        this.findClientView.btnCancel.addMouseListener(this);
        this.findClientView.btnExit.addMouseListener(this);
        this.findClientView.exitPanel.addMouseListener(this);
        this.findClientView.titlePanel.addMouseListener(this);
        this.findClientView.titlePanel.addMouseMotionListener(this);
    }
    
    public void init() {
        findClientView.setLocationRelativeTo(null);
    }
    
    public void goToTicket(User user) {
        ticketView = new frmTicket();
        ticketView.setVisible(true);
        ticketView.setLocationRelativeTo(null);
        ticketView.txtId.setText(String.valueOf(user.getId()));
        ticketView.txtName.setText(user.getName());
        ticketView.txtOrigin.setText(user.getOrigin());
        ticketView.txtDestination.setText(user.getDestination());
        ticketView.txtDepartureDate.setText(user.getDepartureDate());
    }
    
    public void findById() {
        UserDAO userC = new UserDAO();
        User user = new User();
        user.setDni(findClientView.txtDni.getText());
        userC.findById(user);
        if (user.getName() != null) {
            findClientView.dispose();
            goToTicket(user);
        } else {
            JOptionPane.showMessageDialog(findClientView, "No se encontro registro", "Intente otra vez", JOptionPane.ERROR_MESSAGE);
        }
    }  

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == findClientView.btnCancel) {
            findClientView.dispose();
        }
        
        if (e.getSource() == findClientView.btnFindById) {
            findById();
        }
        
        if (e.getSource() == findClientView.btnExit) {
            findClientView.dispose();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == findClientView.titlePanel) {
            findClientView.mouseX = e.getX();
            findClientView.mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == findClientView.btnExit) {
            findClientView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == findClientView.btnExit) {
            findClientView.exitPanel.setBackground(new Color(0, 22, 59));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == findClientView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            findClientView.setLocation(x - findClientView.mouseX, y - findClientView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}