package com.yani.designpatterns.creational.abstractfactory;

import com.yani.designpatterns.creational.abstractfactory.card.CardType;
import com.yani.designpatterns.creational.abstractfactory.card.CreditCard;
import com.yani.designpatterns.creational.abstractfactory.factory.CreditCardFactory;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=ee671b49-7adc-4375-98ca-ac896cd4b129</a>
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());
    }
}
