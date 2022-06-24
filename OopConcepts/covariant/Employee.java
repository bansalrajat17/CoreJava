package oopconcepts.covariant;

public class Employee extends Person {
    @Override
    public Employee get(){
        return this;
    }

    public String message(){
        return "Employee";
    }
}
