package com.g4.controller;

import com.g4.model.entity.User;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmClients;
import com.g4.view.frmUpdate;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class UpdateController implements MouseListener, MouseMotionListener {
    public static frmUpdate updateView;
    
    public UpdateController (frmUpdate updateView) {
        this.updateView = updateView;
        this.updateView.btnExit.addMouseListener(this);
        this.updateView.titlePanel.addMouseListener(this);
        this.updateView.titlePanel.addMouseMotionListener(this);
        this.updateView.btnUpdate.addMouseListener(this);       
    }
    
    public void init() {
        updateView.setLocationRelativeTo(null);
        this.updateView.txtClient.setText(ClientsController.user.getName());
        this.updateView.txtDni.setText(ClientsController.user.getDni());
        this.updateView.txtOrigin.setText(ClientsController.user.getOrigin());
        this.updateView.txtDestination.setText(ClientsController.user.getDestination());
        
    }
    
    public void goToClientsView() {
        updateView.dispose();
        frmClients fc = new frmClients();
        ClientsController cc = new ClientsController(fc);
        cc.init();
        fc.setVisible(true);   
    }
    
    public void actualizar() {
        UserDAO ud = new UserDAO();
        User user = new User();
        
        //user.setName(updateView.txtClient.getText());
        user.setDni(updateView.txtDni.getText());
        user.setPhone(updateView.txtPhone.getText());
        user.setEmail(updateView.txtEmail.getText());
              
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = updateView.jDateChooser.getCalendar();
                 
        if("".equals(user.getPhone()) || "".equals(user.getEmail()) 
                || "".equals(user.getDepartureDate()) || calendar == null) {
            JOptionPane.showMessageDialog(updateView, "Debe llenar todos los campos", 
                    "Operacion invalida", JOptionPane.ERROR_MESSAGE);
        } else {
            Date date = calendar.getTime();
            user.setDepartureDate(sdf.format(date));
            
                           
            if (!isPhoneValid(user.getPhone())) {
                JOptionPane.showMessageDialog(null, "Telefono invalido");
            } else {
                int YesOrNo = JOptionPane.showConfirmDialog(null,"¿Está seguro de actualizar el registro?", "Actualizar registro", JOptionPane.YES_NO_OPTION);
                
                if(YesOrNo == 0) {
                    ud.update(user);
                    JOptionPane.showMessageDialog(null, "Se actualizo el cliente " + user.getName() + " en la base de datos");
                    updateView.dispose();
                    ClientsController.clientsView.dispose();
                    goToClientsView();
                }
            }
        }
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
        if (e.getSource() == updateView.btnExit) {
            updateView.dispose();
        }
     
        if (e.getSource() == updateView.btnUpdate) {
            actualizar();
        }
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == updateView.titlePanel) {
            updateView.mouseX = e.getX();
            updateView.mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == updateView.btnExit) {
            updateView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == updateView.btnExit) {
            updateView.exitPanel.setBackground(new Color(0, 22, 59));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == updateView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            updateView.setLocation(x - updateView.mouseX, y - updateView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}