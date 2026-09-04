package com.ska.oops.test;

import com.ska.TrafficLight;

public class Test2 {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        TrafficLight green = TrafficLight.GREEN;
        TrafficLight yellow = TrafficLight.YELLOW;
        

        switch (light) {
            case RED -> System.out.println("Stop the vehicle!");
            case YELLOW -> System.out.println("Slow down!");
            case GREEN -> System.out.println("Drive safely!");
        }

    }
}
