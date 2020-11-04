public class StringExercise {
  public static boolean verifyWordPalindrom(String word) {

    String data = word.toLowerCase();
    int length = data.length();
    for (int i = 0; i < length / 2; i++) {
      if (data.charAt(i) != data.charAt(length - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static boolean verifyWordAnagram(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    int[] counters = new int['z' - 'a' + 1];

    // we add the letters in the first word
    for (int i = 0; i < word1.length(); i++) {
      counters[word1.charAt(i) - 'a']++;
    }
    // we subtract the occurrences of the letters in the second word
    for (int i = 0; i < word2.length(); i++) {
      counters[word2.charAt(i) - 'a']--;
    }
    // we check if each character has appeared the same number of times
    //  if the array contains all 0 it means it's an anagram
    for (int i = 0; i < counters.length; i++) {
      if (counters[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
