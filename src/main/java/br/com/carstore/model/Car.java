

package br.com.carstore.model;

public class Car {

    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


