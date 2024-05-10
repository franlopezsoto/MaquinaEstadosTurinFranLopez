package Projecto;


public class Reverser {
    private HaltChecker check;

    public Reverser() {
        this.check = new HaltChecker();
    }

    public void reverse(Program program) {
        if (check.check(program)) {
            program.run();
            if (program.isFinished()) {
                System.out.println("The program has halted.");
            } else {
                System.out.println("The program has not halted.");
            }
        } else {
            System.out.println("The program is not a HaltingProgram.");
        }
    }
}
