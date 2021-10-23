import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] cols = value.toString().split(",");
        int code = Integer.parseInt(cols[0].replace("\"", ""));
        String name = cols[1].replace("\"", "");
        context.write(new AirportKeyComparable(code, 0), new Text(delay));
    }
}
