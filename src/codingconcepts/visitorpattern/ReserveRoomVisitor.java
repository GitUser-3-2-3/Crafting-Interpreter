package codingconcepts.visitorpattern;

class ReserveRoomVisitor implements iRoomVisitor {

    @Override
    public void visit(SingleHotelRoom singleRoomObj) {
        System.out.print("\nReserve Single room...");
    }

    @Override
    public void visit(DoubleHotelRoom doubleRoomObj) {
        System.out.print("\nReserve Double room...");
    }

    @Override
    public void visit(DeluxeHotelRoom deluxeRoomObj) {
        System.out.print("\nReserve Deluxe room...");
    }
}
