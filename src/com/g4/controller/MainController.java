package com.g4.controller;

import com.g4.model.entity.Admin;
import com.g4.model.repository.AdminDAO;
import com.g4.view.frmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author diego
 */
public class MainController implements ActionListener {
    private Admin admin;
    private AdminDAO adminC;
    private frmLogin frmMain;

    public MainController(Admin admin, AdminDAO adminC, frmLogin frmMain) {
        this.admin = admin;
        this.adminC = adminC;
        this.frmMain = frmMain;
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}