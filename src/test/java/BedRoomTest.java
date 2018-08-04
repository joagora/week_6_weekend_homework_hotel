import Enums.RoomCollectionType;
import Enums.RoomType;
import Guests.Guest;
import Hotels.Hotel;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;
    Hotel hotel;
    Guest guest;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    @Before
    public void before(){
        bedRoom = new BedRoom(RoomCollectionType.BLUE, 50.50);
        hotel = new Hotel();
        guest = new Guest("Mike");
        guest2 = new Guest("Ben");
        guest3 = new Guest("Beata");
        guest4 = new Guest("Jacek");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedRoom.getCapacity());
    }

    @Test
    public void hasNumber(){
        assertEquals(2, bedRoom.getNumber());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, bedRoom.getGuestList().size());
    }

    @Test
    public void hasType(){
        assertEquals(RoomType.SINGLE, bedRoom.getTypeOfRoom());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(50.50, bedRoom.getNightlyRate(), 2);
    }

    @Test
    public void canCheckIfSpaceAvailableNoSpace(){
        hotel.checkIn(guest, bedRoom);
        hotel.checkIn(guest2, bedRoom);
        hotel.checkIn(guest3, bedRoom);
        hotel.checkIn(guest4, bedRoom);
        assertEquals(false, bedRoom.checkIfSpaceAvailable());
    }

    @Test
    public void doesNotCheckInIfNoSpace(){
        hotel.checkIn(guest2, bedRoom);
        hotel.checkIn(guest3, bedRoom);
        hotel.checkIn(guest4, bedRoom);
        hotel.checkIn(guest4, bedRoom);
        assertEquals(1, bedRoom.checkHowManyGuests());
    }

    @Test
    public void canCheckIfBooked(){
        assertEquals(false, bedRoom.getBookingStatus());
    }

    @Test
    public void canGetBookingName(){
        assertEquals("", bedRoom.checkBookingName());
    }

    @Test
    public void canChangeBookingStatusToTrue(){
        assertEquals(false, bedRoom.getBookingStatus());
        bedRoom.changeBookingStatusToTrue();
        assertEquals(true, bedRoom.getBookingStatus());
    }

    @Test
    public void canChangeBookingStatusToFalse(){
        bedRoom.changeBookingStatusToTrue();
        assertEquals(true, bedRoom.getBookingStatus());
        bedRoom.changeBookingStatusToFalse();
        assertEquals(false, bedRoom.getBookingStatus());
    }

    @Test
    public void canCheckHowManyNightsWereBooked(){
        bedRoom.assignNumberOfNights(4);
        assertEquals(4, bedRoom.checkBookedNumberOfNights());
    }

    @Test
    public void canAssignNumberOfNightsToBooking(){
        bedRoom.assignNumberOfNights(4);
        assertEquals(4, bedRoom.checkBookedNumberOfNights());
    }
}
