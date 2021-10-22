import org.apache.hadoop.io.Text;

public class Parser {
    public Parser(String s) {
        String[] words = s.split(",[\"]");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\'", "");
        }
        String airportId = words[0];
        String airportName = words[1];
    }

}
