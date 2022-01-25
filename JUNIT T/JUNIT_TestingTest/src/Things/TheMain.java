package Things;

public class TheMain {
	

	public static void main(String[] args) {
		
		ObjectOne user01 = new ObjectOne();
		UserData user1 = new UserData("John", "hello123", user01);
		
		System.out.println(user01.fixName("John", "hello123", "dd"));
		
		System.out.println(user1.getPass());

	}

}
