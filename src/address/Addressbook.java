package address;

public class Addressbook {

	String First_Name;
	String Last_Name;
	String Address;
	String City;
	String State;
	int zip;
	int Contact_Number;
	String eMail;

	public Addressbook(String First_Name, String Last_Name, String Address, String City, String State, int zip,
			int Contact_Number, String eMail) {
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Address = Address;
		this.City = City;
		this.State = State;
		this.zip = zip;
		this.Contact_Number = Contact_Number;
		this.eMail = eMail;
	}

	public void addressBook() {
		System.out.println("First Name: " + First_Name);
		System.out.println("Last Name: " + Last_Name);
		System.out.println("Address: " + Address);
		System.out.println("City: " + City);
		System.out.println("State: " + State);
		System.out.println("Zip: " + zip);
		System.out.println("Phone Number: " + Contact_Number);
		System.out.println("Email Address: " + eMail);
	}

	public static void main(String[] args) {

		System.out.println("..####..Welcome to Address Book Programm..####..");
		Addressbook register = new Addressbook(null, null, null, null, null, 0, 0, null);
		register.addressBook();

	}

}
