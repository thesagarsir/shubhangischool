
public class SwapingEx {
	public static void main(String[] args) {
		int a;
		int b;
		a = 10;
		b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a" + a);
		System.out.println("Value of b" + b);

	}

}
