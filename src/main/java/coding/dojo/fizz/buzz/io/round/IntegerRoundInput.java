package coding.dojo.fizz.buzz.io.round;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;

/**
 * Représente un entier comme donnée d'entrée pour un tour.
 */
public class IntegerRoundInput implements RoundInput {
    private final Integer integer;

    public IntegerRoundInput(Integer integer) {
        super();
        this.integer = integer;
    }

    @Override
    public boolean isMultipleOf(int number) {
        return this.integer % number == 0;
    }

    @Override
    public RoundOutput createOutput() {
        return new StringRoundOutput(this.integer.toString());
    }
}
