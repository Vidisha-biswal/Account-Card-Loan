package com.eazybytes.cards.service.impl;

import com.eazybytes.cards.constants.CardsConstants;
import com.eazybytes.cards.dto.CardsDto;
import com.eazybytes.cards.entity.Cards;
import com.eazybytes.cards.exception.CardAlreadyExistsException;
import com.eazybytes.cards.exception.ResourceNotFoundException;
import com.eazybytes.cards.mapper.CardsMapper;
import com.eazybytes.cards.repository.CardsRepository;
import com.eazybytes.cards.service.iCardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service 
@AllArgsConstructor
public class CardsServiceImpl implements iCardsService {

    private CardsRepository cardsRepository;
    @Override
    public void createCard(String mobileNumber) {
        Optional<Cards> cardsOptional = cardsRepository.findByMobileNumber(mobileNumber);
        if(cardsOptional.isPresent()){
            throw new CardAlreadyExistsException("Card already registered with given mobileNumber "+mobileNumber);
        }
        cardsRepository.save(createNewCard(mobileNumber));
    }

    private Cards createNewCard(String mobileNumber) {
        Cards cards = new Cards();
        long randomCardNumber = 100000000000L + new Random().nextInt(900000000);
        cards.setMobileNumber(mobileNumber);
        cards.setCardNumber(Long.toString(randomCardNumber));
        cards.setCardType(CardsConstants.CREDIT_CARD);
        cards.setTotalLimit(CardsConstants.NEW_CARD_LIMIT);
        cards.setAmountUsed(0);
        cards.setAvailableAmount(CardsConstants.NEW_CARD_LIMIT);
        return cards;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        Cards cards = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Card", "mobileNumber", mobileNumber)
        );
        return CardsMapper.mapToCardsDto(cards, new CardsDto());
    }

    @Override
    public boolean updateCard(CardsDto cardDto) { 
        Cards cards = cardsRepository.findByCardNumber(cardDto.getCardNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Card", "CardNumber", cardDto.getCardNumber()));
        CardsMapper.mapToCards(cardDto, cards);
        cardsRepository.save(cards);
        return  true;
    }
    
}
