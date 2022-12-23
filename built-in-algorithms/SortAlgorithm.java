/*
  Given a shuffled array, sort the array
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class SortAlgorithm {
  public static void main(String args[]) {
     sortArray();
  }


  public static ArrayList<Integer> sortArray() {
    ArrayList<Integer> arr = new ArrayList<Integer>(50); // generates an array of 50 int
    Random random = new Random();

    for (int i = 0; i <= 50; i++) {
      arr.add(random.nextInt(100)); // generates a random number between 0 - 100 and adds it to the array, repeats this 50 times 
    }
 
    Collections.sort(arr); // sorts the array in ascending order
    System.out.println(arr);
    return arr;
  }
}
