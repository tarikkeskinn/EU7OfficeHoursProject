package com.cybertek.javaReviews.practiceDay01;

public class TrafficLightObjects {

    public static void main(String[] args) {

        TrafficLight trafficLight= new TrafficLight("09:45");

        trafficLight.changeColor("yellow");

        trafficLight.showColor();

        trafficLight.changeColor("black");

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("yellow");

        System.out.println("trafficLight2 = " + trafficLight2.localTime);
        System.out.println("TrafficLight.localTime = " + TrafficLight.localTime);

    }
}
