import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    @Before
    public void before(){
        diningRoom = new DiningRoom(4);
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, diningRoom.getCapacity());
    }
}
