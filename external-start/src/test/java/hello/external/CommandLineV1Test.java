package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1Test {
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("Command Line Argument : {}", arg);
        }
    }
}
