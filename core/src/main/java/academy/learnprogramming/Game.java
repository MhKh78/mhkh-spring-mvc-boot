package academy.learnprogramming;

public interface Game {
    int getNumber();

    int getGuess();

    void setGuess(int guess);

    int getBiggest();

    int getSmallest();

    int getRemainGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();
}
