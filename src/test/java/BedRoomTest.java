import Enums.RoomType;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;
    @Before
    public void before(){
        bedRoom = new BedRoom(3, RoomType.DOUBLE, 50.50);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, bedRoom.getCapacity());
    }
}
