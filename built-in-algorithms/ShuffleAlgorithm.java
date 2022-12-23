/*
  Given an array, shuffle the array.
*/

import java.util.ArrayList;
import java.util.Random;

class ShuffleAlgorithm {
  public static void main(String args[]) { 
    int n;
    n = 10;

    shuffleArray(n);
  }

  public static ArrayList<Integer> shuffleArray(int n) {
    ArrayList<Integer> nums = new ArrayList<Integer>(n); // generates an array of n numbers
    Random random = new Random(); 
 
    for (int i = 0; i <= n; i++) {
      nums.add(random.nextInt(46)); // adds a random number between 0 - 46, n number of times
    }

    System.out.println(nums); // prints the shuffled array
    return nums;
  }
}
