package LAB9.p3;

class Counter extends Thread {
    int n=1;
    Thread t;

    synchronized public void run() {
        try {
            t.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(n++);
    }

}
class Index
{
    static Thread[] threads = new Thread[10];
    public static void main(String[] args)
    {
        Counter c = new Counter();
        for(int i=0;i<10;i++)
        {
            threads[i] = new Thread(c);
            threads[i].start();
        }

    }
}
