package LAB6.p4;

public class index {
    public static void main(String[] args){
        OrdinaryCall call1 = new OrdinaryCall(100);
        UrgentCall call2 = new UrgentCall(80);
        LightningCall call3 = new LightningCall(45);
        System.out.println(String.format("Ordinary call cost: %d",call1.getCharge()));
        System.out.println(String.format("Urgent call cost: %d",call2.getCharge()));
        System.out.println(String.format("Lightning call cost: %d",call3.getCharge()));
    }
}

class Call{
    protected int rate;
    protected int duration;
    protected int charge;
    public int getCharge(){
        return charge;
    }
}

class OrdinaryCall extends Call{
    public OrdinaryCall(int duration){
        this.rate = 6;
        this.duration = duration;
        this.charge = rate*duration;
    }
}
class UrgentCall extends Call{
    public UrgentCall(int duration){
        this.rate = 9;
        this.duration = duration;
        this.charge = rate*duration;
    }
}

class LightningCall extends Call{
    public LightningCall(int duration){
        this.rate = 40;
        this.duration = duration;
        this.charge = rate*duration;
    }
}