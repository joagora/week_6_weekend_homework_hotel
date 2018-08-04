package Rooms;
import Booking.Booking;
import Enums.RoomCollectionType;
import Enums.RoomType;
import Guests.Guest;
import java.util.ArrayList;

public class BedRoom extends Room {

    private RoomCollectionType roomCollectionType;
    private double nightlyRate;
    private Booking booking;

    public BedRoom(RoomCollectionType roomCollectionType, double nightlyRate){
        super(roomCollectionType.getRoomType().getCapacity());
        this.roomCollectionType = roomCollectionType;
        this.nightlyRate = nightlyRate;
        this.booking = new Booking();
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
        return this.booking.getBookingStatus();
    }

    public void changeBookingStatusToTrue(){
        this.booking.setBookingStatus(true);
    }

    public void changeBookingStatusToFalse(){
        this.booking.setBookingStatus(false);
    }

    public String checkBookingName(){
        return this.booking.getBookingName();
    }

    public void changeBookingName(String bookingName) {
        this.booking.setBookingName(bookingName);
    }

    public int checkBookedNumberOfNights(){
        return this.booking.getNumberOfNights();
    }

    public void assignNumberOfNights(int numberOfNights){
        this.booking.setNumberOfNights(numberOfNights);
    }
}
