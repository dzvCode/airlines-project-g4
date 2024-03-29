package com.g4.controller;

import com.g4.model.entity.MyQueue;
import com.g4.model.entity.User;
import com.g4.view.frmQueue;
import com.g4.view.frmRegistration;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class RegistrationController implements MouseListener, MouseMotionListener {
    private User user;
    private frmRegistration registerView;

    public RegistrationController(User user, frmRegistration registerView) {
        this.user = user;
        this.registerView = registerView;
        this.registerView.txtName.addMouseListener(this);
        this.registerView.txtDni.addMouseListener(this);
        this.registerView.txtPhone.addMouseListener(this);
        this.registerView.txtEmail.addMouseListener(this);
        this.registerView.btnReturn.addMouseListener(this);
        this.registerView.btnSave.addMouseListener(this);
        this.registerView.btnExit.addMouseListener(this);
        this.registerView.titlePanel.addMouseListener(this);
        this.registerView.titlePanel.addMouseMotionListener(this);
    }

    public void init() {
       registerView.setLocationRelativeTo(null);
    }
    
    public void goToQueueView() {
        registerView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true); 
    }

    public boolean isDniValid(String dni) {
       int i, j = 0;
       String number = "";
       String myDni = "";
       String[] oneNine = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
       
        for (i = 0; i < dni.length(); i++) {
            number = dni.substring(i, i + 1);
            
            for (j =0; j < oneNine.length; j++) {
                if (number.equals(oneNine[j])) {
                    myDni += oneNine[j];
                }
            }
        
        }        
        return myDni.length() == 8;
    }
    
    public boolean isPhoneValid(String phone) {
       int i, j = 0;
       String number = "";
       String myPhone = "";
       String[] unoNueve = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
       
        for (i = 0; i < phone.length(); i++) {
            number = phone.substring(i, i + 1);
            
            for (j =0; j < unoNueve.length; j++) {
                if (number.equals(unoNueve[j])) {
                    myPhone += unoNueve[j];
                }
            }
      
        }        
        return myPhone.length() >= 9 && myPhone.length() <= 15;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
                
        if (e.getSource() == registerView.btnExit) {
            goToQueueView();
        }
        
        if (e.getSource() == registerView.btnReturn) {
             goToQueueView();
        }
               
        if (e.getSource() == registerView.btnSave) {
            
            String name = registerView.txtName.getText();
            String dni = registerView.txtDni.getText();
            String phone = registerView.txtPhone.getText();
            String email = registerView.txtEmail.getText();
            
            if (!name.equals("Ingrese el nombre completo") && !dni.equals("Ingrese el DNI") && 
                    !phone.equals("Ingrese el numero telefonico") && !email.equals("Ingrese el correo electronico")) {
                
                if (isDniValid(dni)) {
                    user.setDni(dni); 
                } else {
                    JOptionPane.showMessageDialog(null, "DNI invalido");
                }
                
                if (isPhoneValid(phone)) {
                    user.setPhone(phone);
                } else {
                    JOptionPane.showMessageDialog(null, "Telefono invalido");
                }
                
                if (isDniValid(dni) && isPhoneValid(phone)) {
                    user.setName(name);
                    user.setEmail(email);
                    MyQueue.enqueue(user);
                    JOptionPane.showMessageDialog(null, "Cliente añadido a la cola");
                    goToQueueView();
                }                
            } else {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            }            
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        if (e.getSource() == registerView.titlePanel) {
            registerView.mouseX = e.getX();
            registerView.mouseY = e.getY();
        }
        
        if (e.getSource() == registerView.txtName) {
            if (registerView.txtName.getText().equals("Ingrese el nombre completo")) {
                registerView.txtName.setText("");
                registerView.txtName.setForeground(Color.black);
            }
            if (registerView.txtName.getText().isEmpty()) {
                registerView.txtDni.setText("Ingrese el DNI");
                registerView.txtDni.setForeground(Color.gray);
            }
            if (registerView.txtPhone.getText().isEmpty()) {
                registerView.txtPhone.setText("Ingrese el numero telefonico");
                registerView.txtPhone.setForeground(Color.gray);
            }
            if (registerView.txtEmail.getText().isEmpty()) {
                registerView.txtEmail.setText("Ingrese el correo electronico");
                registerView.txtEmail.setForeground(Color.gray);
            }
        }
        
        if (e.getSource() == registerView.txtDni) {
            if (registerView.txtDni.getText().equals("Ingrese el DNI")) {
                registerView.txtDni.setText("");
                registerView.txtDni.setForeground(Color.black);
            }
            if (registerView.txtName.getText().isEmpty()) {
                registerView.txtName.setText("Ingrese el nombre completo");
                registerView.txtName.setForeground(Color.gray);
            }
            if (registerView.txtPhone.getText().isEmpty()) {
                registerView.txtPhone.setText("Ingrese el numero telefonico");
                registerView.txtPhone.setForeground(Color.gray);
            }
            if (registerView.txtEmail.getText().isEmpty()) {
                registerView.txtEmail.setText("Ingrese el correo electronico");
                registerView.txtEmail.setForeground(Color.gray);
            }
        }
        
        if (e.getSource() == registerView.txtPhone) {
            if (registerView.txtPhone.getText().equals("Ingrese el numero telefonico")) {
                registerView.txtPhone.setText("");
                registerView.txtPhone.setForeground(Color.black);
            }
            if (registerView.txtName.getText().isEmpty()) {
                registerView.txtName.setText("Ingrese el nombre completo");
                registerView.txtName.setForeground(Color.gray);
            }
            if (registerView.txtDni.getText().isEmpty()) {
                registerView.txtDni.setText("Ingrese el DNI");
                registerView.txtDni.setForeground(Color.gray);
            }
            if (registerView.txtEmail.getText().isEmpty()) {
                registerView.txtEmail.setText("Ingrese el correo electronico");
                registerView.txtEmail.setForeground(Color.gray);
            }
        }
       
         if (e.getSource() == registerView.txtEmail) {
            if (registerView.txtEmail.getText().equals("Ingrese el correo electronico")) {
                registerView.txtEmail.setText("");
                registerView.txtEmail.setForeground(Color.black);
            }
            if (registerView.txtName.getText().isEmpty()) {
                registerView.txtName.setText("Ingrese el nombre completo");
                registerView.txtName.setForeground(Color.gray);
            }
            if (registerView.txtDni.getText().isEmpty()) {
                registerView.txtDni.setText("Ingrese el DNI");
                registerView.txtDni.setForeground(Color.gray);
            }
            if (registerView.txtPhone.getText().isEmpty()) {
                registerView.txtPhone.setText("Ingrese el numero telefonico");
                registerView.txtPhone.setForeground(Color.gray);
            }
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == registerView.btnExit) {
            registerView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == registerView.btnExit) {
            registerView.exitPanel.setBackground(new Color(0, 22, 59));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == registerView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            registerView.setLocation(x - registerView.mouseX, y - registerView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}