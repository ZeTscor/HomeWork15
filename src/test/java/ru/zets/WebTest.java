package ru.zets;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.zets.config.ApiConfig;
import ru.zets.config.WebConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTest {
    @Test
    void webLocalTest(){
        System.setProperty("environment","localWeb");
        WebConfig web = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertEquals("CHROME",web.browser());
        assertEquals("98",web.version());
    }

    @Test
    void webRemoveTest(){
        System.setProperty("environment","removeWeb");
        WebConfig web = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertEquals("CHROME",web.browser());
        assertEquals("98",web.version());
        assertEquals("https://user1:1234@selenoid.autotests.cloud/wd/hub",web.removeDriver());
    }
}

