import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Piotr Gumkowski", 4500, 0),
            new Worker("Zuzanna Zuziak", 4234, "Worker"),
            new Employee("Mikołaj Brown", 5235),
            new Employee("Lila Janka", 2676),
            new Worker("Michał Downycki", 27457, "Worker"),
            new Manager("Kamil Nowak", 4500, 0),
            new Worker("Anna Kowalska", 4234, "Worker")
        };

        int niemenagerowie = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                niemenagerowie++;
            }
            
        }
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500); {
            }
            
        }
        ((Manager) employees[0]).setNumberOfSubordinates(niemenagerowie);
        employees[0].setSalary(7500);
        ((Manager) employees[5]).setNumberOfSubordinates(niemenagerowie);
        employees[5].setSalary(7500);

        System.out.println("dane dla wszystkich pracownikow:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
