import day4homework2.Abstract.BaseCustomerManager;
import day4homework2.Concrate.StarbucksCustomerManager;
import day4homework2.Entities.Customer;
import day4homework2.adapters.MernisServiceAdapters;



	
	
	public static void main(String[] args) {
		
		 Customer customer =new Customer(1, "Ýrem","Alkaþi","12365498007","1999");
		
	
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());

	try {
		customerManager.Save(customer);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
