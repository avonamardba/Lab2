import org.apache.hadoop.io.DataInputBuffer;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class AirportKeyComparable implements WritableComparable<AirportKeyComparable> {
    private int key, val;

    public AirportKeyComparable() {
        key = 0;
        val = 0;
    }

    public AirportKeyComparable(int x, int y) {
        key = x;
        val = y;
    }

    public int GetKey() {
        return key;
    }

    public int Getval() {
        return val;
    }

    public int Hashcode() {
        return Integer.hashCode(key);
    }

    public int CompareKeys(AirportKeyComparable z) {
        return Integer.compare(key, z.key);
    }

    public int CompareWith(AirportKeyComparable z) {
        if (Integer.compare(key, z.key) != 0) {
            return Integer.compare(key, z.key);
        } else return Integer.compare(val, z.val);
    }

    public void write(DataOutput output) throws IOException {
        output.write(key);
        output.write(val);
    }
    public void read(DataInput input) throws IOException {
        key = input.readInt();
        val = input.readInt();
    }
}