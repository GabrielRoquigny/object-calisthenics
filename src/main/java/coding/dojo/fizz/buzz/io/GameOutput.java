package coding.dojo.fizz.buzz.io;

/**
 * Classe pour afficher les retours du jeu.
 */
public interface GameOutput {
    /**
     * Ajoute une sortie du tour au jeu.
     * @param roundOutput sortie du tour.
     */
    void addRoundOutput(RoundOutput roundOutput);
}
