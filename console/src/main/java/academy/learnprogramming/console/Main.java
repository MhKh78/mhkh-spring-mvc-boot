package academy.learnprogramming.console;


import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 */
@Slf4j
public class Main {
// new Log with lombok
    //    public static final Logger log = LoggerFactory.getLogger(Main.class);
//    for xml based config
//    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {

        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // close context (container)
        context.close();
    }
}