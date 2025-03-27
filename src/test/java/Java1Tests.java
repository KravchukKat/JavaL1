import java.nio.DoubleBuffer;

public class Java1Tests {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int k = 10;
        double zDouble = 0.5;

        float maxValueFloat = Float.MAX_VALUE;
        float minValueFloat = Float.MIN_VALUE;
        float overFloat = maxValueFloat + 1;

        double maxValueDouble = Double.MAX_VALUE;
        double minValueDouble = Double.MIN_VALUE;
        double overDouble = Double.MAX_VALUE + 1;

        int maxValueInteger = Integer.MAX_VALUE;
        int minValueInteger = Integer.MIN_VALUE;
        int OverValueInteger = Integer.MAX_VALUE + 1;

        //Применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("Результат сложения: " + (x + y));
        System.out.println("Результат вычитания: " + (x - y));
        System.out.println("Результат умножения: " + (x * y));
        System.out.println("Результат деления: " + (y / x));
        //Применить несколько арифметических операций над int и double в одном выражении
        System.out.println("Результат сложения int + double: " + (zDouble + x));
        System.out.println("Результат умножения int + double: " + (zDouble * x));
        //Применить несколько логических операций ( < , >, >=, <= )
        System.out.println("Проверка boolean, что 0.5 меньше 10 " + (zDouble < x));
        System.out.println("Проверка boolean, что 0.5 больше 10 " + (zDouble > x));
        System.out.println("Проверка boolean, что 0.5 >= 10 " + (zDouble >= x));
        System.out.println("Проверка boolean, что 0.5 <= 10 " + (zDouble <= x));
        System.out.println("Проверка boolean, что 10 == 10 " + (k == x));
        //Максимальный и минимальный диапазон
        System.out.println("Максимальное значение float: " + maxValueFloat);
        System.out.println("Минимальное значение float: " + minValueFloat);
        System.out.println("Максимальное значение double: " + maxValueDouble);
        System.out.println("Минимальное значение double: " + minValueDouble);
        System.out.println("Максимальное значение int: " + maxValueInteger);
        System.out.println("Минимальное значение int: " + minValueInteger);
        //Переполнение
        System.out.println("Переполнение значения int: " + OverValueInteger);
        System.out.println("Переполнение значения double: " + overDouble);
        System.out.println("Переполнение значения float: " + overFloat);

    }
}
