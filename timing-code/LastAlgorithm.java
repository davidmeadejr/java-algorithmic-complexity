class LastAlgorithm {
	public static int[] numbers = {1, 4, 77, 10, 11, 12 , 849, 69, 112}; 

	public static void main(String args[]) {
		getLastElement(numbers);
	}

	public static int getLastElement(int[] numbers) {
		int lastNumber = numbers[numbers.length - 1];

		System.out.println(lastNumber);
		return lastNumber;
	}
}
