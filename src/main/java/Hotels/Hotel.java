package Hotels;
import Guests.Guest;
import Rooms.BedRoom;
import Rooms.Room;
import java.util.ArrayList;

public class Hotel{

    private ArrayList<Room> roomList;

    public Hotel(){
       this.roomList = new ArrayList<>();
    }

    public ArrayList<Room> getRoomList(){
        return roomList;
    }

    public void checkIn(Guest guest, BedRoom bedRoom){
        if (bedRoom.checkIfSpaceAvailable()){
            bedRoom.setGuestList(guest);
            bedRoom.changeBookingStatusToTrue();
        } else {
            return;
        }

    }

    public boolean checkIfCheckedIn(Guest guest, BedRoom bedroom){
        if (bedroom.getGuestList().contains(guest)){
            return true;
        } else {
            return false;
        }
    }

    public void checkOut(Guest guest, BedRoom bedroom){

        if (checkIfCheckedIn(guest, bedroom)) {
            bedroom.getGuestList().remove(guest);
            bedroom.changeBookingStatusToFalse();
            bedroom.setBookingName("");
        } else {
            return;
        }
    }


    public ArrayList<Guest> checkGuestsCheckedIn(BedRoom bedroom){
        return bedroom.getGuestList();
    }

    public void bookRoom(BedRoom bedroom, String guestName, int numberOfGuests){
        if ((numberOfGuests <= bedroom.getCapacity()) && (bedroom.getBookingStatus() == false)){
            bedroom.setBookingName(guestName);
            bedroom.changeBookingStatusToTrue();
        } else {
            return;
        }

    }

}
