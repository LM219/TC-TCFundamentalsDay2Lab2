package io.zipcoder.fundamentals.day2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args){
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick a number, any number, apart from 13....?");
        
        int number = scanner.nextInt();
        
        if (number!= 13) {
        for (int x=1; x<=number; x++)
        {
        	System.out.print(x + " ");
        }
        }
        else {
        	System.out.println("Whyyyy did you print my unlucky number! -_-");
        }
        

    }
}
