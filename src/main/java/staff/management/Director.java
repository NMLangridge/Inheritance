package staff.management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String deptName, double budget) {
        super(name, nationalInsuranceNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

}
