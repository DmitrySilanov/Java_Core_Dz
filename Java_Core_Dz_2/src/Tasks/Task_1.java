package Tasks;

import java.util.Random;

public class Task_1 {

    public static int[] countEvens(int[] arrayOne) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(20);
            System.out.print("[" + arrayOne[i] + "] ");
            if (arrayOne[i] % 2 == 0) sum++;
        }
        System.out.println("\n" + "Количество четных элементов в первом массиве: " + sum);
        return arrayOne;

    }
}
