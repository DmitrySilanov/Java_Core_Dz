public class Manager extends Worker {


    public Manager(String name, double salary, int age) {
        super(name, salary, age);
    }

    public static void increaseSalary(Worker[] employees, double amount) {
        for (Worker employee : employees
        ) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }

}