package problem02;

import java.util.ArrayList;
import java.util.List;

class Department extends OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        }
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int level) {
        System.out.println(" ".repeat(level) + "Отдел: " + name);
        for (OrganizationComponent component : components) {
            component.display(level + 2);
        }
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (OrganizationComponent component : components) {
            total += component.getBudget();
        }
        return total;
    }

    @Override
    public int getEmployeeCount() {
        int total = 0;
        for (OrganizationComponent component : components) {
            total += component.getEmployeeCount();
        }
        return total;
    }

    @Override
    public OrganizationComponent findByName(String name) {
        for (OrganizationComponent component : components) {
            OrganizationComponent result = component.findByName(name);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public void listAllEmployees() {
        for (OrganizationComponent component : components) {
            if (component instanceof Employee) {
                component.display(0);
            } else if (component instanceof Department) {
                ((Department) component).listAllEmployees();
            }
        }
    }
}
