package kamp4GunOdev1;

public class NeroCustomerManager extends CustomerManager {

	private CustomerCheckManager customerCheckManager;

	public NeroCustomerManager(CustomerCheckManager customerCheckManager) {
		this.customerCheckManager = customerCheckManager;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckManager.CheckIfRealPerson(customer) == true) {
			Save(customer);
		} else
			System.out.println("Not a valid person");
	}

}
