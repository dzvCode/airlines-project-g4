package com.g4;

import com.g4.view.frmLogin;
import com.g4.view.frmRegister;

/**
 *
 * @author diego
 */
public class App {
    public static void main(String[] args) {
        frmLogin frm = new frmLogin();
        frmRegister frm2 = new frmRegister();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);

   /*     frm2.setVisible(true);
        frm2.setLocationRelativeTo(null);
    */
    }
}
