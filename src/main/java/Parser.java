import org.apache.hadoop.io.Text;

public class Parser {
    public String[] Parser(Text t) {
        return t.toString().split(",");
    }
}
