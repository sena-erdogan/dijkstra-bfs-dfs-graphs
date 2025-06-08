import java.util.*;

/** A class for calling Dijkstra's algorithm.
 *  @author Koffman and Wolfgang
 */
@SuppressWarnings("unchecked")
public class DijkstrasAlgorithm<E extends Comparable<E>> {

    /** Dijkstra�s Shortest-Path algorithm.
     @param graph The weighted graph to be searched
     @param start The start vertex
     @param pred Output array to contain the predecessors
     in the shortest path
     @param dist Output array to contain the distance
     in the shortest path
     */
    public void dijkstrasAlgorithm(Graph graph,
                                          int start,
                                          int[] pred,
                                          E[] dist, Operation operation) {
        int numV = graph.getNumV();
        HashSet < Integer > vMinusS = new HashSet < Integer > (numV);
        // Initialize V�S.
        for (int i = 0; i < numV; i++) {
            if (i != start) {
                vMinusS.add(i);
            }
        }
        // Initialize pred and dist.
        for (int v : vMinusS) {
            pred[v] = start;
            dist[v] = (E) graph.getEdge(start, v).getWeight();
        }
        // Main loop
        while (vMinusS.size() != 0) {
            // Find the value u in V�S with the smallest dist[u].
            E minDist = dist[0];
            int u = -1;
            for (int v : vMinusS) {
                if (dist[v].compareTo(minDist) < 0) {
                    minDist = dist[v];
                    u = v;
                }
            }
            // Remove u from vMinusS.
            vMinusS.remove(u);
            Iterator<Edge> edgeIter = graph.edgeIterator(u);

            //Check if the graph is a list graph or a matrix graph and update the distances using the appropriate code segment.

            // Update the distances for MatrixGraph.
            for (int v : vMinusS) {
                if (graph.isEdge(u, v)) {
                    E weight = (E) graph.getEdge(u, v).getWeight();
                    if(operation == Operation.addition){
                        /*if (dist[u] + weight < dist[v]) {
                            dist[v] = dist[u] + weight;
                            pred[v] = u;
                        }*/
                    }else if(operation == Operation.multiplication){
                       /* if (dist[u] * weight < dist[v]) {
                            dist[v] = dist[u] * weight;
                            pred[v] = u;
                        }*/
                    }else if(operation == Operation.star){
                       /* if (dist[u] + weight - (dist[u] * weight) < dist[v]) {
                            dist[v] = dist[u] + weight - (dist[u] * weight);
                            pred[v] = u;
                        }*/
                    }
                }
            }

            // Update the distances for ListGraph.
            while (edgeIter.hasNext()) {
                Edge edge = edgeIter.next();
                int v = edge.getDest();
                if(vMinusS.contains(v)){
                    E weight = (E) edge.getWeight();
                    if(operation == Operation.addition){
                        /*if (dist[u] + weight < dist[v]) {
                            dist[v] = dist[u] + weight;
                            pred[v] = u;
                        }*/
                    }else if(operation == Operation.multiplication){
                       /* if (dist[u] * weight < dist[v]) {
                            dist[v] = dist[u] * weight;
                            pred[v] = u;
                        }*/
                    }else if(operation == Operation.star){
                       /* if (dist[u] + weight - (dist[u] * weight) < dist[v]) {
                            dist[v] = dist[u] + weight - (dist[u] * weight);
                            pred[v] = u;
                        }*/
                    }
                }
            }
        }
    }
}
