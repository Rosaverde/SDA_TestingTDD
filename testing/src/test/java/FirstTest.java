import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FirstTest {

  private final String myName = "Heisenberg";
  private String myNameLower = myName.toLowerCase();

  @Test
  public void sayMyNameTestValid() {
    String yourNameIs = "Heisenberg";
    assertEquals(myName,yourNameIs);
  }

  @Test
  public void sayMyNameTestInvalid() {
    String yourNameIs = "Molotov";
    assertNotEquals(myName, yourNameIs);
  }

  @Test
  public void sayMyNameToLowerCaseTestValid() {
    String yourNameIs = "Heisenberg";
    yourNameIs = yourNameIs.toLowerCase();
    assertEquals(myNameLower,yourNameIs);
  }

  @Test
  public void assertJTest() {
    String[] textArray = {"Text", "otherText"};
    assertThat(textArray).hasSize(2).contains("Text","otherText");
  }

}
