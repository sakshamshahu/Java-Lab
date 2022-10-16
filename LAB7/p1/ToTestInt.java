package LAB7.p1;

interface test{
	int square(int n);
}

class ArithmeticClass implements test{
	
	public int square(int n) {
			return n*n;
	}
}
public class ToTestInt {
	public static void main(String[] args) {
		ArithmeticClass obj = new ArithmeticClass();
		int area  = obj.square(30);
		System.out.println(String.format("The Area of the Square is %d",area));
	}
}
