package com.kodilla.cards.service;

import com.kodilla.cards.domian.Cards;
import com.kodilla.cards.repository.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {
    private final CardsRepository cardsRepository;

    public Optional<Cards> getCards(final Long taskId) {
        return cardsRepository.findById(taskId);
    }

    public List<Cards> getAllCardsByCustomerId(final Long customerId) {
        return cardsRepository.findAllByCustomerId(customerId);
    }
}
