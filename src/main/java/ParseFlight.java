import org.apache.hadoop.io.Text;

public class ParseFlight {
    private String[] words;
    private String flightId;

    public ParseFlight(String s) {
        words = s.split(",");
        flightId = words[14];
        if (words[18].isEmpty()) {

        }
    }

    public String GetAirportId() {
        return airportId;
    }

    public String GetAirportName() {
        return airportName;
    }


}
