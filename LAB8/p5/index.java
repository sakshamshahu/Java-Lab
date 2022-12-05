package LAB8.p5;
import java.util.Scanner;
class AgeException extends Exception{
	public AgeException() {
        super("Age is too high.");
    }	
} 
class Nameexception extends Exception{
	public Nameexception() {
			super("Dont enter a number or a character");
		}
	}


class Employee{
    private String name;
    private int age;
    
    public Employee(String name, int age) {
    	this.name =name;
    	this.age =age;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getName() {
    	return name;
    }
}

public class index {
	   public static Employee createEmployee(String name, int age) throws Nameexception, AgeException {
	        if (age > 50) {
	            throw new AgeException();
	        }
	        try {
	            Double.parseDouble(name);
	            throw new Nameexception();
	        } catch (NumberFormatException e) {
	        }
	        return new Employee(name, age);
	    }
	public static void main(String args[]) {
		   Scanner in = new Scanner(System.in);
	        String name = in.nextLine();
	        int age = Integer.parseInt(in.nextLine());
	        try {
	            createEmployee(name,age);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        in.close();
		
	}
}