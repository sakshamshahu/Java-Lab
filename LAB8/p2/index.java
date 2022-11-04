package LAB8.p2;

public class index {
	public static void main(String[] args) {
		try {
			int a = 50;
			int b = 0;
			int	c = a/b;
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception encountered and has been handled : -");
			System.out.println(e);
		}
	}
}
