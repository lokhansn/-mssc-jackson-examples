package com.sgl.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getBeerDto(){
        return BeerDto.builder()
                .beerName("budweiser")
                .beerStyle("Pale Lager")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123456789L)
                .build();
    }
}
