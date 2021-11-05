package org.fasttrackit;

import java.util.Scanner;

public class Controller {


    public int getOperationNumberFromUser() {

        System.out.println("Please select an operation ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
