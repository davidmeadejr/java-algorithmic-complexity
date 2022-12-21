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
    int n = 7;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n);
  
    for (int i = 0; i <= n; i++) {
      numbers.add(i);
    }

    System.out.println(numbers.size() - 1);
    return numbers.size() - 1;
  }
}
