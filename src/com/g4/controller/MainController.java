package com.g4.controller;

import com.g4.model.entity.Admin;
import com.g4.model.repository.AdminDAO;
import com.g4.view.frmLogin;
import com.g4.view.frmQueue;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


/**
 *
 * @author diego
 */
public class MainController implements MouseListener {
    private Admin admin;
    private AdminDAO adminC;
    private frmLogin loginView;

    public MainController(Admin admin, AdminDAO adminC, frmLogin loginView) {
        this.admin = admin;
        this.adminC = adminC;
        this.loginView = loginView;
        this.loginView.btnLogin.addMouseListener(this);
        this.loginView.btnExit.addMouseListener(this);
    }
    
    public void init() {
        loginView.setTitle("Login");
        loginView.setLocationRelativeTo(null);
    }

    public void goToQueueForm() {
        loginView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == loginView.btnLogin) {
            String code = loginView.txtCode.getText();
            String password = String.valueOf(loginView.pfPassword.getPassword());
        
            boolean isValidAdmin = getAuthenticatedAdmin(code, password);
        
            if (isValidAdmin) {
                goToQueueForm();
            } else {
                JOptionPane.showMessageDialog(loginView, "Código o contraseña inválido", "Intente otra vez", JOptionPane.ERROR_MESSAGE);
            }
        
        }
        if (e.getSource() == loginView.btnExit) {
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == loginView.btnExit) {
            loginView.exitPanel.setBackground(Color.BLACK);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == loginView.btnExit) {
                loginView.exitPanel.setBackground(new Color(204,0,102));
            }
    }

    private boolean getAuthenticatedAdmin(String code, String password) {
        admin.setCode(code);
        admin.setPassword(password);
        return adminC.read(admin);
    }
    
    
    
}