package Projecto;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HaltingProgramTest {
    private HaltingProgram haltingProgram;

    @BeforeEach
    void setUp() {
        haltingProgram = new HaltingProgram();
    }

    @Test
    void testRunWithoutMessage() {
        haltingProgram.runWithoutMessage();
        assertTrue(haltingProgram.isFinished());
    }
}
