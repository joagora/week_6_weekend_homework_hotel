package Rooms;
import Enums.RoomType;
import Guests.Guest;
import java.util.ArrayList;

public class BedRoom extends Room {

    private int number;
    private RoomType type;
    private double nightlyRate;
    private boolean bookingStatus;
    public BedRoom(RoomType type, double nightlyRate, int number){
        super(type.getCapacity());
        this.number = number;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.bookingStatus = false;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
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


}
