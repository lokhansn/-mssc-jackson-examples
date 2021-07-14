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

    @Test
    public void testKebabCase() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String kebabString = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(beerDto);
        System.out.println(kebabString);
    }

}
