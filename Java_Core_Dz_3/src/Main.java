import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Worker> employees = new ArrayList<>();

        employees.add(new Worker("Иван Иванов", 50000, 27));
        employees.add(new Manager("Дмитрий Силанов", 85500, 33));
        employees.add(new Worker("Анастасия Маркова", 46000, 52));

        System.out.println("До повышения зарплаты:");
        for (Worker employee : employees
        ) {
            System.out.println(employee);
        }


        Manager.increaseSalary(employees.toArray(new Worker[0]), 1200);
        System.out.println("\nПосле повышения зарплаты:");
        for (Worker employee : employees) {
            System.out.println(employee);
        }


        Collections.sort(employees, new SalaryCompare());
        System.out.println("\nСортировка после повышения зарплаты:");
        for (Worker employee : employees) {
            System.out.println(employee);
        }

        
        Collections.sort(employees, new AgeCompare());

        System.out.println("\nПосле сортировки по возрасту:");
        for (Worker employee : employees) {
            System.out.println(employee);
        }
    }
}