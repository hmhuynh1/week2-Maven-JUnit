package controler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class FullNameTest {
	
	private FullName fullName;
	
	
	@Before
	public void setUp() {
		fullName = new FullName();
		
	}
	
	@Test
	public void getFullName() {
		fullName.setFirstName("lisa");
		fullName.setLastName("simpson");
		assertEquals("LISA SIMPSON", fullName.getFullName());
		
	}
	
    @Test
    public void testFirstName() {
    	FullName fullName = new FullName();
    	fullName.setFirstName("hong");
    	assertEquals("hong", fullName.getFirstName());
    }
   
    @Test
    public void getLastName() {
    	fullName.setLastName("huynh");
    	assertEquals("huynh", fullName.getLastName());
   	
    }
}
