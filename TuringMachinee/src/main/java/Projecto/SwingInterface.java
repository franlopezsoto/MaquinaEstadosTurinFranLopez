package Projecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SwingInterface extends JFrame {
    private JButton haltingButton;
    private JButton nonHaltingButton;
    private JButton reverserButton;
    private JLabel resultLabel;
    private Reverser reverser;

    public SwingInterface() {
        setTitle("Halt Checker Interface");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        reverser = new Reverser();

        haltingButton = new JButton("Run Halting Program");
        nonHaltingButton = new JButton("Run Non-Halting Program");
        reverserButton = new JButton("Reverser");
        resultLabel = new JLabel("");

        haltingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Program haltingProgram = new HaltingProgram();
                haltingProgram.run();
            }
        });

        nonHaltingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Program nonHaltingProgram = new NonHaltingProgram();
                nonHaltingProgram.run();
            }
        });

        reverserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reverser.reverse(getRandomProgram());
            }
        });
        add(haltingButton);
        add(nonHaltingButton);
        add(reverserButton);
        add(resultLabel);
    }

    private Program getRandomProgram() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new HaltingProgram();
        } else {
            return new NonHaltingProgram();
        }
    }

    public static void main(String[] args) {
        SwingInterface swingInterface = new SwingInterface();
        swingInterface.setVisible(true);
    }
}
