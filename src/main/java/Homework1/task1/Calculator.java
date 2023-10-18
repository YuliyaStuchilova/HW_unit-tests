package Homework1.task1;


//Задание 1. ** В классе Calculator создайте метод calculateDiscount,
//        который принимает сумму покупки и процент скидки и возвращает сумму с
//        учетом скидки. Ваша задача - проверить этот метод с использованием
//        библиотеки AssertJ. Если метод calculateDiscount получает недопустимые
//        аргументы, он должен выбрасывать исключение ArithmeticException.
//        Не забудьте написать тесты для проверки этого поведения.
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Сумма покупки с учётом скидки: " + calculatingDiscount(100, 10)
                + " c.u.");
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new ArithmeticException("Сумма покупки не может быть отрицательной или равна 0!");
        if (discountAmount < 0 || discountAmount > 100)
            throw new ArithmeticException("Сумма скидки должна быть между 0 и 100!");

        double result = purchaseAmount - (purchaseAmount / 100 * discountAmount);
        return result;
    }
}
