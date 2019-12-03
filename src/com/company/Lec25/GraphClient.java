package com.company.Lec25;

public class GraphClient {

    public static void main(String[] args) {


        AdjacencyMapgraph<String> graph = new AdjacencyMapgraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B");
        graph.addEdge("B","C");
        graph.addEdge("C","D");
        graph.addEdge("A","C");

//        graph.display();

        AdjacencyMapgraph<String> graph1=graph.kruskal();

        graph1.display();
    }
}
