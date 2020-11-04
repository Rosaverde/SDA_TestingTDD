import java.util.Arrays;

public class ArrayExample {
  public ArrayExample() {}

  public int[] findLowestAndHighest(int[] array) {
    int min = array[0];
    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
      if (max < array[i]) {
        max = array[i];
      }
    }
    int[] resultArray = {min, max};
    System.out.println("Smallest value in array is: " + min);
    System.out.println("Biggest value in array is: " + max);
    return resultArray;
  }

  public int findMostFrequent(int[] array) {
    int count = 0;
    int maxCount = 0;
    int id = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j]) {
          count++;
        }
      }
      if (maxCount < count) {
        maxCount = count;
        id = i;
      }
      count = 0;
    }
    return array[id];
  }

  public int[] reverseArray(int[] array) {
    System.out.println(Arrays.toString(array));
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;

      start++;
      end--;
    }
    System.out.println(Arrays.toString(array));
    return array;
  }

  public String[] removeDuplicates(String[] arrayWithDuplicates) {
    return Arrays.stream(arrayWithDuplicates).distinct().toArray(String[]::new);
  }
}
