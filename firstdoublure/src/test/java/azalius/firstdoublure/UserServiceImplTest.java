package azalius.firstdoublure;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class UserServiceImplTest {

	@Test
	public void should_create_user_with_hashed_password() {
		
		HashProvider hp = mock(HashProvider.class);
		when(hp.hash("secret")).thenReturn("coucou");
    	UserService userService = new UserServiceImpl(hp);
    	User user = userService.createUser("Bob", "secret");
     	assertEquals(user.firstName(), "Bob"); 
     	assertEquals(user.hashedPassword(), "coucou"); 
	}
}
