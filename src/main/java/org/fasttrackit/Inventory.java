package org.fasttrackit;

public class Inventory {




    private Operation[] operations = new Operation[4];

    private Controller controller = new Controller();

    public void start() {
        System.out.println("Welcome !");

        configureOperations();

        Operation selectedOperation = getSelectedOperation();

        System.out.println("You have selected : " + selectedOperation.getName());

    }

    private Operation getSelectedOperation() {
        int operationNumberFromUser = controller.getOperationNumberFromUser();
        return operations[operationNumberFromUser - 1];

    }

    private void configureOperations() {
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
        operation4.setName(("Exit"));
        operations[3] = operation4;

        displayOperations();
    }

    private void displayOperations() {
        System.out.println("Available Operations :");

        for (int i = 0; i <operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i].getName());
        }
    }

}

