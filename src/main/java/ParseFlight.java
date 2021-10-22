import org.apache.hadoop.io.Text;

public class ParseFlight {
    private String[] words;
    private String flightId;
    private String delay;

    public ParseFlight(String s) {
        words = s.split(",");
        flightId = words[14];
        delay = words[18];
        if (!words[18].isEmpty()) {
            return flightId;
        }
    }

    public String GetAirportId() {
        return airportId;
    }

    public String GetAirportName() {
        return airportName;
    }


}
