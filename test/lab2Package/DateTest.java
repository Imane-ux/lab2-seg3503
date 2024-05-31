package lab2Package;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Pour les tests sans le runner Parameterized.

public class DateTest {

	@Test
	public void testNextDate_Case1() {
		Date date= new Date(1700,6,20);
		Date expected= new Date(1700, 6, 21);
		assertEquals(expected, date.nextDate());
	}
	
	@Test
	public void testNextDate_Case2() {
		Date date= new Date(2005,4,15);
		Date expected= new Date(2005, 4, 16);
		assertEquals(expected, date.nextDate());
	}
	
	@Test
	public void testNextDate_Case3() {
		Date date= new Date(1901,7,20);
		Date expected= new Date(1901, 7, 21);
		assertEquals(expected, date.nextDate());
	}
	
	@Test
	public void testNextDate_Case4() {
		Date date= new Date(3456,3,27);
		Date expected= new Date(3456, 3, 28);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case5() {
		Date date= new Date(1500,2,17);
		Date expected= new Date(1500, 2, 18);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case6() {
		Date date= new Date(1700,6,29);
		Date expected= new Date(1700, 6, 30);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case7() {
		Date date= new Date(1800,11,29);
		Date expected= new Date(1800, 11, 30);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case8() {
		Date date= new Date(3453,1,29);
		Date expected= new Date(3453, 1, 30);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case9() {
		Date date= new Date(444,2,29);
		Date expected= new Date(444, 3, 1);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case10() {
		Date date= new Date(2005,4,30);
		Date expected= new Date(2005, 5, 1);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case11() {
		Date date= new Date(3453,1,30);
		Date expected= new Date(3456, 1, 31);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case12() {
		Date date= new Date(3456,3,30);
		Date expected= new Date(3456, 3, 31);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case13() {
		Date date= new Date(1901,7,31);
		Date expected= new Date(1901, 8, 1);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case14() {
		Date date= new Date(3453,1,31);
		Date expected= new Date(3453, 2, 1);
		assertEquals(expected, date.nextDate());
	}
	@Test
	public void testNextDate_Case15() {
		Date date= new Date(3456,12,31);
		Date expected= new Date(3457, 1, 1);
		assertEquals(expected, date.nextDate());
	}
	
	
	@Test(expected =IllegalArgumentException.class)
	public void testNextDate_Case16() {
		Date date= new Date(1500,2,31);
		date.nextDate();
	}
	@Test(expected =IllegalArgumentException.class)
	public void testNextDate_Case17() {
		Date date= new Date(1500,2,29);
		date.nextDate();
	}
	@Test(expected =IllegalArgumentException.class)
	public void testNextDate_Case18() {
		Date date= new Date(-1,10,20);
		date.nextDate();
	}
	@Test(expected =IllegalArgumentException.class)
	public void testNextDate_Case19() {
		Date date= new Date(1458,15,12);
		date.nextDate();
	}
	@Test(expected =IllegalArgumentException.class)
	public void testNextDate_Case20() {
		Date date= new Date(1975,6,-50);
		date.nextDate();
	}
	
	
}
