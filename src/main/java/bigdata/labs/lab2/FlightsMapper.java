import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        FlightParser parser = new FlightParser(",", "\"");
        int code = parser.getAirportID(value.toString());
        String delay = parser.getDelay(value.toString());
        if (!delay.isEmpty()) {
            context.write(new AirportKeyComparable(code, 1), new Text(delay));
        }
    }
}
