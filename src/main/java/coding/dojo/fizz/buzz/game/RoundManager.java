package coding.dojo.fizz.buzz.game;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;

import java.util.function.Consumer;

/**
 * Gère un tour du jeu.<br/>
 * En fonction de l'entrée du joueur, elle donne le résultat du jeu.
 */
public class RoundManager {

    private final Rule[] rules;

    /**
     * Construit le tour avec tous les règles à appliquer.
     *
     * @param rules les règles du tour.
     */
    public RoundManager(final Rule... rules) {
        super();
        this.rules = rules;
    }

    /**
     * Essaye chaque règle et appele le consomateur si la règle donne une donnée de sortie.
     *
     * @param roundInput     La donnée d'entrée du joueur.
     * @param outputConsumer le consomateur de donnée de sortie.
     */
    public void launch(RoundInput roundInput, Consumer<RoundOutput> outputConsumer) {
        final State state = new State();
        for (int i = 0; i < rules.length && state.canContinue; i++) {
            rules[i].check(roundInput, roundOutput -> {
                state.ruleChecked();
                outputConsumer.accept(roundOutput);
            });
        }
    }

    private static final class State {
        private boolean canContinue = true;

        private void ruleChecked() {
            canContinue = false;
        }
    }
}
