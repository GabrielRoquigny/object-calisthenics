package coding.dojo.fizz.buzz.game.rule;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.function.Consumer;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Test la classe {@link DefaultRule}.
 */
public class DefaultRuleTest {
    @Mock
    private RoundInput roundInput;
    @Mock
    private Consumer<RoundOutput> outputConsumer;
    @Mock
    private RoundOutput roundOutput;

    private DefaultRule underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        underTest = new DefaultRule();
    }

    @Test
    public void shouldCallConsumerWithRoundOutput_whenCheck_withRoundInputGivenRoundOutput() {
        // Given
        when(roundInput.createOutput()).thenReturn(roundOutput);

        // When
        underTest.check(roundInput, outputConsumer);

        // Then
        verify(outputConsumer).accept(roundOutput);
    }
}