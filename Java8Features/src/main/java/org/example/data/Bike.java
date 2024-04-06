package org.example.data;

public class Bike {
    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String name;
    private String model;
}
