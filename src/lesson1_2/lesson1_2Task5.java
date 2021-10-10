package lesson1_2;

/**5) Даны 3 целых числа. Найти количество положительных и отрицательных
 чисел в исходном наборе.*/

public class lesson1_2Task5 {
    public static void main (String [] agrs) {


        byte number1 = -23;
        byte number2 = 15;
        byte number3 = 10;

        if (number1 > 0)
            System.out.println("положительное");
        else if (number1 < 0)
            System.out.println("отрицательное");
        if (number2 > 0)
            System.out.println("положительное");
        else if (number2 < 0)
            System.out.println("отрицательное");
        if (number3 > 0)
            System.out.println("положительное");
        else if (number3 < 0)
            System.out.println("отрицательное");
    }
}
