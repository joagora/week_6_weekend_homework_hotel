import Booking.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    @Before
    public void before(){
        booking = new Booking();
    }

    @Test
    public void hasBookingName(){
        assertEquals("", booking.getBookingName());
    }

    @Test
    public void hasBookingStatus(){
        assertEquals(false, booking.getBookingStatus());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(0, booking.getNumberOfNights());
    }
}
