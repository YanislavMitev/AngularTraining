package com.yani.designpatterns.creational.abstractfactory.factory;

import com.yani.designpatterns.creational.abstractfactory.validator.Validator;
import com.yani.designpatterns.creational.abstractfactory.validator.VisaValidator;
import com.yani.designpatterns.creational.abstractfactory.card.CardType;
import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;
import com.yani.designpatterns.creational.abstractfactory.card.VisaBlackCreditCard;
import com.yani.designpatterns.creational.abstractfactory.card.VisaGoldCreditCard;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
