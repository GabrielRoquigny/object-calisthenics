package coding.dojo.fizz.buzz.game.rule;

import coding.dojo.fizz.buzz.game.Rule;
import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.function.Consumer;

/**
 * Représente la règle qui donne un {@link RoundOutput} si le {@link RoundInput} est multiple du nombre donné.
 */
public class MultipleRule implements Rule {
    /**
     * Créer la règle qui donne le {@link RoundOutput} si le {@link RoundInput} est multiple du nombre donné.
     *
     * @param multiple    nombre multiple.
     * @param roundOutput ce qui doit être retourner si le nombre est multiple.
     */
    public MultipleRule(int multiple, RoundOutput roundOutput) {
        super();
        throw new NotImplementedException();
    }

    @Override
    public void check(RoundInput roundInput, Consumer<RoundOutput> outputConsumer) {
        throw new NotImplementedException();
    }
}
