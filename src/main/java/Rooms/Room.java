package Rooms;

import java.util.ArrayList;
import Guests.Guest;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestList;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(Guest guest){
        this.guestList.add(guest);
    }

}
