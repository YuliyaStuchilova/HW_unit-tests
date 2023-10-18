package Homework1.task1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(200, 25)).isEqualTo(150);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной или равна 0!");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(0, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной или равна 0!");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма скидки должна быть между 0 и 100!");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма скидки должна быть между 0 и 100!");

    }
}
