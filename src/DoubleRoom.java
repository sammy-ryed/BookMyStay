/**
 * ========================================================
 * CLASS - DoubleRoom
 * ========================================================
 *
 * Represents a double room in the hotel.
 *
 * @version 2.1
 */
public class DoubleRoom extends Room {

    /**
     * Initializes a DoubleRoom with
     * predefined attributes.
     */
    public DoubleRoom() { super(2, 400, 2500.0); }

    @Override
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}