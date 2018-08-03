import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(3, "Yellow", 500.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, conferenceRoom.getCapacity());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, conferenceRoom.getGuestList().size());
    }

    @Test
    public void hasName(){
        assertEquals("Yellow", conferenceRoom.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(500.00, conferenceRoom.getDailyRate(), 2);
    }
}
