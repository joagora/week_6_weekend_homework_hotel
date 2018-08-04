package Enums;

public enum RoomCollectionType {
    YELLOW("Yellow", RoomType.DOUBLE, 1),
    BLUE("Blue", RoomType.SINGLE, 2),
    SAPHIRE("Saphire", RoomType.DOUBLE, 3),
    TURQUOISE("Turquoise", RoomType.SINGLE, 4);

    private final String roomName;
    private final RoomType roomType;
    private final int number;
    RoomCollectionType(String roomName, RoomType roomType, int number){
        this.roomName = roomName;
        this.roomType = roomType;
        this.number = number;
    }

    public String getRoomName(){
        return this.roomName;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getNumber(){
        return this.number;
    }

}
