package LAB9.p2;

//public class Index {
//	public static void main(String[] args) {
//		Thread t1 = new Thread() {
//			public void run() {
//				for(int i =0; i<=20; i++) {
//					if(i%2 == 0) {
//						System.out.println(i);
//					}
//				}
//			}
//		};
//		Thread t2 = new Thread() {
//			public void run() {
//				for(int i =0; i<=20; i++) {
//					if(i%2 != 0) {
//						System.out.println(i);
//					}
//				}
//			}
//		};
//		t1.start();
//		t2.start();
//		
//	}
//}

class Index{
    int counter = 1;
    static int N;
    synchronized void printeven(){
        
            while (counter<N){
                if (counter%2==0) {
                    System.out.println(counter);
                    counter++;    
                    notify();                
                }  
                else{
                    try{
                        wait();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }        
                
            }
        
    }
    synchronized void printodd(){
        
            while (counter<N){
                if (counter%2!=0) {
                    System.out.println(counter);
                    counter++;    
                    notify();                
                }  
                else{
                    try{
                        wait();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }        
                
            }
        
    }
    public static void main(String[] args) {
        N=10;

        Index ob = new Index();

        Thread t1 = new Thread(){
            public void run(){
                ob.printeven();                
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                ob.printodd();
            }
        };
        t1.start();
        t2.start();
    }}