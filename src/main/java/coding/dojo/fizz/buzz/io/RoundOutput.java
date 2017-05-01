package coding.dojo.fizz.buzz.io;

import java.io.PrintStream;

/**
 * Gestionnaire des données de sortie du tour.
 */
public interface RoundOutput {
    /**
     * S'affiche sur le stream donné.
     *
     * @param stream le stream sur lequel s'afficher.
     */
    void display(PrintStream stream);
}
