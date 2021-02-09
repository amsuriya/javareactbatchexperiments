package customer.beans;

public class CreditCustomer extends Customer{
	private double creditTaken;
	
	public CreditCustomer( int id, String name,Account account,double creditTaken) {
		super(id,name,account);	
		this.creditTaken=creditTaken;
	}
	public double getCreditTaken() {
		return creditTaken;
	}
	public void setLaptop(double creditTaken) {
		this.creditTaken=creditTaken;
	}

}
