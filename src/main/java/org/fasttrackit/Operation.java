package org.fasttrackit;

public class Operation {

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "name='" + name + '\'' +
                '}';
    }
}
