package Projecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingInterface extends JFrame {
    private JButton haltingButton;
    private JButton nonHaltingButton;
    private JLabel resultLabel;
    private Reverser reverser;
    private HaltChecker haltChecker;

    public SwingInterface() {
        setTitle("Halt Checker Interface");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        reverser = new Reverser();
        haltChecker = new HaltChecker();

        haltingButton = new JButton("Run Halting Program");
        nonHaltingButton = new JButton("Run Non-Halting Program");
        resultLabel = new JLabel("");

        haltingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Program haltingProgram = new HaltingProgram();
                boolean result = haltChecker.willHalt(haltingProgram);
                resultLabel.setText("Halting Program: " + (result ? "Will halt" : "Will not halt"));
                reverser.reverse(haltingProgram);
            }
        });

        nonHaltingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Program nonHaltingProgram = new NonHaltingProgram();
                boolean result = haltChecker.willHalt(nonHaltingProgram);
                resultLabel.setText("Non-Halting Program: " + (result ? "Will halt" : "Will not halt"));
                reverser.reverse(nonHaltingProgram);
            }
        });

        add(haltingButton);
        add(nonHaltingButton);
        add(resultLabel);
    }

    public static void main(String[] args) {
        SwingInterface swingInterface = new SwingInterface();
        swingInterface.setVisible(true);
    }
}
