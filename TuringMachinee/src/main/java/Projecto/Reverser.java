package Projecto;

public class Reverser {
    private HaltChecker haltChecker;

    public Reverser() {
        haltChecker = new HaltChecker();
    }

    public void reverse(Program program) {
        if (haltChecker.check(program)) {
            NonHaltingProgram nonHaltingProgram = new NonHaltingProgram();
            nonHaltingProgram.run();
        } else {
            HaltingProgram haltingProgram = new HaltingProgram();
            haltingProgram.run();
        }
    }
}

