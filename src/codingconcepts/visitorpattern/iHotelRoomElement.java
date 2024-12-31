package codingconcepts.visitorpattern;

/**
 * Any object where you have to add operations, but you want to separate the operations will be marked as element.
 */
public interface iHotelRoomElement {
    void accept(iRoomVisitor visitor);
}
