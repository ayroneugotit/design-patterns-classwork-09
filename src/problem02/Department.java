package problem02;

import java.util.ArrayList;
import java.util.List;

public class Department extends AOrganizationComponent {
    private List<AOrganizationComponent> components;
    private String name;

    public Department(String name) {
        this.components = new ArrayList<>();
        this.name = name;
    }

    public void addComponent(AOrganizationComponent component) {
        if (this.components.contains(component)) return;
        this.components.add(component);
    }

    @Override
    void display() {
        System.out.println("Department: '" + this.name + "'");
        for (AOrganizationComponent component : this.components) {
            component.display();
        }
    }

    @Override
    int getSalary() {
        int totalSalary = 0;
        for (AOrganizationComponent component : this.components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    @Override
    int getQty() {
        int totalQty = 0;
        for (AOrganizationComponent component : this.components) {
            totalQty += component.getQty();
        }
        return totalQty;
    }
}
