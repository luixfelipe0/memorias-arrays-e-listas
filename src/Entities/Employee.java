package Entities;

public class Employee {

    private int ID;
    private String name;
    private double salary;

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(double percentage) {
        this.salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return ID + ", " + name + ", " + salary;
    }
}
