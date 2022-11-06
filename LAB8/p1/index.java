package LAB8.p1;
class Student{	
	private String name;
    private int rollNo;
    public Student(){ };
    
    public Student(String n, int m){
        name = n;
        rollNo = m;
    	}
    
    public void display() {
    	System.out.println("Student name : "+name+" Roll no : "+rollNo);
    }
}

public class index {
	public static void main(String[] args){
        Student[] arr = new Student[10];        
        try {
	        arr[0] = new Student("S1",10);
	        arr[1] = new Student("S2",11);
	        arr[2] = new Student("S3",12);
	        arr[3] = new Student("S4",13);
	        arr[4] = new Student("S5",14);
	        arr[5] = new Student("S6",15);
	        arr[6] = new Student("S7",16);
	        arr[7] = new Student("S8",17);
	        arr[8] = new Student("S9",18);
	        arr[9] = new Student("S10",19);
	        arr[10] =new Student("S11",20);
        	}
        	catch(ArrayIndexOutOfBoundsException m){
            System.out.println(m);
            System.out.println("The record can store only 10 entries, you have exceeded it.");
        		}
        finally {
			for (int i=0; i<arr.length; i++) {
					arr[i].display();
			}
		}
    }
}
