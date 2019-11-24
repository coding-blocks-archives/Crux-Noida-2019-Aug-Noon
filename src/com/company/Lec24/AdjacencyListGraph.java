package com.company.Lec24;

import java.util.*;

public class AdjacencyListGraph<T> {

    LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
        this.vertices = new LinkedList<>();
    }

    public void addVertex(T value){

        vertices.add(new Vertex(value));
    }

    public void addEdge(T first, T second){

        Vertex f= find(first);
        Vertex s= find(second);

        if(f!=null &&s!=null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public void display(){

        for (Vertex vertex:vertices) {
            System.out.print(vertex.value+ "=>");

            for (Vertex padosi:vertex.neighbours) {
                System.out.print(padosi.value);
            }
            System.out.println();
        }
    }

    public void BFT(){

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex =vertices.get(0);

        visited.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){

            Vertex top = queue.remove();

            System.out.println(top.value);

            for (Vertex padosi:top.neighbours) {
                if(!visited.contains(padosi)){
                    visited.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    public boolean BFS(T value){

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex =vertices.get(0);

        visited.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){

            Vertex top = queue.remove();

            if(top.value.equals(value)){
                return true;
            }

            for (Vertex padosi:top.neighbours) {
                if(!visited.contains(padosi)){
                    visited.add(padosi);
                    queue.add(padosi);
                }
            }
        }
        return false;
    }

    public void Connectedcomponent(){

        Set<Vertex> visited =new HashSet<>();
        Queue<Vertex> queue= new LinkedList<>();

        for (Vertex vertex: vertices) {

            if(visited.contains(vertex)){
                continue;
            }

            visited.add(vertex);
            queue.add(vertex);

            while(!queue.isEmpty()){

                Vertex top = queue.remove();

                System.out.print(top.value);

                for (Vertex padosi:top.neighbours) {
                    if(!visited.contains(padosi)){
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }
            System.out.println();
        }
    }



    public void DFT(){

        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        Vertex vertex =vertices.get(0);

        visited.add(vertex);
        stack.push(vertex);

        while(!stack.isEmpty()){

            Vertex top = stack.pop();

            System.out.println(top.value);

            for (Vertex padosi:top.neighbours) {
                if(!visited.contains(padosi)){
                    visited.add(padosi);
                    stack.push(padosi);
                }
            }
        }
    }



    public Vertex find(T value){

        for (Vertex vertex: vertices) {

            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }


    private class Vertex{

        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }
}
