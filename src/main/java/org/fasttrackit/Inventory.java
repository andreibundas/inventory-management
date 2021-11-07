package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Inventory {

    private Operation[] operations = new Operation[5];
    private List<Product> products = new ArrayList<>();

    private Controller controller = new Controller();

    public void start() {
        System.out.println("Welcome !");

        do {

            configureOperations();

            int optionUser = controller.getOperationNumberFromUser();
            System.out.println(" optionUser: " + optionUser);


//            Operation selectedOperation = getSelectedOperation();
//
//            System.out.println("You have selected : " + selectedOperation.getName());

//            char optionUser = (char) controller.getOperationNumberFromUser();


            switch (optionUser) {

                case 1:

                    createProducts();

                    System.out.println("Created Product: " + products);
                    break;

                case 2:

                    System.out.println("Update Product: ");
                    break;

                case 3:
                    deleteProduct();
                    System.out.println("Delete Product: ");
                    break;

                case 4:
                    System.out.println("Read existing products in products List : " + products);
                    break;

                case 5:

                    System.out.println("Exit: ");
                    break;


                default:
                    System.out.println("Invalid option. Please try again. ");
            }

        }
        while (controller.getOperationNumberFromUser() != 5);
        System.out.println("While: " + controller.getOperationNumberFromUser());

    }

    private void createProducts() {
        int nrAddProd = controller.nrAddedProductsFromUser();

        for (int i = 1; i <= nrAddProd; i++) {

            Product product = new Product();
            product.setIdProduct(i);
            product.setProductName(controller.getProductNameFromUser());
            product.setProductPrice(controller.getProductPriceFromUser());

            products.add(product);

        }
    }

    private Operation getSelectedOperation() {
        int operationNumberFromUser = controller.getOperationNumberFromUser();
        return operations[operationNumberFromUser - 1];
    }

    private void configureOperations() {
        System.out.println("Configure operations");
        Operation operation1 = new Operation();
        operation1.setName("Add Products");
        operations[0] = operation1;

        Operation operation2 = new Operation();
        operation2.setName("Update Products");
        operations[1] = operation2;

        Operation operation3 = new Operation();
        operation3.setName(("Delete Products"));
        operations[2] = operation3;

        Operation operation4 = new Operation();
        operation4.setName(("Print existing Products"));
        operations[3] = operation4;

        Operation operation5 = new Operation();
        operation5.setName(("Exit"));
        operations[4] = operation5;

        displayOperations();
    }

    private void displayOperations() {
        System.out.println("Available Operations :");

        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i].getName());
        }
    }

    private void deleteProduct() {
        System.out.println("Delete product :");
        int deleteProductFromUser = controller.getIdDeleteProductFromUser();

        products.remove(deleteProductFromUser - 1);
    }

}

