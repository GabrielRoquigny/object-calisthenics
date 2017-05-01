package coding.dojo.fizz.buzz.io;

import java.util.function.Consumer;

/**
 * Permet de récupérer les entrées du joueur.
 */
public interface GameInput {
    /**
     * Donne la prochaine entrée s'il y en a.
     * @param receiver la prochaine entrée du joueur.
     */
    void giveNext(Consumer<RoundInput> receiver);
}
