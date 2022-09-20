import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class GUI {
    private JPanel MainPanel;
    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("ADD");
        button.setPreferredSize(new Dimension(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Task_Master");
        frame.pack();
        frame.setVisible(true);
        frame.setContentPane(new GUI().MainPanel);
        //gui for input.java


    }
}