import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringExerciseTest {

  @Test
  void verifyWordsPalindrom() {
    // given
    String word1 = "Racecar";
    String word2 = "kajas";

    // when
    boolean isPalindrom = StringExercise.verifyWordPalindrom(word1);
    boolean isNotPalindrom = StringExercise.verifyWordPalindrom(word2);

    // then
    assertThat(isPalindrom).isTrue();
    assertThat(isNotPalindrom).isFalse();
  }

  @Test
  void verifyWordsAnagram() {
    // given
    String word1 = "Listen";
    String word2 = "Silent";
    String wordNotAnagram = "Still";
    // when
    boolean isAnagram = StringExercise.verifyWordAnagram(word1, word2);
    boolean isNotAnagram = StringExercise.verifyWordAnagram(word1, wordNotAnagram);

    // then
    assertThat(isAnagram).isTrue();
    assertThat(isNotAnagram).isFalse();
  }
}
