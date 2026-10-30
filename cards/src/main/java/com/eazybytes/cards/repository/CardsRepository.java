package com.eazybytes.cards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.cards.entity.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

}