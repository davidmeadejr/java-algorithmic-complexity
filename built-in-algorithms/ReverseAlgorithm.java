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
    n = 10;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n); // generates and array of n numbers

    for (int i = 0; i <= n; i++) {
      numbers.add(i); // adds element to the array
    }

    Collections.reverse(numbers); // reverses the array
    System.out.println(numbers); // prints the reversed array
    return numbers;
  }
}
