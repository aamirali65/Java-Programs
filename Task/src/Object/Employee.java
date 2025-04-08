package Object;

public class Employee {
    double salary;

    void setSalary(double salary) {
        this.salary = salary;
    }

    void calculateTax() {
        double tax = salary * 0.1;
        System.out.println("Tax: " + tax);
    }
}
