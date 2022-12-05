package LAB9.p1;

class Test1 implements Runnable{
	public void run() {
		for(int i =4; i>=0; i--) {
			System.out.println("I am using runnable interface lolzz");
			System.out.println(Thread.currentThread());
		}
	}

}


public class Index extends Thread{
	public void run() {
		System.out.println("The thread is runnning");
	}
	public static void main (String args[]) {
		Index t1 =new Index();
		Thread t2 = new Thread("noob");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread());
		String str = t2.getName();  
		System.out.println(str);  
		
		Test1 t3 = new Test1();
		t3.run();
		}
}
