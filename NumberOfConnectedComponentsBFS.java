import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NumberOfConnectedComponentsBFS {
    public NumberOfConnectedComponentsBFS(){
        //INTENTIONALLY LEFT EMPTY
    }
    public int numberOfConnectedComponentsBFS(Graph graph){
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        int[] visited;
        int[] allVisited = new int[1];
        int i=0;
        Iterator iter = graph.edgeIterator(1);
        while(iter.hasNext()){
            visited = bfs.breadthFirstSearch(graph,i);
            allVisited = Arrays.copyOf(allVisited,allVisited.length + visited.length);
            System.arraycopy(visited,0,allVisited,allVisited.length-1,visited.length);
            i++;
        }
        int[] endArray = new int[allVisited.length];
        int size=0;
        boolean flag = false;
        for(int j: allVisited){
            for(int k: endArray){
                if(j == k){
                    flag = true;
                }
            }
            if(flag == false){
                endArray[size] = j;
                size++;
            }
            flag= false;
        }
        return endArray.length;
    }
}
