package Hotels;
import Enums.RoomCollectionType;
import Guests.Guest;
import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import java.util.ArrayList;

public class Hotel{

    private ArrayList<BedRoom> bedRoomList;
    private ArrayList<DiningRoom> diningRoomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(){
        this.bedRoomList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
        this.diningRoomList = new ArrayList<>();
        addRoomsToHotel();
    }

    public void addRoomsToHotel(){
        BedRoom saphireBedroom = new BedRoom(RoomCollectionType.SAPHIRE, 30.50);
        BedRoom blueBedroom = new BedRoom(RoomCollectionType.BLUE, 38.50);
        BedRoom turquoiseBedroom = new BedRoom(RoomCollectionType.TURQUOISE, 50.50);
        BedRoom yellowBedroom = new BedRoom(RoomCollectionType.YELLOW, 18.50);
        this.bedRoomList.add(saphireBedroom);
        this.bedRoomList.add(blueBedroom);
        this.bedRoomList.add(turquoiseBedroom);
        this.bedRoomList.add(yellowBedroom);
    }
    public ArrayList<BedRoom> getBedRoomList(){
        return this.bedRoomList;
    }

    public ArrayList<ConferenceRoom> getConferenceRoom(){
        return this.conferenceRoomList;
    }

    public ArrayList<DiningRoom> getDiningRoomList(){
        return this.diningRoomList;
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
            bedroom.changeBookingName("");
        } else {
            return;
        }
    }


    public ArrayList<Guest> checkGuestsCheckedIn(BedRoom bedroom){
        return bedroom.getGuestList();
    }

    public void bookRoom(BedRoom bedroom, String guestName, int numberOfGuests, int numberOfNights){
        if ((numberOfGuests <= bedroom.getCapacity()) && (bedroom.getBookingStatus() == false)){
            bedroom.changeBookingName(guestName);
            bedroom.changeBookingStatusToTrue();
            bedroom.assignNumberOfNights(numberOfNights);
        } else {
            return;
        }

    }

    public ArrayList<BedRoom> findVacantRooms(){
        ArrayList<BedRoom> vacantBedrooms = new ArrayList<>();
        for (BedRoom bedroom: this.getBedRoomList()) {
            if (bedroom.getBookingStatus() == false){
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }


}
