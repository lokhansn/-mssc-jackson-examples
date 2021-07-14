package com.sgl.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws JsonProcessingException {
        String jsonString = "{\"id\":\"9cce94e5-3d34-45f4-b392-ad3cf4cbea9d\",\"beerName\":\"Budwiser\",\"beerStyle\":\"Ale\",\"upc\":123456789,\"price\":12.99,\"createdDate\":\"2021-07-14T11:55:58.0179564+05:30\",\"lastUpdatedDate\":\"2021-07-14T11:55:58.0179564+05:30\"}";
        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto);
    }
}
