package com.yani.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Client.
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=1b3627b4-8e16-4cb9-99fb-1c95cfe54997</a>
 */
public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
