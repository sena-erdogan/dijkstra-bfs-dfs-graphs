public class Importance{
    public Importance(){
        //INTENTIONALLY LEFT EMPTY
    }

    public double importance(Graph graph){
        if(graph.isDirected())  throw new UnsupportedOperationException();
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        double returnVal = 0;
        int dividend = 0;
        int denominator = 0;
        int count = 0;
        for(int i=0; i<graph.getNumV(); i++){
            for(int j=i; j<graph.getNumV(); i++){
                int[] path;
                path = breadthFirstSearch.breadthFirstSearch(graph,i);
                dividend = path.length; // dividend is the number of shortest paths from i to j
                if(path[path.length/2] == i)    denominator++; // if i is an intermediate vertex, increment the denominator by 1
            }
        }

        returnVal = dividend / denominator;
        return returnVal;
    }

    public double fairImportance(Graph graph){
        double returnVal = importance(graph);
        int divideVal = graph.getNumV() * graph.getNumV();
        return returnVal / divideVal;
    }
}
