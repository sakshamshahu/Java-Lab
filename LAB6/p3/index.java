package LAB6.p3;

public class index {
    public static void main(String[] args){
        DailyWorker obj1 = new DailyWorker("Olivia", 7, 100);
        SalariedWorker obj2 = new SalariedWorker("Jordan",20);
        System.out.println(String.format("Weekly pay of %s = %d $",obj1.getName(),obj1.ComPay()));
        System.out.println(String.format("Weekly pay of %s = %d $",obj2.getName(),obj2.ComPay()));
    }
}
class Worker{
    protected String name;
    protected int rate;
    public String getName(){
        return this.name;
    }
}
class DailyWorker extends Worker{
    private int days;
    public DailyWorker(String name, int rate, int days){
        this.name = name;
        this.rate = rate;
        this.days = days;
    }
    public int ComPay(){
        int pay = days*rate;
        return pay;
    }
}
class SalariedWorker extends Worker{
    public SalariedWorker(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public int ComPay(){
        int pay = 40*rate;  //Salaried worker paid for 40 hours per week
        return pay;
    }
}