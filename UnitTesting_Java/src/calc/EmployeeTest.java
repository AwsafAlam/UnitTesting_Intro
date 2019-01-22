package calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee e;

    @Before
    public void setUp() throws Exception {
        e = new Employee("awsaf",1100.23,12,2019);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = NullPointerException.class)
    public void getManagerName() {
        assertEquals("Null pintrt","awsaf",e.getManagerName());
        //e.getManagerName();
    }

    @Test
    public void setManager() {
    }

    @Test
    public void calculateYearlySalary() {
    }

    @Test
    public void get_increment() {
    }
}