package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, int niNumber, double salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

}
