 package lesson1_2;
/**7) (Дополнительно) В переменную записываете количество программистов. В
 зависимости от количества программистов необходимо вывести правильно
 окончание. Например:
 • 2 программиста
 • 1 программиста
 • 10 программистов
 • и т.д
 1, 21, 31... - программист
 2, 3, 4, 22, 23, 24... - программиста
 11, 12, 13, 14 - программистов

 */
public class lesson1_2Task7 {
    public static void main(String[] args) {

        int programmer = 56;

        if (programmer > 100 );{
            System.out.println(programmer %= 100);
        }
             if (programmer < 100);{
            System.out.println(programmer %= 10);
        }
        
        if (programmer == 1);{
            System.out.println("программист");
        }

        if (programmer == 11 || programmer == 12 || programmer == 13 || programmer == 14);{
            System.out.println("программистов");
        }
        if (programmer == 2 || programmer == 3 || programmer == 4);{
            System.out.println("программиста");
        }if (programmer == 5 || programmer == 6 || programmer == 7 || programmer == 8 || programmer == 9);{
            System.out.println("программистов");
        }

    }
}
/** что то я не понимаю почему оно не считывает нужное значение  а просто все*/