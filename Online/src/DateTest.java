import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Before
    public void setUp() throws Exception {
//        System.out.println("Setup");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInitialization(){
        Date d1 = new Date(2019,1,22);
        Date d2 = new Date(2019,1,22);
        //assertSame("Two dates are not same",d1,d2);
        assertEquals("Two dates are not same",d1,d2);

//        assertSame("Not the same day",d2.getDay(),d1.getDay());
//        assertSame("Not the same month",d2.getMonth(),d1.getMonth());
//        assertSame("Not the same year",d2.getYear(),d1.getYear());

    }

    @Test(expected = IllegalArgumentException.class)
    public void addDays_Exception() {
        Date d = new Date(2019,1,22);

        System.out.println("Illegal Argument Exception test..");
        d.addDays(-1);

    }

    @Test
    public void addDays() {
        Date d = new Date(2019,1,22);
        d.addDays(3);
        Date d_new = new Date(2019,1,25);
        assertEquals("Incorrect addition",d_new,d);

    }

    @Test
    public void getDayOfWeek() {
        Date d = new Date(2019,1,22);
        assertEquals("Wrong day of week outputed","TUESDAY",d.getDayOfWeek());
//        Date d2 = new Date(1653,1,22);
//        assertEquals("Wrong day","TUESDAY",d.getDayOfWeek());

    }

    @Test
    public void isLeapYear() {
        Date d = new Date(2019,1,22);
        assertEquals("Testing on branch (2019%400 == 0)",(2019%400 == 0) , d.isLeapYear());
        Date lpyear = new Date(2100,1,22);

        assertNotEquals("Testing on branch (2100 % 4 == 0) will not pass due to &&",(2100% 4 == 0), lpyear.isLeapYear());
        assertEquals("Testing on branch (2100 % 100 != 0)",(2100 % 100 != 0), lpyear.isLeapYear());
        assertEquals("Testing on entire (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)",(2100% 400 == 0) || (2100 % 4 == 0 && 2100% 100 != 0), lpyear.isLeapYear());


    }

    @Test
    public void nextDay() {
        Date d = new Date(2019,1,22);
        Date next = new Date(2019,1,23);
        d.nextDay();
        assertEquals("Next day incorrect",next,d);

        Date d1 = new Date(2019,1,31);
        Date next1 = new Date(2019,2,1);
        d1.nextDay();
        assertEquals("Month wrap incorrect",next1,d1);

        Date d2 = new Date(2019,12,31);
        Date next2 = new Date(2020,1,1);
        d2.nextDay();
        assertEquals("year wrap incorrect",next2,d2);


    }


//============================================================================
//    @Test
//    public void equals() {
//    }
//
//    @Test
//    public void getDay() {
//    }
//
//    @Test
//    public void getDaysInMonth() {
//    }
//
//    @Test
//    public void getDaysInYear() {
//    }
//

//
//    @Test
//    public void getMonth() {
//    }
//
//    @Test
//    public void getYear() {
//    }


//    @Test
//    public void toString() {
//    }

}