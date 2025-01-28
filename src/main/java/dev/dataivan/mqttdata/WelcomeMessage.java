package dev.dataivan.mqttdata;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Welcome!. Tomcat server is running.";
    }
}
