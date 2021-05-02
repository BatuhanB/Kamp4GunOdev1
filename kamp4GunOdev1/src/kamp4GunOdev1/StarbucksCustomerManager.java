package kamp4GunOdev1;

public class StarbucksCustomerManager extends CustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer) == true) {
			Save(customer);
		} else
			System.out.println("Not a valid person");
	}
}
