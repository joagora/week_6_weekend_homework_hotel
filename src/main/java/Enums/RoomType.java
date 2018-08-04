package Enums;



public enum RoomType {
    DOUBLE(2),
    SINGLE(1);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
