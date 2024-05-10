package Projecto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverserTest {
    private Reverser reverser;

    @BeforeEach
    void setUp() {
        reverser = new Reverser();
    }

    @Test
    void testReverseHaltingProgram() {
        Program haltingProgram = new HaltingProgram();
        reverser.reverse(haltingProgram);
        // Add assertions here based on your expected outcomes
    }

    @Test
    void testReverseNonHaltingProgram() {
        Program nonHaltingProgram = new NonHaltingProgram();
        reverser.reverse(nonHaltingProgram);
        // Add assertions here based on your expected outcomes
    }
}
