package Projecto;

public class HaltingProgram implements Program {
    private int num = 10;
    private boolean isFinished = false;

    @Override
    public void run() {
        while (num > 0) {
            System.out.println(num);
            num--;
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
