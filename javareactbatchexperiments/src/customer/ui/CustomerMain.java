package customer.ui;
import customer.beans.*;

public class CustomerMain {

	public static void main(String args[]) {
		CustomerMain project = new CustomerMain();
		project.run();

	}

	public void run() {
		Customer customers[] = new Customer[4];
		Account account1=new Account(1,3213.4);
		Account account2=new Account(2,32343.4);
		Account account3=new Account(3,32343.4);
		Account account4=new Account(4,32343.4);

		ITCustomer ITCustomer1 = new ITCustomer(148, "Suriya",account1,"Lenovo");		//customer1
		
		ITCustomer ITCustomer2 = new ITCustomer(148, "Rohan",account2,"hp");			//customer2

		CreditCustomer CreditCustomer1 = new CreditCustomer(148, "Aaryan",account3,3214.3);	//customer3  
		
		CreditCustomer CreditCustomer2 = new CreditCustomer(148, "Harsh",account4,4234.2);	//customer4
		
		

		customers[0] = ITCustomer1;
		customers[1] = ITCustomer2;
		customers[2] = CreditCustomer1;
		customers[3] = CreditCustomer2;
		
		for(int i=0;i<customers.length;i++) {
			Customer iteratedCustomer = customers[i];
			if(iteratedCustomer instanceof CreditCustomer) {
				
			}
		}
		
		

	}
	
}