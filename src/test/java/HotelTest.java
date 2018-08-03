import Hotels.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    @Before
    public void before(){
        hotel = new Hotel();
    }

    @Test
    public void hasRoomList(){
        assertEquals(0, hotel.getRoomList().size());
    }
}
