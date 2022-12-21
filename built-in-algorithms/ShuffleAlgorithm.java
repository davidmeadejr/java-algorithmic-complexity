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
    ArrayList<Integer> nums = new ArrayList<Integer>(n);
    Random random = new Random();
 
    for (int i = 0; i <= n; i++) {
      nums.add(random.nextInt(46));
    }

    System.out.println(nums);
    return nums;
  }
}
