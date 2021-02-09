
public class GreatestAndSmallest {

	public static void main(String[] args) {
		int[] myArray = new int[5];
		myArray[0] = 20;
		myArray[1] = 16;
		myArray[2] = 12;
		myArray[3] = 90;
		myArray[4] = 1;
		int smallest = myArray[0];
		int greatest = myArray[0];
		for (int i = 0; i < 4; i++) {
			if (smallest > myArray[i + 1]) {
				smallest = myArray[i + 1];

			}
			if (greatest < myArray[i + 1]) {
				greatest = myArray[i + 1];
			}
		}
		System.out.println(smallest);
		System.out.println(greatest);

	}

}
