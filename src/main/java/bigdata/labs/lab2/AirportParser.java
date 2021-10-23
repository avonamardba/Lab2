package bigdata.labs.lab2;


public class AirportParser {
    String delimiter;
    String quote;
    private static int AIRPORT_ID = 0;
    private static int AIRPORT_NAME = 1;

    public AirportParser(String d, String q, String s) {
        delimiter = d;
        quote = q;

        s = s.split(d);
    }

    public int getAirportID(String s) {
        return Integer.parseInt(getColumn(s, AIRPORT_ID));
    }

    public String getName(String s) {
        return getColumn(s, AIRPORT_NAME);
    }

    public String getColumn(String s, int number) {
        return s.split(delimiter)[number].replace(quote, "");
    }
}
