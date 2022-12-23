/*:
	Given an array, return the last element
	using the the .last ruby equivalent in java 
*/

import java.util.ArrayList;

class LastAlgorithm {
  public static void main(String args[]) {
     getLastElement();
  }

  public static int getLastElement() {
    int n = 10;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n); // generates and array of n numbers
  
    for (int i = 0; i <= n; i++) {
      numbers.add(i); // adds a number to the array and repeats the process n times
    }

    System.out.println(numbers.size() - 1); // prints the last element in the array
    return numbers.size() - 1;
  }
}
