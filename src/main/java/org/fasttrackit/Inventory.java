package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private Operation[] operations = new Operation[5];
    private List<Product> products = new ArrayList<>();
    private Controller controller = new Controller();

    public void start() {
        System.out.println("Welcome !");

        int optionUser = 0;

        do {
            configureOperations();
            displayOperations();

            optionUser = controller.getOperationNumberFromUser();
            System.out.println(" Operation selected : " + optionUser);

            switch (optionUser) {

                case 1:
                    createProducts();
                    System.out.println("Created : " + products);
                    break;

                case 2:
                    updateProduct();
                    System.out.println("Product Updated ");
                    break;

                case 3:
                    deleteProduct();
                    System.out.println("Product Deleted ");
                    break;

                case 4:
                    System.out.println("Read existing products in products List : " + products);
                    break;

                case 5:

                    System.out.println("Exit ");
                    break;

                default:
                    System.out.println("Invalid option. Please try again. ");
                    break;
            }
        }
        while ( optionUser != 5 );
        System.out.println("Thank you ! ");
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

    private void configureOperations() {
//        System.out.println("Configure operations");
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
    }

    private void displayOperations() {
        System.out.println("Operations :");

        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i].getName());
        }
    }

    private void updateProduct() {
        System.out.println("Update product :");
        int updatedProductFromUser = controller.getIdUpdatedProductFromUser();
        products.remove(updatedProductFromUser-1);
        System.out.println("Please introduce the details of the updated product: " );
        Product product = new Product();
        product.setIdProduct(updatedProductFromUser);
        System.out.println("Product name: ");
        product.setProductName(controller.getProductNameFromUser());
        System.out.println("Product price: ");
        product.setProductPrice(controller.getProductPriceFromUser());
        products.add(updatedProductFromUser-1,product);
    }

    private void deleteProduct() {
        System.out.println("Delete product :");
        int deleteProductFromUser = controller.getIdDeleteProductFromUser();

        products.remove(deleteProductFromUser - 1);
    }
}

