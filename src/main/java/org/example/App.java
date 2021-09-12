/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        int area, length, width;
        double res;
        final double con = 0.09290304;
        Scanner s = new Scanner(System.in);

        System.out.print("What is the length of the room in feet?");
        length = s.nextInt();
        System.out.print("What is the width of the room in feet?");
        width = s.nextInt();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        area = width * length;
        res = area * con;
        System.out.println("The area is\n" + area + " square feet");
        System.out.printf("%.3f square meters", res);
    }

}