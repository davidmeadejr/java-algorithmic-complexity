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
    ArrayList<Integer> nums = new ArrayList<Integer>(1000000); // generates an array of with an initial size of 1000000
    Random random = new Random(); 
 
    for (int i = 0; i <= 1000000; i++) {
      nums.add(random.nextInt()); // adds a random number.
    }

    System.out.println(nums); // prints the shuffled array
    return nums;
  }
}
