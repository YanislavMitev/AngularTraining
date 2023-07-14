package com.yani.designpatterns.behavioral.mediator;

/**
 * Client.
 * <a href="https://app.pluralsight.com/course-player?clipId=4feb1561-c190-4128-ad7e-d13c93167243">Pluralsight link </a>
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroom = new Light("Bedroom");
        Light kitchen = new Light("Kitchen");

        mediator.registerLight(bedroom);
        mediator.registerLight(kitchen);

        Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);
        turnOnAllLights.execute();

        Command turnOffAllLights = new TurnOffAllLightsCommand(mediator);
        turnOffAllLights.execute();
    }
}
