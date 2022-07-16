package com.g4;

import com.g4.controller.LoginController;
import com.g4.model.entity.Admin;
import com.g4.model.entity.MyQueue;
import com.g4.model.repository.AdminDAO;
import com.g4.view.frmLogin;

public class App {
    public static void main(String[] args) {        
        /*
        Admin admin = new Admin();
        AdminDAO adminDAO = new AdminDAO();
        frmLogin fl = new frmLogin();
        LoginController mc = new LoginController(admin, adminDAO, fl);
        mc.init();
        fl.setVisible(true);     
        */
        
        
        MyQueue.enqueue("Diego");
        MyQueue.enqueue("Renzo");
        MyQueue.enqueue("Walter");
        MyQueue.enqueue("Manchas");
        
        System.out.println(MyQueue.upload());
        
        MyQueue.dequeue();
       
        System.out.println(MyQueue.upload());
        
        
        
    }
}