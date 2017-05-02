package coding.dojo.fizz.buzz.io.round;

import coding.dojo.fizz.buzz.io.RoundOutput;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.PrintStream;

/**
 * Représente les string de sortie d'un tour.
 */
public class StringRoundOutput implements RoundOutput {
    private final String value;

    public StringRoundOutput(String value) {
        this.value = value;
    }

    @Override
    public void display(PrintStream stream) {
        stream.append(value);
    }
}
