package guru.springframework.msscbeerservice.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String name;
    private BeerStyleEnum beerStyle;

    private Long upc;
    private BigDecimal price;



}