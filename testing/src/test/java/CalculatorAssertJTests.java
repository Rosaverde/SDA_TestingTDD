import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAssertJTests {
  Calculator calculator;

  @BeforeEach
  void setUp(){
    calculator = new Calculator();
  }

  @Test
  void shouldAddTwoNumbers() {
    // given
    double valueA = 5.2;
    double valueB = 3.1;
    // when

    double actualResult = calculator.add(valueA,valueB);
    // then
    assertThat(actualResult).isEqualTo(8.3);
  }

  @Test
  void shouldSubstractTwoNumbers() {
    // given
    double valueA = 5.2;
    double valueB = 3.1;
    // when
    double actualResult = calculator.substract(valueA,valueB);
    // then
    assertThat(actualResult).isEqualTo(2.1);
  }
  @Test
  void shouldMultiplyTwoNumbers() {
    // given
    double valueA = 3.0;
    double valueB = 4.0;

    // when
    double actualResult = calculator.multiply(valueA, valueB);

    // then
    assertThat(actualResult).isEqualTo(12.0);
  }

  @Test
  void shouldDivideTwoNumbers() {
    // given
    double valueA = 15.0;
    double valueB = 3.0;

    // when
    double actualResult = calculator.divide(valueA, valueB);

    // then
    assertThat(actualResult).isEqualTo(5.0);
  }
}
