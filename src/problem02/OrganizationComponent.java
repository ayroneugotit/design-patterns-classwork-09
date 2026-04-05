package problem02;

abstract class OrganizationComponent {
    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void display(int level);
    public abstract double getBudget();
    public abstract int getEmployeeCount();
    public OrganizationComponent findByName(String name) {
        return null;
    }
}
