package com.yani.designpatterns.creational.abstractfactory.factory;

import com.yani.designpatterns.creational.abstractfactory.validator.AmexGoldValidator;
import com.yani.designpatterns.creational.abstractfactory.validator.AmexPlatinumValidator;
import com.yani.designpatterns.creational.abstractfactory.validator.Validator;
import com.yani.designpatterns.creational.abstractfactory.card.AmexGoldCreditCard;
import com.yani.designpatterns.creational.abstractfactory.card.AmexPlatinumCreditCard;
import com.yani.designpatterns.creational.abstractfactory.card.CardType;
import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }
}
