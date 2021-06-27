package day4homework2.adapters;


import java.util.Locale;

import day4homework2.Abstract.CustomerCheckService;
import day4homework2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters
 implements CustomerCheckService{
       

	@Override
	public boolean CheckIfRealPErson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		 boolean result = true;
		 result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase( new Locale("TR")),
				 customer.getLastName().toUpperCase(new Locale( "Tr")), customer.getDateOfBirth());
	
	
		// TODO Auto-generated method stub
		
		
		return result;
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}


	
	
	
}
