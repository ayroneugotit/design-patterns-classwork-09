package problem02;

public class Main {
    public static void main(String[] args) {
        Department department2 = new Department("Secondary");
        department2.addComponent(new Employee("Didarbek", "Ramazanov", 1000));
        department2.addComponent(new Employee("Maksim", "Shakhlovich", 1200));
        department2.addComponent(new Employee("Kirill", "Filatov", 900));

        Department department1 = new Department("Main");
        department1.addComponent(department2);
        department1.addComponent(new Employee("Polina", "Orekhova", 1500));

        department1.display();
        System.out.println(department1.getSalary());
        System.out.println(department1.getQty());
    }
}
