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

        int programmer = 99;

        if (programmer % 10 == 1 || programmer % 100 == 1){
            System.out.println(programmer + "программист");
        }
        if (programmer % 10 == 2 || programmer % 100 == 2 || programmer % 10 == 3 || programmer % 100 == 3 || programmer % 10 == 4 || programmer % 100 == 4){
            System.out.println(programmer +"программиста");
        }
        if (programmer % 10 == 11 || programmer % 100 == 11 || programmer % 10 == 12 || programmer % 100 == 12 || programmer % 10 == 13 || programmer % 100 == 13 || programmer % 10 == 14 || programmer % 100 == 14){
            System.out.println(programmer +"программистов");
        }
        else if (programmer % 10 == 5 || programmer % 100 == 5 || programmer % 10 == 6 || programmer % 100 == 6 || programmer % 10 == 7 || programmer % 100 == 7 || programmer % 10 == 8 || programmer % 100 == 8 || programmer % 10 == 9 || programmer % 100 == 9) {
            System.out.println(programmer + "программистов");
        }
        }
}
/** В общем и получилось,и как бы нет я считаю.Хотелось бы услышать ваши коментарии по поводу укорочения кода,и я так понимаю если числа больше ста то работать ничего не будет. */