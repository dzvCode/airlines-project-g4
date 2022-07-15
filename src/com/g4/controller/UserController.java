package com.g4.controller;

import com.g4.model.entity.User;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmQueue;
import com.g4.view.frmRegister;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;

public class UserController implements MouseListener, MouseMotionListener {
    private User user;
    private UserDAO userC;
    private frmRegister registerView;

    public UserController(User user, UserDAO userC, frmRegister registerView) {
        this.user = user;
        this.userC = userC;
        this.registerView = registerView;
        this.registerView.txtName.addMouseListener(this);
        this.registerView.txtDni.addMouseListener(this);
        this.registerView.txtPhone.addMouseListener(this);
        this.registerView.txtEmail.addMouseListener(this);
        //this.registerView.boxDestination.
        this.registerView.btnRegister.addMouseListener(this);
        this.registerView.btnContinue.addMouseListener(this);
        this.registerView.btnExit.addMouseListener(this);
    }

    public void init() {
        //registerView.setTitle("Registro");
        registerView.setLocationRelativeTo(null);
    }

      public void goToQueueForm() {
        registerView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true);
        
    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerView.btnRegister) {
            user.setName(registerView.txtName.getText());
            user.setDni(registerView.txtDNI.getText());
            user.setPhone(registerView.txtPhone.getText());
            user.setEmail(registerView.txtEmail.getText());
            user.setDestination(registerView.txtDestiny.getText());

            if (userC.register(user)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }

        if (e.getSource() == registerView.btnCancel) {
            limpiar();
        }
        
    }
    */

    public void limpiar() {
        /*registerView.txtName.setText(null);
        registerView.txtDNI.setText(null);
        registerView.txtPhone.setText(null);
        registerView.txtEmail.setText(null);
        registerView.txtDestiny.setText(null);*/
        }

    @Override
    public void mouseClicked(MouseEvent e) {
                
        if (e.getSource() == registerView.btnExit) {
            System.exit(0);
        }
        
        if (e.getSource() == registerView.btnRegister) {
            
            user.setName(registerView.txtName.getText());
            user.setDni(registerView.txtDni.getText());
            user.setPhone(registerView.txtPhone.getText());
            user.setEmail(registerView.txtEmail.getText());
            user.setDestination(registerView.boxDestination.getSelectedItem().toString());
           

            if (userC.register(user)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                //limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                //limpiar();
            }
        }
        
        if (e.getSource() == registerView.btnContinue) {
              goToQueueForm();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == registerView.txtName) {
            if (registerView.txtName.getText().equals("Ingrese el nombre completo")) {
                registerView.txtName.setText("");
                registerView.setForeground(Color.black);
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
            registerView.exitPanel.setBackground(Color.red);
            //registerView.btnExit.setForeground(Color.);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == registerView.btnExit) {
            registerView.exitPanel.setBackground(new Color(63,31,46));
            //registerView.btnExit.setForeground(Color.white);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}