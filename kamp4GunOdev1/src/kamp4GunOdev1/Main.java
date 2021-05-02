package kamp4GunOdev1;

public class Main {

	public static void main(String[] args) {
		//Mernis bağlantısı olursa aşağıdaki kod satırı çalıştırılacak
		//CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		CustomerManager customerManager = new CustomerManager();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Batuhan");
		customer.setLastName("Balı");
		customer.setDateOfBirth("20.12.1999");
		customer.setNationalityId("112342817151");
		customerManager.Save(customer);

	}

}
