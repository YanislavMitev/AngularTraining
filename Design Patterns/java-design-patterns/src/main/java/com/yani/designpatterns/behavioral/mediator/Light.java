package com.yani.designpatterns.behavioral.mediator;

/**
 * Receiver.
 */
public class Light {
    private boolean isOn;
    private String location = "";

    public Light() {

    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        isOn = !isOn;
        System.out.println(location + "'s lights are " + (isOn ? "on." : "off."));
    }
}
