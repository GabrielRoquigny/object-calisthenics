package coding.dojo.fizz.buzz.game.rule;

import coding.dojo.fizz.buzz.game.Rule;
import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;

import java.util.function.Consumer;

/**
 * Implémente la règle par défaut du jeu.
 */
public class DefaultRule implements Rule {

    /**
     * Retourne tout le temps la donnée créé par {@link RoundInput#createOutput()}.
     *
     * @param roundInput     la donnée à vérifier.
     * @param outputConsumer le consomateur de données de sortie appeler si la donnée d'entrée est correcte.
     */
    @Override
    public void check(RoundInput roundInput, Consumer<RoundOutput> outputConsumer) {
        RoundOutput outputToGive = roundInput.createOutput();
        outputConsumer.accept(outputToGive);
    }
}
