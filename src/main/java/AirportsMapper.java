import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

    }

}
