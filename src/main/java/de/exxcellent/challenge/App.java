package de.exxcellent.challenge;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {	
    	
    	// construct UtilityCSV objects for both sets
    	UtilityCSV weatherData = new UtilityCSV("src/main/resources/de/exxcellent/challenge/weather.csv");
    	UtilityCSV footballData = new UtilityCSV("src/main/resources/de/exxcellent/challenge/football.csv");

    	// calculate correct day/team
        String dayWithSmallestTempSpread = weatherData.minDist(1, 2);
        String teamWithSmallesGoalSpread = footballData.minDist(5, 6);

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
    }
}
