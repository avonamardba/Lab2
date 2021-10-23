import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportIDPartitioner extends Partitioner<AirportKeyComparable, Text> {

    @Override
    public int getPartition(AirportKeyComparable airportKeyComparable, Text text, int i) {
        return 0;
    }
}
