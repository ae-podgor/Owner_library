package io.github.aepodgor;

import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources({
        "classpath:default.properties"
})
public interface WebDriverConfig extends Config {

    @Key("webdriver.browser.name")
    BrowserName browserName();

    @Key("webdriver.remote")
    boolean remote();

    @Key("webdriver.remote.url")
    URL remoteURL();
}
