package bigdata.labs.lab2;

import org.apache.hadoop.io.DataInputBuffer;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKeyComparable implements WritableComparable<AirportKeyComparable> {
    private int key, val;

    public AirportKeyComparable() {
        key = 0;
        val = 0;
    }

    public AirportKeyComparable(int x, int y) {
        key = x;
        val = y;
    }

    public int getKey() {
        return key;
    }

    public int getval() {
        return val;
    }

    public int hashcode() {
        return Integer.hashCode(key);
    }

    public int compareKeys(AirportKeyComparable z) {
        return Integer.compare(key, z.key);
    }

    @Override
    public int compareTo(AirportKeyComparable z) {
        if (Integer.compare(key, z.key) != 0) {
            return Integer.compare(key, z.key);
        } else return Integer.compare(val, z.val);
    }

    @Override
    public void write(DataOutput output) throws IOException {
        output.writeInt(key);
        output.writeInt(val);
    }

    @Override
    public void readFields(DataInput input) throws IOException {
        key = input.readInt();
        val = input.readInt();
    }
}
