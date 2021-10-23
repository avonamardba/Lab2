package bigdata.labs.lab2;

public class FlightParser {
    String delimiter;
    String quote;
    private static int FLIGHT = 14;
    private static int DELAY = 18;

    public FlightParser(String d, String q) {
        delimiter = d;
        quote = q;
    }

    public int getAirportID(String s) {
        return Integer.parseInt(getColumn(s, FLIGHT));
    }

    public String getDelay(String s) {
        return getColumn(s, DELAY);
    }

    public String getColumn(String s, int number) {
        return s.split(delimiter)[number].replace(quote, "");
    }
}
