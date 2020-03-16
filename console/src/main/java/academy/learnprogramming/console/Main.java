package academy.learnprogramming.console;


import academy.learnprogramming.AppConfig;
import academy.learnprogramming.MessageGenerator;
import academy.learnprogramming.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 */
public class Main {
    public static final Logger log = LoggerFactory.getLogger(Main.class);
//    for xml based config
//    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {

        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //    for xml based config
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);


        // get number generator bean from context (container)
        // pass by value (string)
//        NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);
        // pass by type (only works in one implementation cases)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        // {} are place holders for logger
        log.info("number = {}", number);

        // get game bean from context (container)
//        Game game = context.getBean(Game.class);

// get message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());

//        // call reset method
//        game.reset();

        // close context (container)
        context.close();
    }
}