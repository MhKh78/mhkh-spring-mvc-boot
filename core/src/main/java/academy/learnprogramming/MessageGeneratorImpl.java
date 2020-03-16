package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

// @Component is for * automatic * bean finding
public class MessageGeneratorImpl implements MessageGenerator {
    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);
    // == fields ==
    @Autowired
    private Game game;

    private int guessCount = 10;

    // == init ==
    @PostConstruct
    public void init() {
        log.info("game = {}", game);
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "Number is between " + game.getSmallest() + " and " + game.getBiggest() + ". Can you guess it?";
    }

    @Override
    public String getResultMessage() {
        if (game.isGameWon()) {
            return "You guessed it! The number was " + game.getNumber();
        } else if (game.isGameLost()) {
            return "You Lost. The number was " + game.getNumber();
        } else if (!game.isValidNumberRange()) {
            return "Invalid Number range!";
        } else if (game.getRemainGuesses() == guessCount) {
            return "What is your first guess";
        } else {
            String direction = "Lower";

            if (game.getGuess() < game.getNumber()) {
                direction = "Higher";
            }

            return direction + "! You have " + game.getRemainGuesses() + " guess left";
        }
    }
}
