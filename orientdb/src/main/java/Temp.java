import com.tinkerpop.blueprints.impls.orient.OrientGraph;

/**
 * Created by admin on 1/25/16.
 */
public class Temp {
    public static void main(String[] args) {
        OrientGraph graph = new OrientGraph("plocal:GratefulDeadConcerts", "root", "password");

        graph.shutdown();



        System.out.println("Done!");
    }
}
