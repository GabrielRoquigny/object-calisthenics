package coding.dojo.fizz.buzz.io.game;

import coding.dojo.fizz.buzz.io.GameInput;
import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.round.IntegerRoundInput;

import java.util.function.Consumer;

/**
 * Représente les valeurs entier dans un interval pour le jeu.
 */
public class RangeIntegerGameInput implements GameInput {
    private int end;
    private int start;

    public RangeIntegerGameInput(int start, int end) {
        super();
        this.end = end;
        this.start = start;
    }

    @Override
    public void giveNext(Consumer<RoundInput> receiver) {
        for (int number = start; number < end; number++) {
            receiver.accept(new IntegerRoundInput(number));
        }
    }
}
