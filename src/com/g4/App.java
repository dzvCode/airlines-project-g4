package com.g4;

import com.g4.controller.MainController;
import com.g4.model.entity.Admin;
import com.g4.model.repository.AdminDAO;
import com.g4.view.frmLogin;
import com.g4.view.frmRegister;

/**
 *
 * @author diego
 */
public class App {
    public static void main(String[] args) {
        Admin admin = new Admin();
        AdminDAO adminDAO = new AdminDAO();
        frmLogin fl = new frmLogin();
        MainController mc = new MainController(admin, adminDAO, fl);
        mc.init();
        fl.setVisible(true);
    }
}
