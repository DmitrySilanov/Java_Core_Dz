public class Worker {

    private String name;
    private double salary;
    private int age;


    public Worker(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }


    public void increaseSalary(double amount) {
        salary += amount;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                "age =" + age +'}';
    }
}