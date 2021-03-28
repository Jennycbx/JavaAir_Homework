import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Ellie", "E456", Rank.CAPTAIN);
    }

    @Test
    public void hasName() {
        assertEquals("Ellie", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("E456", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("Prepare for take-off", pilot.flyPlane("Prepare for take-off"));
    }
}
