package com.yani.designpatterns.creational.abstractfactory.factory;

import com.yani.designpatterns.creational.abstractfactory.validator.Validator;
import com.yani.designpatterns.creational.abstractfactory.card.CardType;
import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
