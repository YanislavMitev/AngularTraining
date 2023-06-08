package com.yani.designpatterns.structural.proxy;

/**
 * <a href="https://gist.github.com/bh5k/73a82d64e35e780150d1">Twitter gist<a/>
 * <a href="https://app.pluralsight.com/course-player?clipId=7fa31637-999a-484c-b52b-b44b511b8d9e">Pluralsight link</a>
 */
public class TwitterDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(service.getTimeline("asfqw"));
        service.postToTimeline("bg5k", "Some message that shouldn't go through.");
    }
}
