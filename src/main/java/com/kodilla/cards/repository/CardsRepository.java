package com.kodilla.cards.repository;


import com.kodilla.cards.domian.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {

    @Override
    Optional<Cards> findById(Long id);

    List<Cards> findAllByCustomerId(Long customerId);

}
