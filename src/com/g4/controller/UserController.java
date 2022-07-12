package com.g4.controller;

import com.g4.model.entity.User;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmRegister;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;


/**
 *
 * @author diego
 */
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
        this.registerView.btnExit.addMouseListener(this);
    }

    public void init() {
        //registerView.setTitle("Registro");
        registerView.setLocationRelativeTo(null);
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
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == registerView.txtName) {
            if (registerView.txtName.getText().equals("Ingrese el nombre completo")) {
                registerView.txtName.setText("");
                registerView.setForeground(Color.black);
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