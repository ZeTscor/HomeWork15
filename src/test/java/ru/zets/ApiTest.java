package ru.zets;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.zets.config.ApiConfig;

public class ApiTest {


    @Test
    void apiTest(){
        ApiConfig api = ConfigFactory.create(ApiConfig.class, System.getProperties());
        Assertions.assertEquals("https://github.com",api.baseURL());
        Assertions.assertEquals("/token/api",api.token());
    }
}
