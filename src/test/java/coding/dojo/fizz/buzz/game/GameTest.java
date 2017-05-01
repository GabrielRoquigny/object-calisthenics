package coding.dojo.fizz.buzz.game;

import coding.dojo.fizz.buzz.io.GameInput;
import coding.dojo.fizz.buzz.io.GameOutput;
import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Stubber;

import java.util.function.Consumer;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

/**
 * Test de la classe {@link Game}.
 */
public class GameTest {
    @Mock
    private GameInput gameInput;
    @Mock
    private GameOutput gameOutput;
    @Mock
    private RoundManager roundManager;
    @Mock
    private RoundInput roundInput;
    @Mock
    private RoundOutput roundOutput;

    private Game game;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        game = new Game(roundManager);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void shouldCallRoundManagerAndGameOutput_whenLaunch_withGameInputGiveRoundInput() {
        // Given
        Stubber gameInputAnswer = doAnswer(invocationOnMock -> {
            invocationOnMock.getArgumentAt(0, Consumer.class).accept(roundInput);
            return null;
        });
        gameInputAnswer.when(gameInput).giveNext(any());

        Stubber roundManagerAnswer = doAnswer(invocationOnMock -> {
            invocationOnMock.getArgumentAt(1, Consumer.class).accept(roundOutput);
            return null;
        });
        roundManagerAnswer.when(roundManager).launch(eq(roundInput), any());

        // When
        game.launch(gameInput, gameOutput);

        // Then
        verify(gameOutput).addRoundOutput(roundOutput);
    }
}