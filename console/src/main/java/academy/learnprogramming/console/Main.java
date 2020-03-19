package academy.learnprogramming.console;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main
 */
@Slf4j
@SpringBootApplication
public class Main {
// new Log with lombok
    //    public static final Logger log = LoggerFactory.getLogger(Main.class);
//    for xml based config
//    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {

        log.info("Guess The Number Game");

        // create context (container)
        SpringApplication.run(Main.class, args);
    }
}