package Booking;

public class Booking {

    private boolean bookingStatus;
    private String bookingName;
    private int numberOfNights;

    public Booking(){
        this.bookingStatus = false;
        this.bookingName = "";
        this.numberOfNights = 0;
    }

    public boolean getBookingStatus(){
        return this.bookingStatus;
    }

    public String getBookingName(){
        return this.bookingName;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
}
