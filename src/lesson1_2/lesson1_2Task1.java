package lesson1_2;
/**1) В переменную записываем число. Надо вывести на экран сколько в этом
 числе цифр и положительное оно или отрицательное. Например, "это
 однозначное положительное число". Достаточно будет определить, является ли
 число однозначным, "двухзначным или трехзначным и более.*/
public class lesson1_2Task1 {
    public static void main(String[] agrs) {

        int targetNumber = 351;

        if (targetNumber < 0) {
            System.out.println("Число отрицательное,");
        } else if (targetNumber > 0) {
            System.out.println("Число положительное,");
        } else {
            System.out.println("Число 0");

        }
        if (targetNumber > 9 && targetNumber < 100) {
            System.out.println("двухзначное.");
        } else if (targetNumber < 10) {
            System.out.println("однозначное.");
        } else {
            System.out.println("трехзначное и более.");
        }
    }
}
