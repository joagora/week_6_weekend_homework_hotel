import Enums.RoomType;
import Guests.Guest;
import Hotels.Hotel;
import Rooms.BedRoom;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom;
    Guest guest;
    Guest guest2;
    @Before
    public void before(){
        hotel = new Hotel();
        bedRoom = new BedRoom(RoomType.DOUBLE, 50.50, 12);
        guest = new Guest("Mike");
        guest2 = new Guest("Robert");
    }

    @Test
    public void hasRoomList(){
        assertEquals(0, hotel.getRoomList().size());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(guest, bedRoom);
        assertEquals(1, bedRoom.checkHowManyGuests());
    }

    @Test
    public void canCheckHowManyGuestsCheckedIn(){
        hotel.checkIn(guest, bedRoom);
        assertEquals(1, bedRoom.checkHowManyGuests());
    }
    @Test
    public void canCheckOut(){
        hotel.checkIn(guest, bedRoom);
        assertEquals(1, bedRoom.checkHowManyGuests());
        hotel.checkOut(guest, bedRoom);
        assertEquals(0, bedRoom.checkHowManyGuests());
    }

    @Test
    public void canCheckGuestListForRoom(){
        hotel.checkIn(guest, bedRoom);
        hotel.checkIn(guest2, bedRoom);
        assertEquals(2, hotel.checkGuestsCheckedIn(bedRoom).size());
    }
}
