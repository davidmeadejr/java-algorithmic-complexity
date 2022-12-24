/*
  Given an array, shuffle the array.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

class ShuffleAlgorithm {
  public static void main(String args[]) {
    long startTime = System.nanoTime();

    shuffleArray();

    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(duration);
  }

  public static ArrayList<Integer> shuffleArray() {
    ArrayList<Integer> nums = new ArrayList<Integer>(50); // generates an array of n numbers
    Random random = new Random(); 
 
    for (int i = 0; i <= 10; i++) {
      nums.add(random.nextInt(100)); // adds a random number between 0 - 46, n number of times
    }

    System.out.println(nums); // prints the shuffled array
    return nums;
  }
}
