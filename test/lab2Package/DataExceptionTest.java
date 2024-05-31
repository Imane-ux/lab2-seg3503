package lab2Package;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DataExceptionTest.ValidDateTests.class, DataExceptionTest.InvalidDateTests.class })
public class DataExceptionTest {

    // Test class for valid dates
    @RunWith(Parameterized.class)
    public static class ValidDateTests {
        private Date inputDate;
        private Date expectedDate;

        public ValidDateTests(Date inputDate, Date expectedDate) {
            this.inputDate = inputDate;
            this.expectedDate = expectedDate;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                { new Date(1700, 6, 20), new Date(1700, 6, 21) },
                { new Date(2005, 4, 15), new Date(2005, 4, 16) },
                { new Date(1901, 7, 20), new Date(1901, 7, 21) },
                { new Date(3456, 3, 27), new Date(3456, 3, 28) },
                { new Date(1500, 2, 17), new Date(1500, 2, 18) },
                { new Date(1700, 6, 29), new Date(1700, 6, 30) },
                { new Date(1800, 11, 29), new Date(1800, 11, 30) },
                { new Date(3453, 1, 29), new Date(3453, 1, 30) },
                { new Date(444, 2, 29), new Date(444, 3, 1) },
                { new Date(2005, 4, 30), new Date(2005, 5, 1) },
                { new Date(3453, 1, 30), new Date(3453, 1, 31) },
                { new Date(3456, 3, 30), new Date(3456, 3, 31) },
                { new Date(1901, 7, 31), new Date(1901, 8, 1) },
                { new Date(3453, 1, 31), new Date(3453, 2, 1) },
                { new Date(3456, 12, 31), new Date(3457, 1, 1) }
            });
        }

        @Test
        public void testNextDate() {
            assertEquals(expectedDate, inputDate.nextDate());
        }
    }

    // Test class for invalid dates
    @RunWith(Parameterized.class)
    public static class InvalidDateTests {
        private int year;
        private int month;
        private int day;

        public InvalidDateTests(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                { 1500, 2, 31 },
                { 1500, 2, 29 },
                { -1, 10, 20 },
                { 1458, 15, 12 },
                { 1975, 6, -50 }
            });
        }

        @Test(expected = IllegalArgumentException.class)
        public void testNextDateException() {
            new Date(year, month, day).nextDate();
        }
    }
}
