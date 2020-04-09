package cleancode_pack;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class HouseTes1 {
	House h;
	@Before
	public void init()
	{
		h=new House();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(4500000,h.FullyHomeCost("HighStandardMaterials",2500),0);
		
	}

}