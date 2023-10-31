import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


 /**
 * The class Ceiling fan test
 */ 
public class CeilingFanTest {

    private CeilingFan fan;

    @Before

/** 
 *
 * Sets the up
 *
 */
    public void setUp() { 

        fan = new CeilingFan();
    }

    @Test

/** 
 *
 * Test pull cord1
 *
 */
    public void testPullCord1() { 

        fan.pullFanCord1();
        assertEquals(1, fan.getTotalSpeed());
        fan.pullFanCord1();
        assertEquals(2, fan.getTotalSpeed());
         fan.pullFanCord1();
        assertEquals(3, fan.getTotalSpeed());
        fan.pullFanCord1();
        //test failed result
        fan.pullFanCord1();
        assertNotEquals(4, fan.getTotalSpeed());
       
    }

    @Test

/** 
 *
 * Test pull cord2
 *
 */
    public void testPullCord2() { 

        fan.pullFanCord2();
        assertTrue(fan.isReversed());
    
       fan.pullFanCord2();
        assertTrue(!fan.isReversed());
    
        fan.pullFanCord2();
        assertTrue(fan.isReversed());
    }
    
}
