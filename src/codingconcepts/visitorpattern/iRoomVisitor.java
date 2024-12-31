package codingconcepts.visitorpattern;

public interface iRoomVisitor {

    void visit(SingleHotelRoom singleRoomObj);

    void visit(DoubleHotelRoom doubleRoomObj);

    void visit(DeluxeHotelRoom deluxeRoomObj);
}