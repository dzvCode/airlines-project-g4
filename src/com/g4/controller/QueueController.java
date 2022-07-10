package com.g4.controller;

import com.g4.model.entity.MyQueue;
import com.g4.view.frmQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author diego
 */
public class QueueController implements ActionListener {
    
    private frmQueue queueView;

    public QueueController(frmQueue queueView) {
        this.queueView = queueView;
        //this.queueView.
    }
        
    public void init() {
        //queueView.setTitle("Cola");
        queueView.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        

    }
    
}
