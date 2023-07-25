package com.yani.designpatterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a phone client message");
        tabletClient.addMessage("Here is a tablet client message");
    }
}
