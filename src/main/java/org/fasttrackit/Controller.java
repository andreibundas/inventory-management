package org.fasttrackit;

import java.util.Scanner;

public class Controller {


    public int getOperationNumberFromUser() {
        System.out.println("Please select an operation ");
        Scanner scanner = new Scanner(System.in);
        int opNr = scanner.nextInt();
        if (opNr == 1 | opNr == 2 | opNr == 3 | opNr == 4 ) {
            return opNr;
        } else {
            System.out.println("invalid option");
            getOperationNumberFromUser();
        }
        return opNr;
    }

    public int nrAddedProductsFromUser() {
        System.out.println("Please indicate the number of products you want to add : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public String getProductNameFromUser() {
            System.out.println("Please enter the name of product :");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
    }

    public int getProductPriceFromUser() {
        System.out.println("Please enter the price of the product :");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getIdDeleteProductFromUser() {
        System.out.println("Please indicate the id of the product you want to delete : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
