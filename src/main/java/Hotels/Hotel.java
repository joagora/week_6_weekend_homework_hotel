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
        bedRoom.setGuestList(guest);
    }
}
