package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 23 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key? ");
        input = scanner.nextLine();

        if (input.equals("y"))
        {
            System.out.println("Are the battery terminals corroded? ");
            input = scanner.nextLine();

            if (input.equals("y"))
                System.out.println("Clean terminals and try starting again.");
            else
                System.out.println("Replace cables and try again.");
        }
        else if (input.equals("n"))
        {
            System.out.println("Does the car make a slicking noise? ");
            input = scanner.nextLine();

            if (input.equals("y"))
                System.out.println("Replace the battery.");
            else
            {
                System.out.println("Does the car crank up but fail to start? ");
                input = scanner.nextLine();

                if (input.equals("y"))
                    System.out.println("Check spark plug connections.");
                else
                {
                    System.out.println("Does the engine start and then die? ");
                    input = scanner.nextLine();

                    if (input.equals("y"))
                    {
                        System.out.println("Does your car have fuel injection? ");
                        input = scanner.nextLine();

                        if (input.equals("y"))
                            System.out.println("Get it in for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}