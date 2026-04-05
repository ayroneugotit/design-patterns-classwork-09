package problem02;

class Employee extends OrganizationComponent {
    protected String name;
    protected String position;
    protected double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display(int level) {
        System.out.println(" ".repeat(level) + "Сотрудник: " + name + ", " + position + ", зарплата: " + salary);
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    @Override
    public OrganizationComponent findByName(String name) {
        if (this.name.equalsIgnoreCase(name)) {
            return this;
        }
        return null;
    }
}
