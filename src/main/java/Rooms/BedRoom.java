package Rooms;
import Enums.RoomCollectionType;
import Enums.RoomType;
import Guests.Guest;
import java.util.ArrayList;

public class BedRoom extends Room {

    private RoomCollectionType roomCollectionType;
    private double nightlyRate;
    private boolean bookingStatus;
    private String bookingName;
    public BedRoom(RoomCollectionType roomCollectionType, double nightlyRate){
        super(roomCollectionType.getRoomType().getCapacity());
        this.roomCollectionType = roomCollectionType;
        this.nightlyRate = nightlyRate;
        this.bookingStatus = false;
        this.bookingName = "";
    }

    public int getNumber() {
        return this.roomCollectionType.getNumber();
    }

    public RoomType getTypeOfRoom() {
        return this.roomCollectionType.getRoomType();
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public int checkHowManyGuests(){
        return getGuestList().size();
    }

    public boolean checkIfSpaceAvailable(){
        if (getCapacity() > checkHowManyGuests()){
            return true;
        } else {
            return false;
        }
    }

    public boolean getBookingStatus(){
        return this.bookingStatus;
    }

    public void changeBookingStatusToTrue(){
        this.bookingStatus = true;
    }

    public void changeBookingStatusToFalse(){
        this.bookingStatus = false;
    }

    public String getBookingName(){
        return this.bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }
}
