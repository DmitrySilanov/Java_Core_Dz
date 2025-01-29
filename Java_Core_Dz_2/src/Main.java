import java.util.Scanner;

import static Tasks.Task_1.countEvens;
import static Tasks.Task_2.elementDifference;
import static Tasks.Task_3.zeroElement;

public static void main(String[] args) {
    System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    System.out.println("Введите значения!");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Длина массива: ");
    int lengthArray = scanner.nextInt();

    countEvens(new int[lengthArray]);

    elementDifference(new int[lengthArray]);

    zeroElement(new int[lengthArray]);

}