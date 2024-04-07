import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Piotr Gumkowski", 4500, 0),
            new Worker("Zuzanna Zuziak", 4234,"Worker" ),
            new Employee("Mikołaj Brown", 5235),
            new Employee("Lila Janka", 2676),
            new Worker("Michał Downycki", 27457, "Worker"),
        };

        int niemenagerowie = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                niemenagerowie++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(niemenagerowie);
        employees[0].setSalary(7500);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
