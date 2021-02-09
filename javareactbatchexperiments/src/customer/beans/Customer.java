package customer.beans;


public class Customer {
	private int id;
	private String name;
	private Account account;
	

	public Customer(int id, String name,Account account) { // using constructor
		this.id = id;
		this.name = name;
		this.setAccount(account);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {									
		this.id = id;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account=account;
}
}

