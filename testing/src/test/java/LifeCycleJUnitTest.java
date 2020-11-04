import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LifeCycleJUnitTest {

  @BeforeAll
  static void setUpAll() {
    System.out.println("Prepare for all tests");
  }

  @AfterAll
  static void tearDownAll() {
    System.out.println("Clean up after all tests");
  }

  @BeforeEach
  public void setUp() {
    System.out.println("Prepare for the test");
  }

  @AfterEach
  public void tearDown() {
    System.out.println("Clean up after the test");
  }

  @Disabled
  @Test
  public void testValid() {
    System.out.println("Correct test");
    assertEquals(1, 1);
  }

  @Test
  @Disabled
  public void testInvalid() {
    System.out.println("Invalid test");
    assertNotEquals(1, 0);
  }
}
