/*
	Given an array return the array in reverse
*/

import java.util.ArrayList;
import java.util.*;

class ReverseAlgorithmDIY {
  public static void main(String args[]) {
    long startTime = System.nanoTime();

    reverseArrayDIY();

    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(duration);
  }

  public static ArrayList<Integer> reverseArrayDIY() {
    int n;
    n = 50000;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n); // generates and array of n numbers

    for (int i = 0; i <= n; i++) {
      numbers.add(i); // adds element to the array
    }

    ArrayList<Integer> result = new ArrayList<Integer>(n); // create a new array with the space to hold n numbers

    // Insert every number in numbers array into the result array starting with the last element and then decrementing
    for (int i = numbers.get(numbers.size() - 1); i >= 0; --i) {
      int element = numbers.get(i);
      result.add(element);
    }
    
    System.out.println(result);
    return numbers;
  }
}
