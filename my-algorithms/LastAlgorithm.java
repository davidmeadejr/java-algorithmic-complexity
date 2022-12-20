import java.util.LinkedList;

class LastAlgorithm {	
  // public static int[] numbers = {1, 4, 77, 10, 11, 12 , 849, 69, 112}; 

  public static void main(String args[]) {
    // defines the first and last element in the array
    int firstNum;
    int lastNum;

    firstNum = 10;
    lastNum = 100;

    generateArray(firstNum, lastNum); // prints the array

    // Get the current time
    // getLastElement(numbers);
    // Get the current time
    // Get difference
    // print array size time in ms
  }

  // generates an array of n numbers
  public static LinkedList  generateArray(int firstNum, int lastNum) {
    LinkedList<Integer> arrayOfNums = new LinkedList<Integer>();
    for (int i = firstNum; firstNum <= lastNum; i++) {
      arrayOfNums.add(i);
      System.out.println(arrayOfNums);
      return arrayOfNums;
    }

    System.out.println(arrayOfNums);
    return arrayOfNums;
  }

  // gets the last element of the array
  public static int getLastElement(int[] numbers) {
    int lastNumber = numbers[numbers.length - 1];

    System.out.println(lastNumber);
    return lastNumber;
  }
}
