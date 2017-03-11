package tproblem.xu;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TriangleProblemTest {

	private TriangleProblem tp;
    @Before
    public void setUp() throws Exception{
    	tp = new TriangleProblem();
    }
	@Test
	public void teste() {
		assertEquals("equilateral",'e',tp.triangle(3,3,3));
		/*assertEquals("isosceles",'i',tp.triangle(3,3,2));
		assertEquals("scalene",'s',tp.triangle(6,4,5));
		assertEquals("none",'n',tp.triangle(1,1,8));*/
	}
	@Test
	public void testi() {
		assertEquals("isosceles",'i',tp.triangle(3,3,2));
	}
	@Test
	public void tests() {
		assertEquals("scalene",'s',tp.triangle(3,4,5));
	}
	@Test
	public void testn() {
		assertEquals("none",'n',tp.triangle(1,1,8));
	}

}










