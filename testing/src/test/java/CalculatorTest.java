import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void shouldAddTwoNumbers() {
    // given
    double valueA = 5.2;
    double valueB = 3.1;

    // when
    double actualResult = calculator.add(valueA, valueB);

    // then
    assertEquals(8.3, actualResult);
  }

  @Test
  void shouldSubstractTwoNumbers() {
    // given
    double valueA = 5.2;
    double valueB = 3.1;

    // when
    double actualResult = calculator.substract(valueA, valueB);

    // then
    assertEquals(2.1, actualResult);
  }

  @Test
  void shouldMultiplyTwoNumbers() {
    // given
    double valueA = 3.0;
    double valueB = 4.0;

    // when
    double actualResult = calculator.multiply(valueA, valueB);

    // then
    assertEquals(12.0, actualResult);
  }

  @Test
  void shouldDivideTwoNumbers() {
    // given
    double valueA = 15.0;
    double valueB = 3.0;

    // when
    double actualResult = calculator.divide(valueA, valueB);

    // then
    assertEquals(5.0, actualResult);
  }
}
