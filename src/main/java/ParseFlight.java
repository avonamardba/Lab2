import org.apache.hadoop.io.Text;

public class ParseFlight {
    private String flightId;

    public ParseFlight(String s) {
        String[] words = s.split(",");
        flightId = words[14];
        if (words[18])
    }

    public String GetAirportId() {
        return airportId;
    }

    public String GetAirportName() {
        return airportName;
    }


}
