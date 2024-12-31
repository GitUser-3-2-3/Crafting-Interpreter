package codingconcepts.visitorpattern;

public class DeluxeHotelRoom implements iHotelRoomElement {

    int roomPrice = 0;

    @Override
    public void accept(iRoomVisitor visitor) {
        visitor.visit(this);
    }
}
