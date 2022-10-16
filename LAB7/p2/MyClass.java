package LAB7.p2;

interface A{
	void meth1();
	int meth2();
}
public class MyClass implements A {
	public void meth1() {
	System.out.println("Yeehaw");	
	}
	public int meth2() {
		System.out.println("2x Yeehaw");
		return 0;
	}
	public static void main(String [] args) {
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
	}
}
