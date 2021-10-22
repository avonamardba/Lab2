import org.apache.hadoop.io.WritableComparable;

public abstract class AirportKeyComparable implements WritableComparable<AirportKeyComparable> {
    private int key, type;

    public AirportKeyComparable() {
        key = 0;
        type = 0;
    }

    public AirportKeyComparable(int x, int y) {
        key = x;
        type = y;
    }

    public int GetKey() {
        return key;
    }

    public int Hashcode() {
        return Integer.hashCode(key);
    }

    public int CompareKeys(AirportKeyComparable z) {
        return Integer.compare(key, z.key);
    }

    public int intCompareWith(AirportKeyComparable z) {
        if (Integer.compare(key, z.key) != 0) {
            return Integer.compare(key, z.key);
        } else return Integer.compare(type, z.type);
    }
}
