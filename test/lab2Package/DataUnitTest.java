package lab2Package;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//import static org.junit.Assert.assertEquals;

//Pour les tests avec le runner Parameterized qui ne générant pas d'exception
@RunWith(Parameterized.class)
public class DataUnitTest {
	
	private int year;
	private int month;
	private int day;
	
	private int expectedYear;
	private int expectedMonth;
	private int expectedDay;
	
	public DataUnitTest(int year, int month, int day, int expectedYear, int expectedMonth, int expectedDay) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.expectedDay=expectedDay;
		this.expectedMonth=expectedMonth;
		this.expectedYear=expectedYear;
		
	}
	
	@Parameters
	public static List<Integer[]> dates(){
		List<Integer[]> params= new LinkedList<Integer[]>();
		params.add(new Integer[] {1700, 06,20, 1700, 06, 21});
		params.add(new Integer[] {2005, 04, 15, 2005, 04, 16});
		params.add(new Integer[] {1901, 07,20, 1901, 07, 21});
		params.add(new Integer[] {3456, 03,27, 3456, 03, 28});
		params.add(new Integer[] {1500, 02,17, 1500, 02, 18});
		params.add(new Integer[] {1700, 06,29, 1700, 06, 30});
		
		params.add(new Integer[] {1800, 11,29, 1800, 11, 30});
		params.add(new Integer[] {3453, 01,29, 3453, 01, 30});
		params.add(new Integer[] {444, 02,29, 444, 02, 30});
		params.add(new Integer[] {2005, 04,30, 2005, 05, 01});
		params.add(new Integer[] {3453, 01,30, 3453, 01, 31});
		params.add(new Integer[] {3456, 12,31, 3457, 01, 01});
		
		params.add(new Integer[] {100, 06,20, 1700, 06, 21});
		params.add(new Integer[] {1700, 06,20, 1700, 06, 21});
		params.add(new Integer[] {1700, 06,20, 1700, 06, 21});
		
		return params;
	}
	
	@Test
	public void testNextDate1() {
		Date currDate = new Date(year, month,day);
		Date next = currDate.nextDate();
		
		Date expected= new Date(expectedYear, expectedMonth, expectedDay);
		
		Assert.assertEquals(expected, next);
		
		//Assert.assertEquals(expectedYear, next.getYEAR());
		//Assert.assertEquals(expectedMonth, next.getMONTH());
		//Assert.assertEquals(expectedDay, next.getDAY());
		
		
	}
	

}
