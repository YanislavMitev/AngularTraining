package com.yani.designpatterns.creational.abstractfactory.validator;

import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;

public interface Validator {
    boolean isValid(CreditCard creditCard);
}
