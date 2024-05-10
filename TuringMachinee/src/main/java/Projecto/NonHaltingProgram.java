package Projecto;

import javax.swing.*;

public class NonHaltingProgram implements Program {
    private int num = 1;
    private boolean isFinished = false;

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Non-Halting Program: This is a count up and will not halt because it has no limitations");
        runWithoutMessage();
    }

    public void runWithoutMessage() {
        while (true) { // bucle infinito
            System.out.println(num);
            num++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isFinished() {
        return isFinished;
    }
    public String getOppositeMessage() {
        return "Halting Program: This is a countdown from 10 and will halt when it reaches 0";
    }
}
