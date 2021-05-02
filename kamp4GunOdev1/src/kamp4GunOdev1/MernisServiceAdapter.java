package kamp4GunOdev1;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// Mernis service referansı kullanmadığım için kendim metod yazıp onu atadım
		return TcKimlikDogrula(customer.getNationalityId(),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());
	}
	private boolean TcKimlikDogrula(String message1,String message2,String message3,String message4) {
		return true;
	}

}
