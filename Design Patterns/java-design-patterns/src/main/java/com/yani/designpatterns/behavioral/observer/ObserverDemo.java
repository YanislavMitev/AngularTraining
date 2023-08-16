package com.yani.designpatterns.behavioral.observer;

/**
 * Client.
 * <a href="https://app.pluralsight.com/course-player?clipId=e5383a97-9eab-4d84-aef9-2c365bf39da0">Pluralsight link </a>
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a phone client message");
        tabletClient.addMessage("Here is a tablet client message");
    }
}
