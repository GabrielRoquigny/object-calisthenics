package coding.dojo.fizz.buzz.game;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;

import java.util.function.Consumer;

/**
 * Represente une règle.
 */
public interface Rule {
    /**
     * Vérifie si l'entrée donnée est correct (en fonction de la règle) et donne, le cas échéant, au consomateur de
     * donnée de sortie le résultat.
     *
     * @param roundInput     la donnée à vérifier.
     * @param outputConsumer le consomateur de données de sortie appeler si la donnée d'entrée est correcte.
     */
    void check(RoundInput roundInput, Consumer<RoundOutput> outputConsumer);
}
