package com.sgl.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testKebabCase() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String kebabString = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(beerDto);
        System.out.println(kebabString);
        //{
        //  "id" : "4677fba3-c1e0-4953-bbf1-bae8bf8c6d9f",
        //  "beer-name" : "budweiser",
        //  "beer-style" : "Pale Lager",
        //  "upc" : 123456789,
        //  "price" : 12.99,
        //  "created-date" : "2021-07-14T12:20:03.7497871+05:30",
        //  "last-updated-date" : "2021-07-14T12:20:03.7497871+05:30"
        //}
    }

}
