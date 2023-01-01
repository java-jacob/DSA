package com.Graphs;

public class Graph {
    private final int MAX_VERT = 20;
    private Vertex vertexList[];            //Array Of Vertex
    private int adjacencyMatrix[][];
    private int nVerts;                     //Current number of vertices

    public Graph(){
        vertexList = new Vertex[MAX_VERT];
        adjacencyMatrix = new int[MAX_VERT][MAX_VERT];
        nVerts = 0;
    }

    public void addVertex(char label){
        Vertex vertex = new Vertex(label);
        vertexList[nVerts++] = vertex;
    }
    public void addEdge(int start, int end){
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][end] = 1;
    }

    public void displayVertex (int v){
        System.out.println(vertexList[v].getLabel());
    }

}
