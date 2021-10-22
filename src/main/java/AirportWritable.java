import org.apache.hadoop.io.Text;

public class AirportWritable {
    private int airportId;

    public AirportWritable(Text t) {
        String fileData = t.toString();
        String[] s = fileData.split(",");
        
    }

}
