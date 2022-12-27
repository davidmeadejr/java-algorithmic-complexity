/*
  Given a shuffled array, sort the array
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.*;

class SortAlgorithm {
  public static void main(String args[]) {
    long startTime = System.nanoTime();

    sortArray();

    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(duration);
  }


  public static ArrayList<Integer> sortArray() {
    ArrayList<Integer> arr = new ArrayList<Integer>(1000000); // generates an array of n int
    Random random = new Random();

    for (int i = 0; i <= 1000000; i++) {
      arr.add(random.nextInt(100)); // generates a random number between 0 - 100 and adds it to the array, repeats this 50 times 
    }
 
    Collections.sort(arr); // sorts the array in ascending order
    System.out.println(arr);
    return arr;
  }
}
