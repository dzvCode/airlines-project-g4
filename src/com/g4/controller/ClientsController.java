package com.g4.controller;

import com.g4.model.entity.MyDoublyLinkedList;
import com.g4.model.entity.User;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmClients;
import static com.g4.view.frmClients.model;
import com.g4.view.frmFindClient;
import com.g4.view.frmStart;
import com.g4.view.frmUpdate;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientsController implements MouseListener, MouseMotionListener, ItemListener  {
    public static frmClients clientsView;
    public static User user;
    
    public ClientsController (frmClients clientsView) {
        this.clientsView = clientsView;
        this.clientsView.btnExit.addMouseListener(this);
        this.clientsView.titlePanel.addMouseListener(this);
        this.clientsView.titlePanel.addMouseMotionListener(this);
        this.clientsView.btnReturn.addMouseListener(this);
        this.clientsView.cbSorting.addItemListener(this);
        this.clientsView.btnDelete.addMouseListener(this);
        this.clientsView.btnUpdate.addMouseListener(this);
        this.clientsView.btnTicket.addMouseListener(this);
    }

    public void init() {
        clientsView.setLocationRelativeTo(null);
        clientsView.txtAdmin.setText(LoginController.admin.getName());
    }
    
    public void goToStartView() {
        clientsView.dispose();
        FindClientController.findClientView.dispose();
        frmStart fs = new frmStart();
        StartController sc = new StartController(fs);
        sc.init();
        fs.setVisible(true); 
    }
    
    public void goToClientsView() {
        clientsView.dispose();
        frmClients fc = new frmClients();
        ClientsController cc = new ClientsController(fc);
        cc.init();
        fc.setVisible(true);  
    }
    
    public void goToUpdateView() {
        frmUpdate fu = new frmUpdate();
        UpdateController uc = new UpdateController(fu);
        uc.init();
        fu.setVisible(true);
    }
    
    public void goToFindClientView() {
        frmFindClient ffc = new frmFindClient();
        FindClientController fcc = new FindClientController(ffc);
        fcc.init();
        ffc.setVisible(true);
    }
    
 
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == clientsView.btnReturn) {
            goToStartView();
        }
        
        if (e.getSource() == clientsView.btnExit) {
            goToStartView();
        }
        
        if (e.getSource() == clientsView.btnDelete) {
            eliminar();
        }
        
        if (e.getSource() == clientsView.btnUpdate) {
            actualizar();
        }
        
        if (e.getSource() == clientsView.btnTicket) {
            goToFindClientView();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == clientsView.titlePanel) {
            clientsView.mouseX = e.getX();
            clientsView.mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == clientsView.btnExit) {
            clientsView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == clientsView.btnExit) {
            clientsView.exitPanel.setBackground(new Color(0, 22, 59));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == clientsView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            clientsView.setLocation(x - clientsView.mouseX, y - clientsView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
   }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == clientsView.cbSorting) {
            try {
                sort();
            } catch (ParseException ex) {
                Logger.getLogger(ClientsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void sort() throws ParseException {
        String seleccionado = clientsView.cbSorting.getSelectedItem().toString();
      
        if (!"ID".equals(seleccionado)) {
            if (seleccionado.equals("Nombre")) {
                model.getDataVector().removeAllElements();
                MyDoublyLinkedList.insertionSortByName();
                upload();
            }
            if (seleccionado.equals("Precio de boleto")) {
                model.getDataVector().removeAllElements();
                MyDoublyLinkedList.insertionSortByTicketPrice();
                upload();
            }
            
            /*if (seleccionado.equals("Fecha de ida")) {
                System.out.println("Ordenando por fecha");
                model.getDataVector().removeAllElements();
                MyDoublyLinkedList.insertionSortByDate();
                upload(); 
            }*/
            
        } else {
            model.getDataVector().removeAllElements();
            MyDoublyLinkedList.insertionSortById();
            upload();
        }
    }
    
     public void upload() {
        model = (DefaultTableModel) clientsView.tblClients.getModel();
             
        for (Object[] object : MyDoublyLinkedList.upload()) {
            model.addRow(object);
        }
    }
     
    public void eliminar() {
        UserDAO ud = new UserDAO();
        User user = new User();
        if (MyDoublyLinkedList.numbersNodes != 0) {
            //Método que devuelve la fila seleccionada del Jtable
            int fila = clientsView.tblClients.getSelectedRow();
            //Verifica que fila pertenezca dentro del arraylist y mayor o igual a 0 en la tabla
            if (fila != -1 && fila >= 0) {
                               
                user.setName(model.getValueAt(fila,1).toString());
                user.setDni(model.getValueAt(fila,2).toString());
                ud.delete(user);
                //model.removeRow(fila);
                JOptionPane.showMessageDialog(null, "" + user.getName() + " eliminado de la base de datos");
                goToClientsView();

            } else {
                JOptionPane.showMessageDialog(clientsView, "Seleccione un registro", 
                        "Operacion invalida", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(clientsView, "No hay registros en la tabla", 
                    "Operacion invalida", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    public void actualizar() {
        if (MyDoublyLinkedList.numbersNodes != 0) {
            //Método que devuelve la fila seleccionada del Jtable
            int fila = clientsView.tblClients.getSelectedRow();
            //Verifica que fila pertenezca dentro del arraylist y mayor o igual a 0 en la tabla
            if (fila != -1 && fila >= 0) {
                user = new User();
                user.setName(model.getValueAt(fila,1).toString());
                user.setDni(model.getValueAt(fila,2).toString());
                user.setOrigin(model.getValueAt(fila,5).toString());
                user.setDestination(model.getValueAt(fila,6).toString());
                user.setTicketPrice((Integer) model.getValueAt(fila,8));
                goToUpdateView();

            } else {
                JOptionPane.showMessageDialog(clientsView, "Seleccione un registro", 
                        "Operacion invalida", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(clientsView, "No hay registros en la tabla", 
                    "Operacion invalida", JOptionPane.ERROR_MESSAGE);
        }
    } 
     
}