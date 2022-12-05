package LAB9.p4;

class ALIVE extends Thread{
	Thread t;
	int priority;
	int count = 0;
	String name;
	
	ALIVE(String name, int priority){
		this.name = name;
		this.priority = priority;
		
		t = new Thread(this, name);
		t.setPriority(priority);
		System.out.println("Thread working "+t.getName());
		t.start();
	}
	
	public void run() {
		try {
			if(t.getPriority() > 6) {
			Thread.sleep(2000);
			}
			System.out.println("Is"+Thread.currentThread().getName()+" alive ?: "+t.isAlive());
			System.out.println(Thread.currentThread().getState());
			
			while (t.isAlive() && count !=5) {
				System.out.println(t.getName()+ " counted to "+ count);
				count++;
			}
			
		}catch(InterruptedException e) {
		}
	}
}

public class Index {
	public static void main(String[] args) {
		ALIVE t1 = new ALIVE("TH1", 2);
		ALIVE t2 = new ALIVE("TH2", 3);
		ALIVE t3 = new ALIVE("TH3", 4);
		ALIVE t4 = new ALIVE("TH4", 7);
		ALIVE t5 = new ALIVE("TH5", 9);
	}
}
