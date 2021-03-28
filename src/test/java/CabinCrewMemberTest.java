import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;


    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Frank", Rank.FIRSTOFFICER);
    }

    @Test
    public void hasName() {
        assertEquals("Frank", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("First Officer", cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessageToPassengers() {
        assertEquals("Prepare for landing", cabinCrewMember.relayMessageToPassengers("Prepare for landing"));
    }
}
