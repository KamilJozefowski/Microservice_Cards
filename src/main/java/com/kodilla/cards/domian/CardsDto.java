package com.kodilla.cards.domian;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CardsDto {
    private Long id;
    private String name;
    private Double creditValue;
    private String cardNumber;
    private Long customerId;
}
