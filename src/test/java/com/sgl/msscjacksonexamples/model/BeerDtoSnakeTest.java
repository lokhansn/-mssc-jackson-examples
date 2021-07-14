package com.sgl.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
        // {
        // "id":"f1afde4f-1457-4994-a149-d601fe1ab8b3",
        // "beer_name":"budweiser",
        // "beer_style":"Pale Lager",
        // "upc":123456789,"price":12.99,
        // "created_date":"2021-07-14T12:10:53.253626+05:30",
        // "last_updated_date":"2021-07-14T12:10:53.253626+05:30"
        // }
    }
}
