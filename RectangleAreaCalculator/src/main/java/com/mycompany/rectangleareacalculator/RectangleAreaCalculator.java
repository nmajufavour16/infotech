/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangleareacalculator;

/**
 * @author PH4YVO
 */
public class RectangleAreaCalculator
{
    public static double calculateArea(double length, double width)
    {
        return length * width;
    }
    public static void main(String[]args) {
        double length = 5.0;
        double width = 3.0;
        System.out.println("Area of the rectangle: " + calculateArea(length, width));
    }
}
