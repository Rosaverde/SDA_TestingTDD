import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayExampleTest {
  ArrayExample arrayExample;

  @BeforeEach
  void setUp() {
    arrayExample = new ArrayExample();
  }

  @Test
  void shouldFindLowestAndHighest() {
    // given
    int[] array = {1, 2, 3, 4, 5};
    int[] expectingResultArray = {1, 5};
    // when
    int[] actualArray = arrayExample.findLowestAndHighest(array);
    // then
    assertThat(actualArray).isEqualTo(expectingResultArray);
  }

  @Test
  void shouldFindMostFrequent() {
    // given
    int[] array = {1,2,3,4,5,2,2,3};
    int expectedValue = 2;
    // when
    int actualValue = arrayExample.findMostFrequent(array);
    // then
    assertThat(actualValue).isEqualTo(expectedValue);
  }
  @Test
  void shouldReverseArray() {
    // given
    int[] array = {1,2,3,4,5};
    int[] expectingArray = {5,4,3,2,1};
    // when
    int[] actualArray = arrayExample.reverseArray(array);
    // then
    assertThat(actualArray).isEqualTo(expectingArray);
  }
  @Test
  void shouldRemoveDuplicates() {
    // given
    String[] arrayWithDuplicates = {"Toyota"," Volkswagen",
        "Toyota","Mercedes","BMW","Volkswagen",
        "Skoda","BMW","Volkswagen"};

    // when
    String[] arrayWithoutDuplicates = arrayExample.removeDuplicates(arrayWithDuplicates);

    // then
    assertThat(arrayWithoutDuplicates).doesNotHaveDuplicates();
  }
  @Test
  void shouldRemoveDuplicatesIsSubset() {
    // given
    String[] arrayWithDuplicates = {"Toyota"," Volkswagen",
        "Toyota","Mercedes","BMW","Volkswagen",
        "Skoda","BMW","Volkswagen"};

    // when
    String[] arrayWithoutDuplicates = arrayExample.removeDuplicates(arrayWithDuplicates);

    // then
    assertThat(arrayWithoutDuplicates).isSubsetOf(arrayWithDuplicates);
  }
}
