package homework;

public class Subscriber {

	private String firstName;
	private String lastName;
	private SubscriberAddress fullAdress;
	private String emailAddress;
	private int age;

	public Subscriber(String firstName, String lastName, SubscriberAddress fullAdress, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullAdress = fullAdress;
		this.emailAddress = emailAddress;
	}

	public Subscriber(String firstName, String lastName, SubscriberAddress fullAdress, String emailAddress, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullAdress = fullAdress;
		this.emailAddress = emailAddress;
		this.age = age;
	}

}
