import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest {

  @Test
  void shouldNotMakePaymentIfNotEnughtMoney() {
    Account account = new Account("John", "Smith", "1234567890", 100.0);

    boolean paymentResult = account.makePayment(150);

    assertFalse(paymentResult);
  }

  @Test
  void shouldMakePaymentIfEnoughMoney() {
    Account account1 = new Account("John", "Smith", "123456", 100.0);

    boolean paymentResult = account1.makePayment(100);

    assertTrue(paymentResult);
  }

  @Test
  void accountNumberShouldHave26Digits() {
    Account account1 = new Account("John", "Smith", "1234567890123456789012345", 100.0);
    Account account2 = new Account("John", "Smith", "12345678901234567890123456", 100.0);
    boolean numberValidationResult1 = account1.validateNumber();
    boolean numberValidationResult2 = account2.validateNumber();
    assertFalse(numberValidationResult1);
    assertTrue(numberValidationResult2);
  }
}
