package Projecto;

import javax.swing.*;

public class NonHaltingProgram implements Program {
    private int num = 1;
    private boolean isFinished = false;

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Non-Halting Program: This is a count up and will not halt because it has no limitations");
        while (true) { // bucle infinito
            System.out.println(num);
            num++;
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isFinished() {
        return isFinished;
    }
}
