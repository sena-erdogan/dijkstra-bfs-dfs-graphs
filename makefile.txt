JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES =  AbstractGraph.java BreadthFirstSearch.java CompareEdges.java DepthFirstSearch.java DijkstrasAlgorithm.java Edge.java Graph.java Importance.java ListGraph.java MatrixGraph.java NumberOfConnectedComponentsBFS.java NumberOfConnectedComponentsDFS.java Driver.java

default: classes

classes: $(CLASSES:.java=.class)
	java Driver

clean:
	$(RM) *.class
