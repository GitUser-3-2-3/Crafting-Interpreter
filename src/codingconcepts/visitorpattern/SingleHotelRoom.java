package codingconcepts.visitorpattern;

public class SingleHotelRoom implements iHotelRoomElement {

    int roomPrice = 0;

    @Override
    public void accept(iRoomVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "is " + roomPrice;
    }
}
