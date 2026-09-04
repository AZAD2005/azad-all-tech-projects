package com.ska;

public enum TrafficLight {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    // Fields
    private final String action;
    private final int durationInSeconds;

    // Private Constructor
    private TrafficLight(String action, int durationInSeconds) {
        this.action = action;
        this.durationInSeconds = durationInSeconds;
    }

    // Getter methods
    public String getAction() {
        return action;
    }

    public int getDuration() {
        return durationInSeconds;
    }
}