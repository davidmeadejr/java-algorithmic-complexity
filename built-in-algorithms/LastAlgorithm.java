/*:
	Given an array, return the last element
	using the the .last ruby equivalent in java 
*/

import java.util.ArrayList;
import java.util.*;


class LastAlgorithm {
  public static void main(String args[]) {
    for (int size = 50000; size <= 1000000; size += 50000) {
      ArrayList<Integer> arrayOfNums = genArray(size);

      long startTime = System.nanoTime();

      getLastElement(arrayOfNums);

      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.print(size + "\t");
      System.out.println(duration);
    }
  }

  public static ArrayList<Integer> genArray(int n) {;
    ArrayList<Integer> numbers = new ArrayList<Integer>(n); // generates and array of n numbers
  
    for (int i = 0; i <= n; i++) {
      numbers.add(i); // adds a number to the array and repeats the process n times
    }

    // System.out.println(numbers);
    return numbers;
  }

  public static int getLastElement(ArrayList<Integer> listOfNums) {

    // System.out.println(listOfNums.get(listOfNums.size() - 1)); // prints the last element in the array
    return listOfNums.get(listOfNums.size() - 1);
  }
}

// Create a new method that generates array n length

//
