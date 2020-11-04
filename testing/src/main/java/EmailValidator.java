import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
  public boolean isValid(String email) {
    Pattern pattern = Pattern.compile("^.+@.+\\..+$");
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }
}
