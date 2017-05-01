package coding.dojo.fizz.buzz.game;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.function.Consumer;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * Test de la classe {@link RoundManager}.
 */
public class RoundManagerTest {
    @Mock
    private Rule ruleCorrect;
    @Mock
    private Rule ruleIncorrect;
    @Mock
    private RoundInput roundInput;
    @Mock
    private Consumer<RoundOutput> outputConsumer;
    @Mock
    private RoundOutput roundOutput;

    private RoundManager underTest;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        doAnswer(invocationOnMock -> {
            invocationOnMock.getArgumentAt(1, Consumer.class).accept(roundOutput);
            return null;
        }).when(ruleCorrect).check(eq(roundInput), any());
    }

    @Test
    public void shouldCallConsumer_whenLaunch_withOnePositiveRule() {
        // Given
        underTest = new RoundManager(ruleIncorrect, ruleCorrect, ruleIncorrect);

        // When
        underTest.launch(roundInput, outputConsumer);

        // Then
        verify(ruleIncorrect, times(1)).check(eq(roundInput), any());
        verify(outputConsumer).accept(roundOutput);
    }

    @Test
    public void shouldNotCallConsumer_whenLaunch_withoutPositiveRule() {
        // Given
        underTest = new RoundManager(ruleIncorrect, ruleIncorrect);

        // When
        underTest.launch(roundInput, outputConsumer);

        // Then
        verifyZeroInteractions(outputConsumer);
    }

    @Test
    public void shouldNotCallConsumer_whenLaunch_withoutRules() {
        // Given
        underTest = new RoundManager();

        // When
        underTest.launch(roundInput, outputConsumer);

        // Then
        verifyZeroInteractions(outputConsumer);
    }
}