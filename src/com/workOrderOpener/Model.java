package com.workOrderOpener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Model extends JFrame implements ActionListener {

    int WIDTH = 600;

    JButton workOrder;
    JButton CNCProgram;
    JButton drawing;
    JTextField inputTextBox;
    JLabel labelOne;
    JLabel messageLabel;

    public Model() {
        this.setSize(WIDTH, 250);
        this.setTitle("ASSIST");
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(123, 50, 255));
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String Text = "Enter Work Order/ CNC Program/ Drawing #";
        labelOne = new JLabel(Text);
        labelOne.setFont(new Font("Calibri", Font.BOLD, 20));
        labelOne.setHorizontalAlignment(SwingConstants.CENTER);

        inputTextBox = new JTextField();
        inputTextBox.setHorizontalAlignment(SwingConstants.CENTER);
        inputTextBox.setFont(new Font("Calibri", Font.PLAIN, 20));
        JPanel inputBoxContainer = new JPanel();
        messageLabel = new JLabel("Message Here");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setFont(new Font("Calibri", Font.BOLD, 15));
        inputBoxContainer.setLayout(new GridLayout(2, 1));
        inputBoxContainer.add(inputTextBox);
        inputBoxContainer.add(messageLabel);

        JPanel buttonPanel = new JPanel();
        workOrder = new JButton("Get Work Order");
        workOrder.addActionListener(this);
        CNCProgram = new JButton("Get CNC Program");
        CNCProgram.addActionListener(this);
        drawing = new JButton("Get Drawing");
        drawing.addActionListener(this);
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.setSize(WIDTH, 200);
        buttonPanel.add(workOrder);
        buttonPanel.add(CNCProgram);
        buttonPanel.add(drawing);

        this.add(labelOne, BorderLayout.NORTH);
        this.add(inputBoxContainer, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawing) {
            String data = inputTextBox.getText();
            inputTextBox.setText("");
        } else if (e.getSource() == workOrder) {
            String data = inputTextBox.getText();

            if (!Functions.isValidWorkOrder(data)) {
                messageLabel.setText("NOT A VALID WORK ORDER NUMBER");
                messageLabel.setForeground(Color.red);
            } else {
                messageLabel.setText("Fetch Router For WO# " + data);
                messageLabel.setForeground(Color.black);
            }

            inputTextBox.setText("");
        } else if (e.getSource() == CNCProgram) {
            String data = inputTextBox.getText();
            inputTextBox.setText("");
        }

    }

}
