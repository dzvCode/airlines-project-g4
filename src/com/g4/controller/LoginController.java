package com.g4.controller;

import com.g4.model.entity.Admin;
import com.g4.model.entity.MyQueue;
import com.g4.model.repository.AdminDAO;
import com.g4.view.frmLogin;
import com.g4.view.frmQueue;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class LoginController implements MouseListener, MouseMotionListener {
    public static Admin admin;
    private AdminDAO adminC;
    private frmLogin loginView;

    public LoginController(Admin admin, AdminDAO adminC, frmLogin loginView) {
        this.admin = admin;
        this.adminC = adminC;
        this.loginView = loginView;
        this.loginView.txtCode.addMouseListener(this);
        this.loginView.pfPassword.addMouseListener(this);
        this.loginView.btnLogin.addMouseListener(this);
        this.loginView.btnExit.addMouseListener(this);
        this.loginView.titlePanel.addMouseListener(this);
        this.loginView.titlePanel.addMouseMotionListener(this);
    }
    
    public void init() {
        loginView.setLocationRelativeTo(null);
    }
         
    public void goToQueueView() {
        loginView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true);   
    }
     
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == loginView.btnLogin) {
            
            goToQueueView();
            /*
            String code = loginView.txtCode.getText();
            String password = String.valueOf(loginView.pfPassword.getPassword());
        
            boolean isValidAdmin = getAuthenticatedAdmin(code, password);
        
            if (isValidAdmin) {
                goToQueueView();
            } else {
                JOptionPane.showMessageDialog(loginView, "Código o contraseña inválido", "Intente otra vez", JOptionPane.ERROR_MESSAGE);
            }
*/
        
        }
        if (e.getSource() == loginView.btnExit) {
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == loginView.titlePanel) {
            loginView.mouseX = e.getX();
            loginView.mouseY = e.getY();
        }
        
        if (e.getSource() == loginView.txtCode) {
            if (loginView.txtCode.getText().equals("Ingrese su codigo")) {
                loginView.txtCode.setText("");
                //loginView.txtCode.setForeground(Color.black);
            } else {
                loginView.txtCode.setForeground(Color.black);
            }
            if(String.valueOf(loginView.pfPassword.getPassword()).isEmpty()){
                loginView.pfPassword.setText("******************");
                loginView.txtCode.setForeground(new Color(153,153,153));
            }
        }
        
        if (e.getSource() == loginView.pfPassword) {
            if(String.valueOf(loginView.pfPassword.getPassword()).equals("******************")){
                loginView.pfPassword.setText("");
                //loginView.pfPassword.setForeground(Color.black);
            } else {
                loginView.pfPassword.setForeground(Color.black);
            }
            
            if (loginView.txtCode.getText().isEmpty()) {
                loginView.txtCode.setText("Ingrese su codigo");
                loginView.pfPassword.setForeground(new Color(153,153,153));
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == loginView.btnExit) {
            loginView.exitPanel.setBackground(Color.BLACK);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == loginView.btnExit) {
            loginView.exitPanel.setBackground(new Color(204,0,102));
        }
    }

    private boolean getAuthenticatedAdmin(String code, String password) {
        admin.setCode(code);
        admin.setPassword(password);
        return adminC.read(admin);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == loginView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            loginView.setLocation(x - loginView.mouseX, y - loginView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {       
    } 
}