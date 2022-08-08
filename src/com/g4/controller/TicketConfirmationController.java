package com.g4.controller;

import com.g4.model.entity.Dijkstra;
import com.g4.model.entity.MyQueue;
import com.g4.model.repository.UserDAO;
import com.g4.view.frmQueue;
import com.g4.view.frmTicket;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class TicketConfirmationController implements MouseListener, MouseMotionListener {
    public static frmTicket ticketConfirmationView;
    private UserDAO userC;
    public int origin = Dijkstra.citySelected.get(MyQueue.front.user.getOrigin());
    public int destination = Dijkstra.citySelected.get(MyQueue.front.user.getDestination());
    public String route = "";
    private static final double PRICE_PER_KM = 0.258;
    
    public TicketConfirmationController(frmTicket ticketConfirmationView, UserDAO userC) {
        this.ticketConfirmationView = ticketConfirmationView;
        this.ticketConfirmationView.btnConfirm.addMouseListener(this);
        this.ticketConfirmationView.btnReturn.addMouseListener(this);
        this.userC = userC;
    }  

    public void init() {
        ticketConfirmationView.setLocationRelativeTo(null);
        this.ticketConfirmationView.txtOriginSelected.setText(MyQueue.front.user.getOrigin());
        this.ticketConfirmationView.txtDestinationSelected.setText(MyQueue.front.user.getDestination());
        this.ticketConfirmationView.txtDistance.setText(String.valueOf(calculateMinDistance()));
        this.ticketConfirmationView.txtPriceSoles.setText(String.valueOf(calculatePrice()));
        this.ticketConfirmationView.txtRouteCalculated.setText(getRoute());
        String pricePerKm = this.ticketConfirmationView.lblPricePerKmInfo.getText();
        pricePerKm += " " + String.valueOf(PRICE_PER_KM);
        this.ticketConfirmationView.lblPricePerKmInfo.setText(pricePerKm);
        this.ticketConfirmationView.lblPricePerKmInfo.setForeground(Color.gray);
    }
    
    public void goToDestinationView() {
        ticketConfirmationView.setVisible(false);
        DestinationController.destinationView.setVisible(true);
    }
    
    public void goToQueueView() {
        ticketConfirmationView.dispose();
        DestinationController.destinationView.dispose();
        frmQueue fq = new frmQueue();
        QueueController qc = new QueueController(fq);
        qc.init();
        fq.setVisible(true); 
    }
    
    private int calculateMinDistance() {
        return (int) (Dijkstra.dijkstraAlgorithm(Dijkstra.adjacencyMatrix, origin, destination));
    }
    
    private int calculatePrice() {
        return (int) (Math.round(PRICE_PER_KM * calculateMinDistance()));
    }
    
    private String getRoute() {
        List<String> routeList = Dijkstra.dijkstraAlgorithmPaths(Dijkstra.adjacencyMatrix, origin, destination);
        for (int i = 0; i < routeList.size() - 1; i++) {
             route += routeList.get(i) + " → ";
        }
        route += routeList.get(routeList.size() - 1);
        return route;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == ticketConfirmationView.btnReturn) {
            goToDestinationView();
        }
        
        if (e.getSource() ==  ticketConfirmationView.btnConfirm) {
            
            if (userC.register(MyQueue.front.user)) {
                MyQueue.dequeue();
                JOptionPane.showMessageDialog(null, "Registro guardado");
                goToQueueView();
            } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                    //limpiar();
            }
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