package com.yani.designpatterns.behavioral.command;

@Deprecated(since = "Please use toggle command")
public class OnCommand implements Command {
    private Light light;
    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
