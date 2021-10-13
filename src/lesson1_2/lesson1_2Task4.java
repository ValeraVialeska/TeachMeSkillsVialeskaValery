package lesson1_2;
/**4) Даны 3 целых числа. Найти количество положительных чисел в исходном
 наборе.*/
public class lesson1_2Task4 {
    public static void main (String [] arg){

        int firstInteger = -37;
        int secondInteger = 1;
        int thirdInteger = 29;
        int  counter = 0;

        if (firstInteger > 0) {
            System.out.println("положительное");
            counter++;
        }
        if (secondInteger > 0) {
            System.out.println("положительное");
            counter++;
        }
        if (thirdInteger > 0) {
            System.out.println("положительное");
            counter++;
        }
        System.out.println(counter);

    }

}
