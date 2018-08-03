import Enums.RoomType;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;
    @Before
    public void before(){
        bedRoom = new BedRoom(3, RoomType.DOUBLE, 50.50, 4);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, bedRoom.getCapacity());
    }

    @Test
    public void hasNumber(){
        assertEquals(4, bedRoom.getNumber());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, bedRoom.getGuestList().size());
    }
}
