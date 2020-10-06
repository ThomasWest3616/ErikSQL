package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Ball> balls = new ArrayList<>();
        Football fb = new Football(1, "Wilson");
        balls.add(fb);
        balls.add(new Football(4, "Adidas"));
        balls.add(new Football(5, "Nike"));
        balls.add(new Football(4, "Hummel"));
        balls.add(new Tennisball(1, "Wilson"));

        System.out.println(balls);
    }
}
