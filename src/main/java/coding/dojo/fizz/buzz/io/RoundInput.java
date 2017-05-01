package coding.dojo.fizz.buzz.io;

/**
 * Donne l'entrée du joueur pour un tour.
 */
public interface RoundInput {
    boolean isMultipleOf(int number);

    RoundOutput createOutput();
}
