package com.eazybytes.cards.service.impl;

import org.springframework.stereotype.Service;

import com.eazybytes.cards.dto.CardsDto;
import com.eazybytes.cards.service.iCardsService;

@Service 
public class CardsServiceImpl implements iCardsService {

    @Override
    public void createCard(String mobileNumber) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean updateCard(CardsDto cardDto) { 
        return false;
    }
    
}
