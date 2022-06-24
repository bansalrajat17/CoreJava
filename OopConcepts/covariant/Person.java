package oopconcepts.covariant;

public class Person {
    private String name;

    public Person get(){
        return this;
    }

    public String message(){
        return "Person";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
