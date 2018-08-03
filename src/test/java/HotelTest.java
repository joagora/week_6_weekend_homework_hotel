import Enums.RoomType;
import Guests.Guest;
import Hotels.Hotel;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom;
    Guest guest;
    @Before
    public void before(){
        hotel = new Hotel();
        bedRoom = new BedRoom(3, RoomType.DOUBLE, 50.50, 12);
        guest = new Guest("Mike");
    }

    @Test
    public void hasRoomList(){
        assertEquals(0, hotel.getRoomList().size());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(guest, bedRoom);
        assertEquals(1, bedRoom.getGuestList().size());
    }
}
