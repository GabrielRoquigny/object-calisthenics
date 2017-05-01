package coding.dojo.fizz.buzz.game.rule;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Random;
import java.util.function.Consumer;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

/**
 * Test de la class {@link MultipleRule}.
 */
public class MultipleRuleTest {
    @Mock
    private RoundOutput roundOutput;
    @Mock
    private RoundInput roundInput;
    @Mock
    private Consumer<RoundOutput> outputConsumer;

    private int multiple;
    private MultipleRule underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        multiple = new Random().nextInt();
        underTest = new MultipleRule(multiple, roundOutput);
    }

    @Test
    public void shouldCallConsumerWithRoundOutput_whenCheck_withRoundInputIsMultiple() {
        // Given
        when(roundInput.isMultipleOf(multiple)).thenReturn(true);

        // When
        underTest.check(roundInput, outputConsumer);

        // Then
        verify(outputConsumer).accept(roundOutput);
    }

    @Test
    public void shouldDoNothing_whenCheck_withoutRoundInputIsMultiple() {
        // Given
        when(roundInput.isMultipleOf(multiple)).thenReturn(false);

        // When
        underTest.check(roundInput, outputConsumer);

        // Then
        verifyZeroInteractions(outputConsumer);
    }

}