package LAB7.p3;

interface constants{
	final int a = 40;
	final int b = 34;
	final int c = 2;
}
public class index extends A implements constants {
	public static void main (String [] args) {
		System.out.println(a*c);
		A obj = new A();
		obj.xyz();
	}
}
class A implements constants{
	void xyz() {
		System.out.println("Sum of the constants a & b is :"+(a+b));
		
	}
}