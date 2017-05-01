package coding.dojo.fizz.buzz.io.game;

import coding.dojo.fizz.buzz.io.GameOutput;
import coding.dojo.fizz.buzz.io.RoundOutput;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.PrintStream;

/**
 * Classe affichant les RoundOutput sur un {@link PrintStream}.
 */
public class StringGameOutput implements GameOutput {
    public StringGameOutput(PrintStream stream) {
        super();
        throw new NotImplementedException();
    }

    @Override
    public void addRoundOutput(RoundOutput roundOutput) {
        throw new NotImplementedException();
    }
}
