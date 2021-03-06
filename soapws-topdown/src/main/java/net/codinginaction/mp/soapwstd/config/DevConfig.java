package net.codinginaction.mp.soapwstd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("classpath:soapws-topdown.properties")
public class DevConfig {

}
