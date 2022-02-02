package com.cybertek.javaReviews.practiceDay01;

public class TrafficLight { //my blueprint for all traffic lights
    //We are applying encapsulation : we have private

    private String color;

    public TrafficLight (String localTime) {

        this.localTime= localTime;
    }

    public TrafficLight () {

    }

    public void showColor() {
        System.out.println("color = " + color);
    }

    //local time of each light should shared by all traffic lights

    public static String localTime ;

    public static void showTime () {

        System.out.println("The time of our traffic lights in the city : " + localTime);
    }

    public void changeColor (String newColor) {
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") ||
                newColor.equalsIgnoreCase("green")){

            System.out.println("changing the color to " + newColor);

            color=newColor;
        } else {
            System.err.println("ERROR : invalid color : " + newColor );
        }
    }


}
