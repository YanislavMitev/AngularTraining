package com.yani.designpatterns.creational.abstractfactory.validator;

import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
