public class UserProfile2 {
	private String name;
	private String email;

	public UserProfile2(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void displayProfile() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}
}