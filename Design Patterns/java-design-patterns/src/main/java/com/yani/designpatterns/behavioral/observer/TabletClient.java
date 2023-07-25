package com.yani.designpatterns.behavioral.observer;

public class TabletClient extends Observer {
    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message);
    }

    @Override
    void update() {
        System.out.println("Table Stream: " + subject.getState());
    }
}
