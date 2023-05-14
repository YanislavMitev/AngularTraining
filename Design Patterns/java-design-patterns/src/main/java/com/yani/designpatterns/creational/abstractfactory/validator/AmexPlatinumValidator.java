package com.yani.designpatterns.creational.abstractfactory.validator;

import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
