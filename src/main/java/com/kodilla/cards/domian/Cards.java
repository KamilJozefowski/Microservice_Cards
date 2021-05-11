package com.kodilla.cards.domian;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "CARDS")
public class Cards {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREDIT_VALUE")
    private Double creditValue;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;
}
