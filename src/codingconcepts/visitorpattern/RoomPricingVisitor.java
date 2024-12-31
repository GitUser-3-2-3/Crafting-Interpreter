package codingconcepts.visitorpattern;

class RoomPricingVisitor implements iRoomVisitor {

    @Override
    public void visit(SingleHotelRoom singleRoomObj) {
        System.out.print("\nPricing of Single room...");
        singleRoomObj.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleHotelRoom doubleRoomObj) {
        System.out.print("\nPricing of Double room...");
        doubleRoomObj.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeHotelRoom deluxeRoomObj) {
        System.out.print("\nPricing of Deluxe room...");
        deluxeRoomObj.roomPrice = 5000;
    }
}
