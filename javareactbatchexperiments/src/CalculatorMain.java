



public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calcy = new Calculator();

		int result1 = calcy.add(1, 2, 3);
		int result2 = calcy.add(4, 5);
		double result3 = calcy.div(5, 9);
		int result4 = calcy.mul(4, 7);
		int result5 = calcy.mul(4, 7, 5);
		int result6 = calcy.sub(7, 5);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);

	}

}
