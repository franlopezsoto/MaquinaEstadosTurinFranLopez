package Projecto;

public class HaltChecker {
    public boolean check(Program program) {
        program.run();
        return program.isFinished();
    }

    public boolean willHalt(Program program) {
        Thread programThread = new Thread(program::run);
        programThread.start();

        try {
            Thread.sleep(5000); // espera 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return !programThread.isAlive();
    }
}
