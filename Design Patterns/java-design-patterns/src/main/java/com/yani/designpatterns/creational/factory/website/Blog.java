package com.yani.designpatterns.creational.factory.website;

import com.yani.designpatterns.creational.factory.pages.AboutPage;
import com.yani.designpatterns.creational.factory.pages.CommentPage;
import com.yani.designpatterns.creational.factory.pages.ContactPage;
import com.yani.designpatterns.creational.factory.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
