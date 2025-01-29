import java.util.Comparator;


public class AgeCompare implements Comparator<Worker> {

    @Override
    public int compare(Worker emp1, Worker emp2) {
        int age1 = (int) emp1.getAge();
        int age2 = (int) emp2.getAge();


        if (age1 < age2) {
            return -1;
        } else if (age1 > age2) {
            return 1;
        } else {
            return 0;
        }
    }
}