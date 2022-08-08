package com.g4.controller;

import com.g4.model.entity.MyQueue;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmDestination;
import com.g4.view.frmQueue;
import com.g4.view.frmTicket;
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
    }    
    
    public void init() {
        destinationView.setLocationRelativeTo(null);
    }
    
    private void goToTicketConfirmationView() {
        frmTicket ft = new frmTicket();
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
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }    
}