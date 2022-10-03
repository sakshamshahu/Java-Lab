package LAB6.p2;

public class index {
    public static void main(String[] args){  
    	Football_Player obj1 = new Football_Player();
    	obj1.age =19;
    	obj1.name ="Anonymous";
    	obj1.getName();
    	obj1.getAge();
    	obj1.getSport();
    }
}
class Player{
    public int age;
    public String name;
    
    public void getName(){
        System.out.println(String.format("Player Name is : %s",name));
    }
    public void getAge(){
        System.out.println(String.format("Player Age is: %d",age));
    }
}
class Cricket_Player extends Player{
    public String sport = "Cricket";
    public void getSport(){
        System.out.println(String.format("Player Sport is: %s",sport));
    }
}
class Hockey_Player extends Player{
    public String sport = "Hockey";
    public void getSport(){
        System.out.println(String.format("Player Sport is : %s",sport));
    }
}
class Football_Player extends Player{
    public String sport = "Football";
    public void getSport(){
        System.out.println(String.format("Player Sport is: %s",sport));
    }
}