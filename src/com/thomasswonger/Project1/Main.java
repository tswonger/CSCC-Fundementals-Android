package com.thomasswonger.Project1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variables
        int selection;

        //constructors
        Scanner input = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();


        do {

            String userStringInput;
            int userIntInput;

            System.out.println("Please choose an option:");
            System.out.println("(1) Add a task.");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all tasks.");
            System.out.println("(0) Exit.");
            selection = input.nextInt();

            switch (selection) {
                case 1:
                    input.nextLine();
                    System.out.println("Enter a description of the task.");
                    userStringInput = input.nextLine();
                    tasks.add(userStringInput);
                    break;
                case 2:
                    System.out.println("Enter the index of the task to remove.");
                    tasks.remove(input.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the index of the task to update.");
                    userIntInput = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter the description of the task.");
                    userStringInput = input.nextLine();
                    tasks.set(userIntInput, userStringInput);
                    break;
                case 4:
                    for(String task: tasks){
                        System.out.println(" " + task);
                    }
                    break;
            }

        }while(selection != 0);

    }
}

