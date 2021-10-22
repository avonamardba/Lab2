import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

public abstract class AirportKeyComparable implements WritableComparable<AirportKeyComparable> {
    int key, type;

    public AirportKeyComparable() {
        key = 0;
        type = 0;
    }

    public AirportKeyComparable(int x, int y) {
        key = x;
        type = y;
    }

    
}
