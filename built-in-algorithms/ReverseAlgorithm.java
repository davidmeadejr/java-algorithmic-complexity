/*
  Given an array return the array in reverse.
*/

import java.util.ArrayList;
import java.util.Collections;

class ReverseAlgorithm {
  public static void main(String args[]) {
    reverseArray();
  }

  public static ArrayList<Integer> reverseArray() {
    int n;
    n = 25;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n);

    for (int i = 0; i <= n; i++) {
      numbers.add(i);
    }

    Collections.reverse(numbers);
    System.out.println(numbers);
    return numbers;
  }
}
