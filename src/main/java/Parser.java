import org.apache.hadoop.io.Text;

public class Parser {
    private String AirportId, AirportName;

    public Parser(String s) {
        String[] words = s.split(",");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\'", "");
        }
        AirportId = 
    }

}
