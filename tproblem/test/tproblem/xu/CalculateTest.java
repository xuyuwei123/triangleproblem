package tproblem.xu;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CalculateTest {

    private Calculate cal;
    @Before
    public void setUp() throws Exception{
    	cal = new Calculate();
    }
    
	@Test
	public void testAdd() {
		assertEquals("1addhasproblem",4,cal.add(1,3));
		assertEquals("2addhasproblem",-2,cal.add(-1,-1));
		assertEquals("3addhasproblem",0,cal.add(1,-1));
		assertEquals("4addhasproblem",102,cal.add(99,3));
		//fail("Not yet implemented");
	}

	@Test
	public void testMinus() {
		assertEquals("minushasproblem",-1,cal.minus(1,2));
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		assertEquals("dicidehasproblem",6,cal.divide(12,2));
		//fail("cal.add(12, 2)");
		//fail("Not yet implemented");
	}

	@Test
	public void testMulti() {
		assertEquals("multihasproblem",20,cal.multi(10,2));
		//fail("Not yet implemented");
	}


}
