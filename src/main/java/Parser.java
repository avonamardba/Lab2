import org.apache.hadoop.io.Text;

public class Parser {
    private String airportId;
    private String airportName;
    private String flightId;

    public Parser(String s) {
        String[] words = s.split(",[\"]");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\'", "");
        }
        airportId = words[0];
        airportName = words[1];
    }

    public String GetAirportId() {
        return airportId;
    }

    public String GetAirportName() {
        return airportName;
    }


}
