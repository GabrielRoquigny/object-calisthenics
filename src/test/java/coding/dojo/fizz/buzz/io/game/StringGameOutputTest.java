package coding.dojo.fizz.buzz.io.game;

import coding.dojo.fizz.buzz.io.RoundOutput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;

/**
 * Test de la classe {@link StringGameOutput}.
 */
public class StringGameOutputTest {

    @Mock
    private RoundOutput roundOutput;
    @Mock
    private PrintStream printStream;

    private StringGameOutput underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        underTest = new StringGameOutput(printStream);
    }

    @Test
    public void shouldCallDisplay_whenAddRoundOutput() {
        // When
        underTest.addRoundOutput(roundOutput);

        // Then
        verify(roundOutput).display(printStream);
        verify(printStream).append("\n");
    }
}