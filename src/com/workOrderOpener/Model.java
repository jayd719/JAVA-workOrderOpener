package com.workOrderOpener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Model extends JFrame implements ActionListener {
    JButton workOrder;
    JButton CNCProgram;
    JButton drawing;
    JTextField inputTextBox;
    JLabel labelOne;

    public Model() {
        this.setSize(650, 250);
        this.setTitle("ASSIST");
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(123, 50, 255));
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        labelOne = new JLabel("Enter A Work Order/ CNC Program/ Drawing Number");

        inputTextBox = new JTextField();
        inputTextBox.setSize(300, 10);

        JPanel buttonPanel = new JPanel();

        workOrder = new JButton("Get Work Order");
        workOrder.addActionListener(this);

        CNCProgram = new JButton("Get CNC Program");
        CNCProgram.addActionListener(this);

        drawing = new JButton("Get Drawing");
        drawing.addActionListener(this);

        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(workOrder);
        buttonPanel.add(CNCProgram);
        buttonPanel.add(drawing);

        this.add(labelOne, BorderLayout.NORTH);
        this.add(inputTextBox, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawing) {
            String data = inputTextBox.getText();
            inputTextBox.setText("");
        }else if(e.getSource()==workOrder){
            String data = inputTextBox.getText();
            System.out.println(data);
            System.out.println("tdfdhis");
        }else if(e.getSource()==CNCProgram){
            String data = inputTextBox.getText();
            System.out.println(data);
            System.out.println("thispppp");
        }

        
    }

}
