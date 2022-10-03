package LAB6.p5;

public class index {
    public static void main(String[] args){
        Employee obj1 = new Employee("Kevin", 5490, 90000);
        Manager obj2 = new Manager("Jeff", 1051, 250000, "Human Resource");
      
        System.out.println(String.format("%s is working under %s",obj1.getName(),obj2.getName()));
        System.out.println(String.format("%s 's salary is %d", obj1.getName(), obj1.getSalary()));
        obj1.increaseSalary(15);
        System.out.println(String.format("%s 's salary after a 15 percent raise is: %d", obj1.getName(),obj1.getSalary()));
        System.out.println(String.format("%s manages the %s department", obj2.getName(),obj2.getDepartment()));
        System.out.println(String.format("%s 's salary is : %d ",obj2.getName(),obj2.getSalary()));
    }
}
class Employee{
    private String name;
    private int empid;
    private int salary;

    public Employee(String name, int empid, int salary){
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void increaseSalary(int percentage){
        float raise = salary *((float)percentage/100);
        this.salary = salary + (int)raise;
    }
}
class Manager extends Employee{
    private String department;
    public Manager(String name, int empid, int salary, String department){
        super(name, empid, salary);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
}