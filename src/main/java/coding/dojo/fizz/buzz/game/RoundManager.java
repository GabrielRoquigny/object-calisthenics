package coding.dojo.fizz.buzz.game;

import coding.dojo.fizz.buzz.io.RoundInput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.function.Consumer;

/**
 * Gère un tour du jeu.<br/>
 * En fonction de l'entrée du joueur, elle donne le résultat du jeu.
 */
public class RoundManager {

    /**
     * Construit le tour avec tous les règles à appliquer.
     *
     * @param rules les règles du tour.
     */
    public RoundManager(final Rule... rules) {
        throw new NotImplementedException();
    }

    /**
     * Essaye chaque règle et appele le consomateur si la règle donne une donnée de sortie.
     *
     * @param roundInput     La donnée d'entrée du joueur.
     * @param outputConsumer le consomateur de donnée de sortie.
     */
    public void launch(RoundInput roundInput, Consumer<RoundOutput> outputConsumer) {
        throw new NotImplementedException();
    }
}
