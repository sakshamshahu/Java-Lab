package LAB6.p1;

public class index {
	public static void main (String[] args) {
	Child obj1 = new Child();
	Parent obj = new Parent();
	obj.method1(5, 10);	
	obj1.method1(7, 50);
	obj1.method2(4,20);
	}
}

class Parent{
	public void method1(int a , int b) {
		System.out.println(a+b);
	}
	private void method2(int a , int b) {
		System.out.println(a*b);
	}
}

class Child extends Parent{
	
}