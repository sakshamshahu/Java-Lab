package balance;
public class Account {
	private int bal;
	private String fname;
	private String lname;
	public Account(int bal, String fname, String lname) {
		this.bal = bal;
		this.fname =fname;
		this.lname = lname;
	}
	public void Display_Balance() {
		System.out.println(String.format("Customer name : "+fname+" "+lname));
		System.out.println(String.format("Your balance is: %d", bal));
	}
}
