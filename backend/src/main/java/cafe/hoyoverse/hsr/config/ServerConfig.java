package cafe.hoyoverse.hsr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "server")
public class ServerConfig {
    private int port = 2333;
}
