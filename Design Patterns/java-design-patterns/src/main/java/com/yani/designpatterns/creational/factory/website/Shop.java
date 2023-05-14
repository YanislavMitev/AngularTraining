package com.yani.designpatterns.creational.factory.website;

import com.yani.designpatterns.creational.factory.pages.CartPage;
import com.yani.designpatterns.creational.factory.pages.ItemPage;
import com.yani.designpatterns.creational.factory.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
