package lesson1_2;
/**3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
 Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
 10. Вывести полученное число.*/
public class lesson1_2Task3 {

    public static void main(String [] args){

        short integer = 33;

        if (integer > 0)
            System.out.println(integer + 1);
        else if (integer < 0)
            System.out.println(integer - 2);
        else if (integer == 0)
            System.out.println(integer = 10);

    }
}
