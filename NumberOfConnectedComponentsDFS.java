public class NumberOfConnectedComponentsDFS {
    public NumberOfConnectedComponentsDFS(){
        //INTENTIONALLY EMPTY
    }
    public int numberOfConnectedComponentsDFS(Graph graph){
        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        int[] finishOrder = new int[graph.getNumV()];
        return finishOrder.length;
    }
}
