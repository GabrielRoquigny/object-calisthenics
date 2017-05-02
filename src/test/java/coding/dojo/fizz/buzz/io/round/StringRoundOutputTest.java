package coding.dojo.fizz.buzz.io.round;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.PrintStream;
import java.util.UUID;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by roquignyg on 01/05/2017.
 */
public class StringRoundOutputTest {
    @Mock
    private PrintStream printStream;

    private String randomString;

    private StringRoundOutput underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        randomString = UUID.randomUUID().toString();
        underTest = new StringRoundOutput(randomString);
    }

    @Test
    public void shouldCallAppendOnPrintStream_whenDisplay() {
        underTest.display(printStream);

        verify(printStream).append(randomString);
    }
}