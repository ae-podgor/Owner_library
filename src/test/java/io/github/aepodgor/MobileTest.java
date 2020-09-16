package io.github.aepodgor;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class MobileTest {

    @Test
    public void testDevice() {
        MobileConfig config = ConfigFactory.newInstance().create(MobileConfig.class, System.getProperties());
        System.out.println(config.deviceName());
        System.out.println(config.appLocation());
        System.out.println(config.platformName());
        System.out.println(config.platformVersion());

    }
}
