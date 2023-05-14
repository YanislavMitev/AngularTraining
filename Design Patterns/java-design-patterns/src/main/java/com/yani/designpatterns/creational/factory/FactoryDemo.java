package com.yani.designpatterns.creational.factory;

import com.yani.designpatterns.creational.factory.website.Website;
import com.yani.designpatterns.creational.factory.website.WebsiteFactory;
import com.yani.designpatterns.creational.factory.website.WebsiteType;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=2beac0ee-a616-43c8-88a9-434b62a5a6e2</a>
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());
    }
}
