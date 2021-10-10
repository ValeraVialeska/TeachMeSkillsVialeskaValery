package lesson1_2;

/**1) В переменную записываем число. Надо вывести на экран сколько в этом
 числе цифр и положительное оно или отрицательное. Например, "это
 однозначное положительное число". Достаточно будет определить, является ли
 число однозначным, "двухзначным или трехзначным и более.*/



public class lesson1_2Task1 {
    public static void main(String[] agrs) {

        int number1 = 351;

        if (number1 < 0) {
            System.out.println("Число отрицательное,");
        } else if (number1 > 0) {
            System.out.println("Число положительное,");
        } else {
            System.out.println("Число 0");

        }
        if (number1 > 9 && number1 < 100) {
            System.out.println("двухзначное.");
        } else if (number1 < 10) {
            System.out.println("однозначное.");
        } else {
            System.out.println("трехзначное и более.");
        }
    }
}
