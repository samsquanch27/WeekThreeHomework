
public class Week3Homework {
	public static void main (String[] args) {
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int[] ages = new int[] {3,9,23,64,2,8,28,28};
		int average = 0;
		double nameSum = 0;
		System.out.println(ages[ages.length-1] - ages[ages.length-ages.length]);
			
		// Get average of the numbers in ages array
		for (int i = 0; i < ages.length; i++)
		{
			average += ages[i];
			if(i == ages.length-1)
				System.out.println(average/ages.length);
		}
		
		// 2a - Get average of number of letters in names in 'names' array
		for (int i = 0; i < names.length; i++)
		{
			// nameSum will add the number of letters in each name to itself, as it iterates through the for-loop
			nameSum += names[i].length();
			// if i = the number of names in the 'names' array minus 1, print the total number of characters divided
			// by the number of names in the array, giving the average
			if (i == names.length-1 ) {
				System.out.println(nameSum/names.length);
			}
		}
		
		// 2b
		// initialize a string variable to store the names with spaces afterwards
		String phrase = "";
		for (int i = 0; i < names.length; i++)
		{
			// Every time the loop goes through, add the name to to the 'phrase' variable with a space after it
			phrase += names[i] + " ";
			// if i = the number of names in the 'names' array minus 1, print the names with spaces afterwards
			if (i == names.length) {
				System.out.println(phrase);
			}
		}
		// 5
		int numOfNames = 0;
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		// 6
		int nameLengthSum = 0;
		for (int i = 0; i <= nameLengths.length-1; i++) {
			nameLengthSum += nameLengths[i];
			if (i == nameLengths.length-1) {
				System.out.println(nameLengthSum);
			}
		}
		// 7
		System.out.println(returnString("Sam", 4));
		
		// 8
		System.out.println(namesString("Sam","Shelley"));
		
		// 9
		int[] numbers = new int[2];
		numbers[0] = 13;
		numbers[1] = 90;
		System.out.println(addingNumbers(numbers));
		//10
		double[] doubles1 = new double[3];
		doubles1[0] = 2;
		doubles1[1] = 4;
		doubles1[2] = 10;
		//11
		double[] doubles2 = new double[3];
		doubles2[0] = 2;
		doubles2[1] = 4;
		doubles2[2] = 6;
		
		System.out.println(averageOfAll(doubles1));
		System.out.println(twoGuys(doubles1, doubles2));
		//12
		System.out.println(willBuyDrink(true, 12.36));
		//13
		System.out.println(willBuyThirdDog(true, 10000));
	}
	
	public static String returnString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
		
	}
	public static String namesString(String firstName, String lastName) {
		return (firstName + " " + lastName); 
	}
	public static Boolean addingNumbers(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i]; 
		
		}
		if (result > 100) {
		return true;
		}
		return false;
	}
	public static double averageOfAll(double[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result/a.length;
	}
	public static Boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		if(isHotOutSide == true && moneyInPocket > 10.5) {
			return true;
		}
		return false;
	}
// This method is to help you decide if you are ready for a third dog, if you are responsible and have enough money
//in the bank to pay for the fees and food then yes go for the third dog!! I made this because I want a third dog.
	public static boolean willBuyThirdDog(boolean isResposible, double hasEnoughMoneyInBank) {
		if(isResposible == true && hasEnoughMoneyInBank > 450) {
			return true;
		}
		return false;
	}
	public static Boolean twoGuys(double[] a, double[] b) {
		if(averageOfAll(a) > averageOfAll(b)) {
			return true;
		}
		return false;
		
	}
	
	
}
