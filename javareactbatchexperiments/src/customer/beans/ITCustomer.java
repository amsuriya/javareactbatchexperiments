package customer.beans;

public class ITCustomer extends Customer{
	private String laptop;
	
	public ITCustomer( int id, String name,Account account,String laptop) {
		super(id,name,account);	
		this.laptop=laptop;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop=laptop;
	}
	

}
