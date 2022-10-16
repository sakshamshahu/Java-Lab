package LAB7.p4;

interface abc{
	int division(int a);
	int modules(int b);
}
public class index implements abc{

	@Override
	 public int division(int a) {
		return a/12;
	}
	@Override
	 public int modules(int b) {
		return b+7;
	}
	
	public static void main(String[] args) {
		index obj = new index();
		System.out.println(obj.division(480));
		System.out.println(obj.modules(9));
	}
	
}
