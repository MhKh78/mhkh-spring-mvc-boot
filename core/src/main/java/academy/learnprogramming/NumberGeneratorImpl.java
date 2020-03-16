package academy.learnprogramming;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

// for automatic bean finding
@Component()
public class NumberGeneratorImpl implements NumberGenerator {
    // == fields ==
    // Getter Up There and Getter Access Level NONE here
    private final Random random = new Random();

    @Getter
    private final int maxNumber;

    @Getter
    private final int minNumber;

    // == constructors ==

    // NICE
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==
    @Override
    public int next() {
        // example min=5 max=20 -> max-min=15 => range 0-15 + min -> 5 20
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
}
