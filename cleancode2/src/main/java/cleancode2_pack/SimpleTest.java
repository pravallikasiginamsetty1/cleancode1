package cleancode2_pack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleTest {
	Simple s;
	@Before
	public void init()
	{
		s=new Simple();
	}

	@Test
	public void testInterest() {
		//fail("Not yet implemented");
		
		assertEquals(24,s.interest(1200,1,2),0);
		assertEquals(30,s.compound(1200, 20, 1),0);
	}

}