/**
 * ========================================================
 * CLASS - SuiteRoom
 * ========================================================
 *
 * Represents a suite room in the hotel.
 *
 * @version 2.1
 */
public class SuiteRoom extends Room {

    /**
     * Initializes a SuiteRoom with
     * predefined attributes.
     */
    public SuiteRoom() { super(3, 750, 5000.0); }

    @Override
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}