package academy.learnprogramming.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
// first way to create eventListener
//public class ConsoleNumberGuess implements ApplicationListener<ContextRefreshedEvent> {
public class ConsoleNumberGuess {
    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    // first way to create eventListener
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        log.info("Container ready for use.");
//    }
// second way to create eventListener
    @EventListener(ContextRefreshedEvent.class)
// parameter is used to show what type of event it is
//    public void start(ContextRefreshedEvent contextRefreshedEvent) {
// state the type in the annotation
    public void start() {
        log.info("start() --> Container ready for use.");
    }
}

