package com.g4.controller;

import com.g4.model.entity.MyCircularDoublyLinkedList;
import com.g4.model.entity.MyQueue;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmDestination;
import com.g4.view.frmQueue;
import com.g4.view.frmTicketConfirmation;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class DestinationController implements MouseListener, MouseMotionListener {
   public static frmDestination destinationView;
   
    public DestinationController(frmDestination destinationView) {
        this.destinationView = destinationView;
        this.destinationView.btnContinue.addMouseListener(this);
        this.destinationView.btnReturn.addMouseListener(this);
        this.destinationView.btnExit.addMouseListener(this);
        this.destinationView.titlePanel.addMouseListener(this);
        this.destinationView.titlePanel.addMouseMotionListener(this);
        this.destinationView.btnPrev.addMouseListener(this);
        this.destinationView.btnNext.addMouseListener(this);
    }    
    
    public void init() {
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/arequipa.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/ayacucho.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/cajamarca.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/cuzco.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/iquitos.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/juliaca.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/lima.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/piura.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/pucallpa.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/puertoMaldonado.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/tacna.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/tarapoto.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/trujillo.png");
        MyCircularDoublyLinkedList.insertAtTail("/com/g4/view/images/cities/tumbes.png");
        destinationView.lblCityImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(MyCircularDoublyLinkedList.current.destination)));
        destinationView.bgPanel.add(destinationView.lblCityImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 350, 620));
        destinationView.setLocationRelativeTo(null);
    }
    
    private void goToTicketConfirmationView() {
        frmTicketConfirmation ft = new frmTicketConfirmation();
        UserDAO userC = new UserDAO();
        TicketConfirmationController tcc = new TicketConfirmationController(ft, userC);
        tcc.init();
        ft.setVisible(true);
        destinationView.setVisible(false);
    }
    
    public void goToQueueView() {
        destinationView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true); 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
               
        if (e.getSource() == destinationView.btnContinue) {
            
            String origin = destinationView.boxOrigin.getSelectedItem().toString();
            String destination = destinationView.boxDestination.getSelectedItem().toString();
                                    
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar calendar = destinationView.jDateChooser.getCalendar();
            
            if (!origin.equals("Seleccionar Origen") && !destination.equals("Seleccionar Destino") 
                    && !origin.equals(destination) && calendar != null) {
                MyQueue.front.user.setOrigin(origin);
                MyQueue.front.user.setDestination(destination);           
                Date date = calendar.getTime();
                MyQueue.front.user.setDepartureDate(sdf.format(date));
                goToTicketConfirmationView();
            } else if (destination.equals("Seleccionar Destino")) {
                JOptionPane.showMessageDialog(null, "Seleccione un destino");
            } else if (calendar == null ) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de ida");
            } else if (origin.equals(destination)) {
                JOptionPane.showMessageDialog(null, "Destino invalido");            
            } 
            
          
        }
        
        if (e.getSource() == destinationView.btnReturn) {
            goToQueueView();
        }
        
        if (e.getSource() == destinationView.btnExit) {
            goToQueueView();
        }
        
        if (e.getSource() == destinationView.btnPrev) {
            destinationView.lblCityImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(MyCircularDoublyLinkedList.prevDestination())));
            destinationView.bgPanel.add(destinationView.lblCityImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 350, 620));
        }
        
        if (e.getSource() == destinationView.btnNext) {
            destinationView.lblCityImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(MyCircularDoublyLinkedList.nextDestination())));
            destinationView.bgPanel.add(destinationView.lblCityImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 350, 620));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == destinationView.titlePanel) {
            destinationView.mouseX = e.getX();
            destinationView.mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == destinationView.btnExit) {
            destinationView.exitPanel.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         if (e.getSource() == destinationView.btnExit) {
            destinationView.exitPanel.setBackground(new Color(0, 22, 59));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == destinationView.titlePanel) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            destinationView.setLocation(x - destinationView.mouseX, y - destinationView.mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }    
}