package Things;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectOne_TEST {

	@Test
	void testOO() {
		
		ObjectOne peter = new ObjectOne("Peter",25);
		
		assertEquals("Peter", peter.getName());
		
		assertEquals("reteP", peter.fromBack());
		
		
	}
	@Test
	void UserTest(){
		
		ObjectOne user0 = new ObjectOne();
		UserData user = new UserData("John","hola",user0);
		
		user = user0.fixName("John", "hola", "hello");
		assertEquals(user.getPass(), "hello");
	}

}
