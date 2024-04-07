public class Company {
    public static void main(String[] args) {
        Employee[] Employees = {
            new Employee("Piotr Gumkowski", 4500),
            new Employee("Zuzanna Zuziak", 4234),
            new Employee("Mikołaj Brown", 5235),
            new Employee("Lila Janka", 2676),
            new Employee("Michał Downycki", 27457)
        };

        System.out.println("dane pracownika o indeksie 3:");
        System.out.println(Employees[3]);

        Employees[3].setSalary(3500);
        System.out.println("nowa wyplata pracownika o indeksie rownym 3: " + Employees[3].getSalary());

        System.out.println("dane dla wszystkich pracownikow:");
        for (Employee employee : Employees) {
            System.out.println(employee);
        }
    }
}
