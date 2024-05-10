package Projecto;

public class NonHaltingProgram implements Program {
    private int num = 1;
    private boolean isFinished = false;

    @Override
    public void run() {
        while (num <= 100) { // se detendrá después de 100 iteraciones
            System.out.println(num);
            num++;
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isFinished = true;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
