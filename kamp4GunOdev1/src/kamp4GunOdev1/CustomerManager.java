package kamp4GunOdev1;

public class CustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
		
	}

}
