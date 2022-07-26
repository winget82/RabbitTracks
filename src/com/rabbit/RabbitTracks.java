package com.rabbit;

import javax.swing.*;

public class RabbitTracks {
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
    private JPanel HomeTab;
    private JLabel RabbitTracksIconLabel;
    private JPanel RabbitCalendarPanel;
    private JPanel CalendarDetailsPanel;
    private JLabel CalendarDetailsLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rabbit Tracks");
        frame.setContentPane(new RabbitTracks().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        RabbitTracksIconLabel = new JLabel();
        RabbitTracksIconLabel.setIcon(new ImageIcon("RabbitTracksIcon.PNG"));
        RabbitCalendarPanel = new Cal();
    }
}

//form to read from and save to sqlite database all rabbit breeding / harvesting info