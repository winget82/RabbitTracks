package com.rabbit;

import javax.swing.*;

public class RabbitTracksForm {
    private JTabbedPane RabbitTrakcsTabbedPane;
    private JPanel MainPanel;
    private JPanel EnterRabbitTab;
    private JPanel EnterLitterTab;
    private JPanel HarvestStatsTab;
    private JPanel BreedingStatsTab;
    private JPanel RabbitStockTab;
    private JTextField textField1;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField textField3;
    private JTextArea textArea1;
    private JTextField textField2;
    private JTextField textField4;
    private JTextField textField5;
    private JButton cancelButton;
    private JButton OKButton;
    private JPanel EnterHarvestTab;
    private JPanel CalendarTab;
    private JPanel ReportingTab;
    private JPanel LitterDataTab;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RabbitTracksForm");
        frame.setContentPane(new RabbitTracksForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

//form to read from and save to sqlite database all rabbit breeding / harvesting info