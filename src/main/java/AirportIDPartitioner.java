import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportIDPartitioner extends Partitioner<AirportKeyComparable, Text> {

    @Override
    public int getPartition(AirportKeyComparable key, Text value, int i) {
        return key.hashcode() % i;
    }
}
