package com.Graphs;

/**
 * Basic class for a Vertex in Graph
 */
public class Vertex {
    private char label;
    private boolean wasVisited;
    public Vertex(char label){
        this.label = label;
        wasVisited = false;
    }

    public char getLabel(){return label;}
}
