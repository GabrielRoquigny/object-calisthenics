package coding.dojo.fizz.buzz.game.rule;

import coding.dojo.fizz.buzz.game.Rule;
import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;

import java.util.function.Consumer;

/**
 * Représente la règle qui donne un {@link RoundOutput} si le {@link RoundInput} est multiple du nombre donné.
 */
public class MultipleRule implements Rule {
    private final int multiple;
    private final RoundOutput roundOutput;

    /**
     * Créer la règle qui donne le {@link RoundOutput} si le {@link RoundInput} est multiple du nombre donné.
     *
     * @param multiple    nombre multiple.
     * @param roundOutput ce qui doit être retourner si le nombre est multiple.
     */
    public MultipleRule(int multiple, RoundOutput roundOutput) {
        super();
        this.multiple = multiple;
        this.roundOutput = roundOutput;
    }

    @Override
    public void check(RoundInput roundInput, Consumer<RoundOutput> outputConsumer) {
        if (roundInput.isMultipleOf(multiple)) {
            outputConsumer.accept(roundOutput);
        }
    }
}
