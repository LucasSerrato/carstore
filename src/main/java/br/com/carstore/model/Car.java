

package br.com.carstore.model;

public class Car {

    private String id;
    private String name;

    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return String.valueOf(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


