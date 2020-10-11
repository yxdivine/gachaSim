package yxdivine.config;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yxdivine.model.Fish;
import yxdivine.util.RandomHelper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfig {
    private static final Logger logger = LoggerFactory.getLogger(BeanConfig.class);

    @Value("${randomhelper.seed:0}")
    private int seed;

    @Value("${data.fish}")
    String fishDataPath;

    @Bean
    public RandomHelper randomHelper() {
        logger.info("Seed set to " + seed);
        return seed != 0 ? new RandomHelper(seed) : new RandomHelper();
    }

    @Bean List<Fish> fishList() throws IOException {
        List<Fish> fishList = new ArrayList<>();
        ObjectMapper jsonParser = new ObjectMapper();
        JavaType type = jsonParser.getTypeFactory().constructParametricType(List.class, Fish.class);
        return jsonParser.readValue(Paths.get(fishDataPath).toFile(), type);

    }
}
