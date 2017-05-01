package coding.dojo.fizz.buzz.io.game;

import coding.dojo.fizz.buzz.io.GameOutput;
import coding.dojo.fizz.buzz.io.RoundOutput;

import java.io.PrintStream;

/**
 * Classe affichant les RoundOutput sur un {@link PrintStream}.
 */
public class StringGameOutput implements GameOutput {
    private final PrintStream stream;

    public StringGameOutput(PrintStream stream) {
        super();
        this.stream = stream;
    }

    @Override
    public void addRoundOutput(RoundOutput roundOutput) {
        roundOutput.display(stream);
    }
}
