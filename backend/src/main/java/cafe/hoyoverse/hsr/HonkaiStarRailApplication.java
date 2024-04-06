package cafe.hoyoverse.hsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan({"cafe.hoyoverse.hsr.config"})
public class HonkaiStarRailApplication {

    public static void main(String[] args) {
        SpringApplication.run(HonkaiStarRailApplication.class, args);
    }
}
