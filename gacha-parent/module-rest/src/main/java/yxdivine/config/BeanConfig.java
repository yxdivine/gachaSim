package yxdivine.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yxdivine.util.RandomHelper;

@Configuration
public class BeanConfig {
    private static final Logger logger = LoggerFactory.getLogger(BeanConfig.class);

    @Value("${randomhelper.seed:0}")
    private int seed;

    @Bean
    public RandomHelper randomHelper() {
        logger.info("Seed set to " + seed);
        return seed != 0 ? new RandomHelper(seed) : new RandomHelper();
    }

}
