package bigdata.labs.lab2;

public class FlightParser {
    String delimiter;
    String quote;

    public FlightParser(String d, String q) {
        delimiter = d;
        quote = q;
    }

    public int getAirportID(String s) {
        return Integer.parseInt(getColumn(s, 14));
    }

    public String getDelay(String s) {
        return getColumn(s, 18);
    }

    public String getColumn(String s, int number) {
        return s.split(delimiter)[number].replace(quote, "");
    }
}
