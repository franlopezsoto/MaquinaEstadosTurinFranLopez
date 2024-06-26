package Projecto;

import javax.swing.*;

public class HaltingProgram implements Program {
    private int num = 10;
    private boolean isFinished = false;

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Halting Program: This is a countdown from 10 and will halt when it reaches 0");
        runWithoutMessage();
    }

    public void runWithoutMessage() {
        while (num > 0) {
            System.out.println(num);
            num--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isFinished = true;
    }

    public boolean isFinished() {
        return isFinished;
    }
    public String getOppositeMessage() {
        return "Non-Halting Program: This is a count up and will not halt because it has no limitations";
    }
}
