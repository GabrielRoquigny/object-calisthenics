package coding.dojo.fizz.buzz;

import coding.dojo.fizz.buzz.game.Game;
import coding.dojo.fizz.buzz.game.RoundManager;
import coding.dojo.fizz.buzz.game.rule.DefaultRule;
import coding.dojo.fizz.buzz.game.rule.MultipleRule;
import coding.dojo.fizz.buzz.io.game.RangeIntegerGameInput;
import coding.dojo.fizz.buzz.io.game.StringGameOutput;
import coding.dojo.fizz.buzz.io.round.StringRoundOutput;

import java.io.PrintStream;

/**
 * Classe lançant l'application.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        RangeIntegerGameInput rangeGameInput = createRangeGameInput();
        StringGameOutput outputManager = createStringGameOutput();
        createNormalGame().launch(rangeGameInput, outputManager);
    }

    static Game createNormalGame() {
        StringRoundOutput fizzBuzzOutput = new StringRoundOutput("Fizz-Buzz");
        StringRoundOutput fizzOutput = new StringRoundOutput("Fizz");
        StringRoundOutput buzzOutput = new StringRoundOutput("Buzz");

        MultipleRule multiple15Rule = new MultipleRule(15, fizzBuzzOutput);
        MultipleRule multiple5Rule = new MultipleRule(5, fizzOutput);
        MultipleRule multiple3Rule = new MultipleRule(3, buzzOutput);
        DefaultRule defaultRule = new DefaultRule();

        RoundManager roundManager = new RoundManager(
                multiple15Rule,
                multiple5Rule,
                multiple3Rule,
                defaultRule
        );
        return new Game(roundManager);
    }

    static RangeIntegerGameInput createRangeGameInput() {
        return new RangeIntegerGameInput(1, 100);
    }

    static StringGameOutput createStringGameOutput() {
        return new StringGameOutput(System.out);
    }
}
