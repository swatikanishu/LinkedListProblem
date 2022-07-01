package com.bridgelabz;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){System.out.println("Welcome to linkedList DataStructure Program");
        System.out.println("Welcome to linkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start"); // UC 2
        System.out.println("Enter 2 to add the data at the End"); // UC 3
        System.out.println("Enter 3 to add the data at In Between "); // UC 4
        System.out.println("Enter 4 to delete the data at first position "); // UC 5
        System.out.println("Enter 5 to delete the data at last position "); // UC 6
        System.out.println("Enter 6 to search the data  "); // UC 7

        switch (scanner.nextInt()) {

            case 1:
                Operation.addDataAtStart();
                break;
            case 2:
                Operation.addDataAtEnd();
                break;
            case 3:
                Operation.insertInBetween();
                break;
            case 4:
                Operation.pop();
                break;
            case 5:
                Operation.popLast();
                break;
            case 6:
                Operation.search();
                break;
        }
    }
}



