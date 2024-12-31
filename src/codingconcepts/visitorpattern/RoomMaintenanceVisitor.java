package codingconcepts.visitorpattern;

class RoomMaintenanceVisitor implements iRoomVisitor {

    @Override
    public void visit(SingleHotelRoom singleRoomObj) {
        System.out.print("\nMaintain Single room...");
    }

    @Override
    public void visit(DoubleHotelRoom doubleRoomObj) {
        System.out.print("\nMaintain Double room...");
    }

    @Override
    public void visit(DeluxeHotelRoom deluxeRoomObj) {
        System.out.print("\nMaintain Deluxe room...");
    }
}
