import java.util.Comparator;


public class SalaryCompare implements Comparator<Worker> {

    @Override
    public int compare(Worker emp1, Worker emp2) {
        double salary1 = emp1.getSalary();
        double salary2 = emp2.getSalary();


        if (salary1 < salary2) {
            return -1;
        } else if (salary1 > salary2) {
            return 1;
        } else {
            return 0;
        }
    }
}