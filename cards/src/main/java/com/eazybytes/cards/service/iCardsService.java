package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface  iCardsService {
    void createCard(String mobileNumber);
    CardsDto fetchCard(String mobileNumber);
    boolean updateCard(CardsDto cardDto);
    boolean deleteCard(String mobileNumber);
}
