import java.util.Comparator;

/** A class for comparing 2 edges.
 *  @author Koffman and Wolfgang
 */
@SuppressWarnings("unchecked")
public class CompareEdges
        implements Comparator < Edge > {
    public int compare(Edge e1, Edge e2) {
        return e1.getWeight().compareTo(e2.getWeight());
    }
}
