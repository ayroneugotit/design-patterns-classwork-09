package problem02;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Алексей", "Программист", 3500);
        Employee e2 = new Employee("Мария", "UX-дизайнер", 2800);
        Contractor c1 = new Contractor("Дмитрий", "Бизнес-консультант", 2200);

        Department devDept = new Department("Development");
        devDept.add(e1);
        devDept.add(c1);

        Department designDept = new Department("Design");
        designDept.add(e2);

        Department headOffice = new Department("Head Office");
        headOffice.add(devDept);
        headOffice.add(designDept);

        headOffice.display(0);

        System.out.println("\nБюджет: " + headOffice.getBudget());
        System.out.println("Количество сотрудников: " + headOffice.getEmployeeCount());

        System.out.println("\nПоиск сотрудника:");
        OrganizationComponent found = headOffice.findByName("Anna");
        if (found != null) {
            found.display(0);
        }

        System.out.println("\nСписок всех сотрудников:");
        headOffice.listAllEmployees();

        e1.setSalary(3500);

        System.out.println("\nОбновленный бюджет: " + headOffice.getBudget());
    }
}
