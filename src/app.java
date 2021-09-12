/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class legal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = sc.nextInt();
        String output = age<16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
        System.out.println(output);
    }
}