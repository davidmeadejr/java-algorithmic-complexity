/*:
	Given an array, return the last element
	using the the .last ruby equivalent in java 
*/

import java.util.ArrayList;
import java.util.*;


class LastAlgorithm {
  public static void main(String args[]) {
    long startTime = System.nanoTime();

    getLastElement();

    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(duration);
  }

  public static int getLastElement() {
    int n = 50000;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n); // generates and array of n numbers
  
    for (int i = 0; i <= n; i++) {
      numbers.add(i); // adds a number to the array and repeats the process n times
    }

    System.out.println(numbers.size() - 1); // prints the last element in the array
    return numbers.size() - 1;
  }
}
