package yxdivine.rest;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.model.Fish;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController("/moFish")
public class FishService {
    @Value("${data.fish}")
    String fishDataPath;

    List<Fish> fishList;

    public FishService() throws IOException {
        reloadFishData();
    }

    private void reloadFishData() throws IOException {
        fishList = new ArrayList<>();
        ObjectMapper jsonParser = new ObjectMapper();
        JavaType type = jsonParser.getTypeFactory().constructParametricType(List.class, Fish.class);
        fishList = jsonParser.readValue(Paths.get(fishDataPath).toFile(), type);
    }


    @PostMapping("/test")
    public String test() {
        return fishList.toString();
    }
}
