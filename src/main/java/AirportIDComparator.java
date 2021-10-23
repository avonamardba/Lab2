import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportIDComparator extends WritableComparator {
    public AirportIDComparator(){

    }

    public int compare(WritableComparable l, WritableComparable r){
        AirportKeyComparable x = (AirportKeyComparable) l;
        AirportKeyComparable y = (AirportKeyComparable) r;
        return x.compareKeys(y);
    }
}
