import java.util.Comparator;

/**
 * Created by sasha on 10.01.2017.
 */

public class Compare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}
