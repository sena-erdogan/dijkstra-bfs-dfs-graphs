import java.util.Random;
@SuppressWarnings("unchecked")
public class Driver {
    public static void main(String[] args){

        NumberOfConnectedComponentsBFS numberOfConnectedComponentsBFS = new NumberOfConnectedComponentsBFS();
        NumberOfConnectedComponentsDFS numberOfConnectedComponentsDFS = new NumberOfConnectedComponentsDFS();

        ListGraph graph0 = new ListGraph(1000,false);

        Edge edge;

        Random rand = new Random();

        int random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph0.insert(edge);
        }

        long startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph0);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        System.out.println("graph0's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph0);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph0's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph1 = new ListGraph(1000,false);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph1.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph1);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph1's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph1);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph1's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph2 = new ListGraph(1000,false);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph2.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph2);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph2's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph2);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph2's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph3 = new ListGraph(1000,true);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph3.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph3);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph3's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph3);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph3's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph4 = new ListGraph(1000,true);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph4.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph4);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph4's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph4);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph4's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph5 = new MatrixGraph(1000,false);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph5.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph5);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph5's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph5);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph5's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph6 = new MatrixGraph(1000,false);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph6.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph6);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph6's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph6);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph6's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph7 = new MatrixGraph(1000,true);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph7.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph7);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph7's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph7);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph7's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph8 = new MatrixGraph(1000,true);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph8.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph8);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph8's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph8);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph8's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph9 = new MatrixGraph(1000,false);

        random = rand.nextInt(500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(1000), rand.nextInt(1000));
            graph9.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph9);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph9's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph9);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph9's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph10 = new ListGraph(2000,false);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph10.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph10);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph10's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph10);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph10's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph11 = new ListGraph(2000,false);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph11.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph11);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph11's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph11);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph11's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph12 = new ListGraph(2000,false);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph12.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph12);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph12's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph12);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph12's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph13 = new ListGraph(2000,true);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph13.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph13);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph13's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph13);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph13's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph14 = new ListGraph(2000,true);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph14.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph14);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph14's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph14);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph14's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph15 = new MatrixGraph(2000,false);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph15.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph15);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph15's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph15);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph15's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph16 = new MatrixGraph(2000,false);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph16.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph16);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph16's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph16);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph16's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph17 = new MatrixGraph(2000,true);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph17.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph17);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph17's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph17);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph17's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph18 = new MatrixGraph(2000,true);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph18.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph18);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph18's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph18);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph18's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph19 = new MatrixGraph(2000,false);

        random = rand.nextInt(1000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(2000), rand.nextInt(2000));
            graph19.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph19);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph19's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph19);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph19's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph20 = new ListGraph(5000,false);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph20.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph20);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph20's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph20);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph20's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph21 = new ListGraph(5000,false);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph21.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph21);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph21's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph21);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph21's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph22 = new ListGraph(5000,false);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph22.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph22);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph22's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph22);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph22's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph23 = new ListGraph(5000,true);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph23.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph23);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph23's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph23);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph23's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph24 = new ListGraph(5000,true);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph24.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph24);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph24's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph24);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph24's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph25 = new MatrixGraph(5000,false);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph25.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph25);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph25's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph25);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph25's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph26 = new MatrixGraph(5000,false);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph26.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph26);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph26's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph26);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph26's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph27 = new MatrixGraph(5000,true);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph27.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph27);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph27's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph27);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph27's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph28 = new MatrixGraph(5000,true);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph28.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph28);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph28's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph28);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph28's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph29 = new MatrixGraph(5000,false);

        random = rand.nextInt(2500) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(5000), rand.nextInt(5000));
            graph29.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph29);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph29's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph29);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph29's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph30 = new ListGraph(10000,false);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph30.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph30);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph30's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph30);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph30's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph31 = new ListGraph(10000,false);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph31.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph31);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph31's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph31);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph31's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph32 = new ListGraph(10000,false);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph32.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph32);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph32's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph32);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph32's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph33 = new ListGraph(10000,true);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph33.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph33);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph33's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph33);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph33's DFS took " + duration + " nanoseconds.");

        System.gc();

        ListGraph graph34 = new ListGraph(10000,true);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph34.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph34);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph34's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph34);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph34's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph35 = new MatrixGraph(10000,false);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph35.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph35);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph35's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph35);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph35's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph36 = new MatrixGraph(10000,false);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph36.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph36);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph36's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph36);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph36's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph37 = new MatrixGraph(10000,true);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph37.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph37);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph37's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph37);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph37's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph38 = new MatrixGraph(10000,true);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph38.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph38);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph38's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph38);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph38's DFS took " + duration + " nanoseconds.");

        System.gc();

        MatrixGraph graph39 = new MatrixGraph(10000,false);

        random = rand.nextInt(5000) + 3;

        for(int i=0; i<random; i++){
            edge = new Edge(rand.nextInt(10000), rand.nextInt(10000));
            graph39.insert(edge);
        }

        startTime = System.nanoTime();
        numberOfConnectedComponentsBFS.numberOfConnectedComponentsBFS(graph39);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph39's BFS took " + duration + " nanoseconds.");

        startTime = System.nanoTime();
        numberOfConnectedComponentsDFS.numberOfConnectedComponentsDFS(graph39);
        endTime = System.nanoTime();

        duration = (endTime - startTime);

        System.out.println("graph39's DFS took " + duration + " nanoseconds.");

        DijkstrasAlgorithm dijkstrasAlgorithm = new DijkstrasAlgorithm();
        int[] pred = new int[graph39.getNumV()];
        Operation operation = Operation.star;
        Integer[] dist = new Integer[graph39.getNumV()];
        dijkstrasAlgorithm.dijkstrasAlgorithm(graph39, 0, pred, dist, operation);

        System.out.println("Result of the appplication of Dijkstra's Algorithm on graph39:");

        for(Integer i: dist){
            System.out.println(i);
        }

        Importance importance = new Importance();

        System.out.println(importance.importance(graph39));
        System.out.println(importance.fairImportance(graph39));

    }
}
