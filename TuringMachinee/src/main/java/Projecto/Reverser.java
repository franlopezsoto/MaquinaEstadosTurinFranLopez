package Projecto;
import javax.swing.*;
public class Reverser {
    private boolean reverseMessage = false;

    public void reverse(Program program) {
        // Invertir el mensaje que se mostrará
        if (reverseMessage) {
            if (program instanceof HaltingProgram) {
                JOptionPane.showMessageDialog(null, "Halting Program: This is a countdown from 10 and will halt when it reaches 0");
            } else {
                JOptionPane.showMessageDialog(null, "Non-Halting Program: This is a count up and will not halt because it has no limitations");
            }
        } else {
            if (program instanceof HaltingProgram) {
                JOptionPane.showMessageDialog(null, "Non-Halting Program: This is a count up and will not halt because it has no limitations");
            } else {
                JOptionPane.showMessageDialog(null, "Halting Program: This is a countdown from 10 and will halt when it reaches 0");
            }
        }
        // Ejecutar el programa
        program.runWithoutMessage();
        // Cambiar el estado de reverseMessage para la próxima vez
        reverseMessage = !reverseMessage;
    }
}
