package main.java.ceilingfan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
<p>Tests 2 cords on a ceiling fan</p>
* This class keeps the speed and direction of the fan when each cord is pulled
* 
* @author Adrian Nadeau
* @param  totalSpeed  total count of speed 0 for off, 1 for low, 2 for medium, 3 for high
* @param  isReversed direction of fan
*/
import java.util.Random;
import java.util.stream.IntStream;
 /**
 * The class Ceiling fan
 */ 
public class CeilingFan {
    private int totalSpeed; // 0 for off, 1 for low, 2 for medium, 3 for high
    private boolean isReversed; // cord 2 reverses the fan in the opposite direction ("reversed") 
    private static Logger LOGGER = LoggerFactory.getLogger(CeilingFan.class);
/** 
 *
 * Constructor. 
 *  @param isReversed 
 *  @param totalSpeed
 */
    public CeilingFan() { 
        isReversed = false; //Set to false (it's not reversed to start)
        totalSpeed = 0; // Initialize totalSpeed to 0, nothing started
    }
/** 
 *
 * Pull fan cord1
*   @param totalSpeed
 *
 */
    public void pullFanCord1() { 
        LOGGER.info("CORD 1 pulled");
        if (totalSpeed >= 3) {
            totalSpeed = 0; // turn off (status 0)
        } else {
            totalSpeed++; // Increase the speed
        }
    }
/** 
 *
 * Pull fan cord2
 *   @param isReversed
 */
    public void pullFanCord2() { 
        LOGGER.info("CORD 2 pulled");
        isReversed = !isReversed; // Reverse the fan direction
    }
/** 
 *
 * Display message get total speed and direction for message
 *
 */
    public void displayMessage() { 
        LOGGER.info("Total Speed: " + getTotalSpeed() + ", Direction: " + (isReversed ? "Reversed" : "Forward"));
        
    }
/** 
 *
 * Is reversed
 *
 * @return boolean
 */
    public boolean isReversed() { 
        return isReversed;
    }
/** 
 *
 * Gets the total speed
 *
 * @return the total speed
 */
    public int getTotalSpeed() { 
        return totalSpeed;
    }
/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 
        CeilingFan fan = new CeilingFan();
        Random randomCord = new Random();
        // Test multiple rows and check output
        for (int i = 0; i < 10; i++) {
            boolean boolConfirmRandom = randomCord.nextBoolean();
            int boolPulledCord = boolConfirmRandom ? 1 : 2;
            if (boolPulledCord == 1) {
                fan.pullFanCord1();
            } else {
                fan.pullFanCord2();
            }
            fan.displayMessage();
        }
        IntStream.range(0, 10).forEach(i -> {
            boolean boolConfirmRandom = randomCord.nextBoolean();
            int boolPulledCord = boolConfirmRandom ? 1 : 2;
            if (boolPulledCord == 1) {
                fan.pullFanCord1();
            } else {
                fan.pullFanCord2();
            }
            fan.displayMessage();
        });
    }
}
