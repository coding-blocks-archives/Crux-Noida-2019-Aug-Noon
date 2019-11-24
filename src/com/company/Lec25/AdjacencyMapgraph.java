package com.company.Lec25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyMapgraph<T> {

    Map<T, Vertex> vertexMap;

    Map<Vertex,Vertex> parent = new HashMap<>();

    public AdjacencyMapgraph() {
        this.vertexMap = new HashMap<>();
    }

    public void addVertex(T value){

        if(!vertexMap.containsKey(value)){
            vertexMap.put(value,new Vertex(value));
        }
    }

    public void addEdge(T first, T second){

        vertexMap.get(first).neighbours.put(vertexMap.get(second),1);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),1);
    }



    public void display(){

        for (T vertex: vertexMap.keySet()) {

            System.out.print(vertex + " => ");

            for (Vertex padosi: vertexMap.get(vertex).neighbours.keySet()) {

                System.out.print(padosi.value);
            }
            System.out.println();
        }
    }

    public void parent(){

        for (Vertex vertex: vertexMap.values()) {

            parent.put(vertex,null);
        }
    }

    public Vertex find(Vertex v){

        while(parent.get(v)!=null){
            v=parent.get(v);
        }
        return v;
    }

    public boolean union(Vertex first, Vertex second){

        Vertex f= find(first);
        Vertex s= find(second);

        if(f!=s){
            parent.put(f,s);
            return true;
        }

        return false;
    }


    public AdjacencyMapgraph<T> kruskal(){

        parent();

        ArrayList<Edge> edges =new ArrayList<>();

        AdjacencyMapgraph<T> map = new AdjacencyMapgraph<>();

        for (T values :vertexMap.keySet()) {
            map.addVertex(values);
        }

        for (Vertex vertex: vertexMap.values()) {

            for ( Vertex padosi: vertex.neighbours.keySet()) {

                edges.add(new Edge(vertex,padosi,vertex.neighbours.get(padosi)));
            }
        }

        edges.sort((o1, o2) -> o1.weight-o2.weight);

        for (Edge e: edges) {

            if(union(e.first,e.second)){

                map.addEdgeWeight(e.first.value,e.second.value,e.weight);
            }
        }

        return map;
    }

    public void addEdgeWeight(T first, T second,int weight){

        vertexMap.get(first).neighbours.put(vertexMap.get(second),weight);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),weight);
    }


    private class Vertex{

        T value;
        Map<Vertex, Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours =new HashMap<>();
        }
    }

    private class Edge{

        Vertex first;
        Vertex second;
        int weight;

        public Edge(Vertex first, Vertex second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }
    }
}
