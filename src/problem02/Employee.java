package problem02;

public class Employee extends AOrganizationComponent {
    private String name;
    private String surname;
    private int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee: '" + this.name + " " + this.surname + "' (" + this.salary + "$)");
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    int getQty() {
        return 1;
    }
}
