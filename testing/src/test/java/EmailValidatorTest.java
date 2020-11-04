import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmailValidatorTest {
  EmailValidator emailValidator;

  @BeforeEach
  void setUp() {
    emailValidator = new EmailValidator();
  }

  @Test
  void emailShouldCointainAtSymbol() {
    // given
    String emailWithoutAt = "john.smithgmail.com";
    String emailWithAt = "john.smith@gmail.com";

    // when
    boolean validationResultWithoutAt = emailValidator.isValid(emailWithoutAt);
    boolean validationResultWithAt = emailValidator.isValid(emailWithAt);

    // then
    assertThat(validationResultWithoutAt).isFalse();
    assertThat(validationResultWithAt).isTrue();
  }

  @Test
  void emailShouldContainDot() {
    // given
    String emailWithoutDot = "john.smith@gmailcom";
    String emailWithDot = "john.smith@gmail.com";

    // when
    boolean validationResultWithoutDot = emailValidator.isValid(emailWithoutDot);
    boolean validationResultWithDot = emailValidator.isValid(emailWithDot);

    // then
    assertThat(validationResultWithoutDot).isFalse();
    assertThat(validationResultWithDot).isTrue();
  }

  @Test
  void emailShouldHaveAtLeast5Characters() {
    // given
    String tooShortEmail = "a@.b";
    String normalEmail = "a@b.c";

    // when
    boolean validationResultTooShort = emailValidator.isValid(tooShortEmail);
    boolean validationResultNormal = emailValidator.isValid(normalEmail);

    // then
    assertThat(validationResultTooShort).isFalse();
    assertThat(validationResultNormal).isTrue();
  }
}
