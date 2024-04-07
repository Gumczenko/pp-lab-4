import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] Employees = {
            new Manager("Piotr Gumkowski", 4500, 0),
            new Worker("Zuzanna Zuziak", 4234,"Worker" ),
            new Employee("Mikołaj Brown", 5235),
            new Employee("Lila Janka", 2676),
            new Worker("Michał Downycki", 27457, "Worker"),
        };

        System.out.println("dane dla wszystkich pracownikow:");
        for (Employee employee : Employees) {
            System.out.println(employee);
        }
    }
}
