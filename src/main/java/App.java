/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int largeNum = -9999999;
        int[] digit = new int[3];
        String output;

        System.out.println("Enter the first number:");
        digit[0] = scan.nextInt();

        System.out.println("Enter the second number:");
        digit[1] = scan.nextInt();

        System.out.println("Enter the third number:");
        digit[2] = scan.nextInt();

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(digit[i] > largeNum)
                {
                    largeNum = digit[i];
                }
            }
        }

        output = String.format("The largest number is %d.", largeNum);

        System.out.println(output);

        scan.close();
    }
}