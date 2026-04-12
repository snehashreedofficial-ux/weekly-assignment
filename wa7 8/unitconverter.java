public class unitconverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method to test the utility class
    public static void main(String[] args) {

        double km = 10;
        double miles = 5;
        double meters = 3;
        double feet = 6;

        System.out.println("10 km to miles = " + convertKmToMiles(km));
        System.out.println("5 miles to km = " + convertMilesToKm(miles));
        System.out.println("3 meters to feet = " + convertMetersToFeet(meters));
        System.out.println("6 feet to meters = " + convertFeetToMeters(feet));
    }
}