package lesson1_2;
/**2) Треугольник существует только тогда, когда сумма любых двух его сторон
        больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
        стороны предполагаемого треугольника. Требуется сравнить длину каждого
        отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
        окажется больше суммы двух других, то треугольника с такими сторонами не
        существует*/
public class lesson1_2Task2 {

    public static void main(String[] args) {

        int     sideA = 4,
                sideB= 8,
                sideC= 14;

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) ;
        {

            System.out.println("Треугольник  существует");
        }
        if (sideA + sideB < sideC && sideA + sideC < sideB && sideC + sideB < sideA) {
            System.out.println("Треугольник не существует");

        }
    }
}