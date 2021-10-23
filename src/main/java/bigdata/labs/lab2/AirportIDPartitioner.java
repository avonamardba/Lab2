package bigdata.labs.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportIDPartitioner extends Partitioner<AirportKeyComparable, Text> {

    @Override
    public int getPartition(@org.jetbrains.annotations.NotNull AirportKeyComparable key, Text value, int i) {
        return key.hashcode() % i;
    }
}
