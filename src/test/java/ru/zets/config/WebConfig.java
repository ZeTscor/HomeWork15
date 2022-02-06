package ru.zets.config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${environment}.properties"
})

public interface WebConfig extends Config {
    @Config.Key("browser")
    String browser();
    @Key("browserVersion")
    String version();
    @Key("removeDriver")
    String removeDriver();


}
