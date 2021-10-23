package bigdata.labs.lab2;


public class AirportParser {
    String delimiter;
    String quote;

    public AirportParser(String d, String q) {
        delimiter = d;
        quote = q;
    }

    public int getAirportID(String s) {
        return Integer.parseInt(getColumn(s, 0));
    }

    public String getName(String s) {
        return getColumn(s, 1);
    }

    public String getColumn(String s, int number) {
        return s.split(delimiter)[number].replace(quote, "");
    }
}
