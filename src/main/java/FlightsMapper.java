import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        FlightParser parser = new FlightParser(",", "\"");
        int code = parser.getAirportID(value.toString());
        context.write(new AirportKeyComparable(code, 0), new Text(parser.getDelay(value.toString())));
    }
}
