package coding.dojo.fizz.buzz.game;

import coding.dojo.fizz.buzz.io.GameInput;
import coding.dojo.fizz.buzz.io.GameOutput;
import coding.dojo.fizz.buzz.io.RoundInput;

import java.util.function.Consumer;

/**
 * Classe gérant le jeu.<br/>
 * Récupère l'entrée (ou les entrées) et la donne à la classe {@link RoundManager de tour} pour afficher le résultat.
 */
public class Game {

    private final RoundManager roundManager;

    public Game(RoundManager roundManager) {
        this.roundManager = roundManager;
    }

    /**
     * Lance le jeu (a.k.a. boucle sur les entrées en lançant de nouveau tour).
     *
     * @param gameInput  Entrée du jeu.
     * @param gameOutput Gestionnaire de sortie du jeu.
     */
    public void launch(GameInput gameInput, GameOutput gameOutput) {
        Consumer<RoundInput> launchRound = roundInput -> roundManager.launch(roundInput, gameOutput::addRoundOutput);
        gameInput.giveNext(launchRound);
    }
}
