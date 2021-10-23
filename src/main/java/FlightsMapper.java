import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] cols = value.toString().split(",");
        int code = Integer.parseInt(cols[14].replace("\"", ""));
        String delay = cols[18].replace("\"", "");
        context.write(new AirportKeyComparable(code, 1), new Text(delay));
    }
}
