package com.kodilla.cards.mapper;

import com.kodilla.cards.domian.Cards;
import com.kodilla.cards.domian.CardsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardsMapper {
    public Cards mapToCards(CardsDto cardsDto) {
        return new Cards(
                cardsDto.getId(),
                cardsDto.getName(),
                cardsDto.getCreditValue(),
                cardsDto.getCardNumber(),
                cardsDto.getCustomerId());
    }

    public CardsDto mapToCardsDto(Cards cards) {
        return new CardsDto(
                cards.getId(),
                cards.getName(),
                cards.getCreditValue(),
                cards.getCardNumber(),
                cards.getCustomerId());
    }

    public List<CardsDto> mapToListCardsDto(final List<Cards> cardsList) {
        return cardsList.stream()
                .map(this::mapToCardsDto)
                .collect(Collectors.toList());
    }
}
