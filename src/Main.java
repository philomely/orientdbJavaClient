
//import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;
//import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.*;
import com.tinkerpop.blueprints.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello orientdb!");
// AT THE BEGINNING
        OrientGraphFactory factory = new OrientGraphFactory("remote:localhost/GratefulDeadConcerts");

// EVERY TIME YOU NEED A GRAPH INSTANCE
        OrientGraph graph = factory.getTx();
        try {
            for (Vertex v : graph.getVertices()) {
                System.out.println(v.getId());
            }

        } finally {
            graph.shutdown();
        }
    }
}
