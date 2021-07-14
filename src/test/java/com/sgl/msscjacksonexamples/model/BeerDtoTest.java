package com.sgl.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws JsonProcessingException {
        String jsonString = "{\n" +
                "  \"beerName\" : \"budweiser\",\n" +
                "  \"beerStyle\" : \"Pale Lager\",\n" +
                "  \"upc\" : 123456789,\n" +
                "  \"price\" : \"12.99\",\n" +
                "  \"createdDate\" : \"2021-07-14T13:20:19+0530\",\n" +
                "  \"lastUpdatedDate\" : \"2021-07-14T13:20:19.0586136+05:30\",\n" +
                "  \"myLocalDate\" : \"20210714\",\n" +
                "  \"beerId\" : \"a2414e70-8847-4e36-88ed-e1fcf1679a71\"\n" +
                "}";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto);
    }
}
