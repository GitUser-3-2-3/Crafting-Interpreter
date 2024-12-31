package codingconcepts.visitorpattern;

public class Client {

    public static void main(String[] args) {

        iHotelRoomElement singleRoomObj = new SingleHotelRoom();
        iHotelRoomElement doubleRoomObj = new DoubleHotelRoom();
        iHotelRoomElement deluxeRoomObj = new DeluxeHotelRoom();

        // Performing operations on the SingleRoom for Pricing.
        iRoomVisitor pricingVisitor = new RoomPricingVisitor();
        singleRoomObj.accept(pricingVisitor);
        System.out.print(singleRoomObj);

        // Performing operations on the DoubleRoom for Maintenance.
        iRoomVisitor maintenanceVisitor = new RoomMaintenanceVisitor();
        doubleRoomObj.accept(maintenanceVisitor);

        // Performing operations on the DeluxeRoom for Reservation.
        iRoomVisitor reservationVisitor = new ReserveRoomVisitor();
        deluxeRoomObj.accept(reservationVisitor);
    }
}









