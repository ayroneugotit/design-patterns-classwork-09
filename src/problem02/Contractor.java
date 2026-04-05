package problem02;

class Contractor extends Employee {

    public Contractor(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public double getBudget() {
        return 0;
    }
}

