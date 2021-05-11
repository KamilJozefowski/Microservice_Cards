package com.kodilla.cards.controller;

import com.kodilla.cards.domian.CardsDto;
import com.kodilla.cards.mapper.CardsMapper;
import com.kodilla.cards.service.DbService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RefreshScope
@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/cards")
@RequiredArgsConstructor
public class CardsController {

    private final DbService dbService;
    private final CardsMapper cardsMapper;

    @Value("${application.allow-get-cards}")
    private boolean allowGetCards;

    @GetMapping
    public List<CardsDto> getCards(@RequestParam("customerId") Long customerId) throws TaskNotFoundException {
        log.info("Get cards for costumerID: {}", customerId);
        if (!allowGetCards) {
            log.info("Getting cards is disabled.");
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Getting cards is disabled.");
        }
        return cardsMapper.mapToListCardsDto(dbService.getAllCardsByCustomerId(customerId));
    }

}
