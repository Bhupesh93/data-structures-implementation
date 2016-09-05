package com.hpe.graph;

import com.hpe.Queue;
import com.hpe.exception.QueueEmptyException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Boobesh S on 9/5/2016.
 */
public class AdjacencyGraph {
    private int noOfVertices;
    private List<Integer> adjacentNodes[];

    public AdjacencyGraph(int noOfVertices) {
        this.noOfVertices = noOfVertices;
        adjacentNodes = new LinkedList[noOfVertices];
        for (int i = 0; i < noOfVertices; i++) {
            adjacentNodes[i] = new LinkedList();
        }
    }

    public void addEdge(int vertice1,int vertice2){
        adjacentNodes[vertice1].add(vertice2);
    }

    private void DepthFirstUtil(int vertice,boolean[] visited){
        if(visited[vertice])
            return;
        visited[vertice] = true;
        System.out.println(vertice + " ");
        for (int i=0;i<adjacentNodes[vertice].size();i++){
            DepthFirstUtil(adjacentNodes[vertice].get(i),visited);
        }
    }

    public void DepthFirst(int vertice){
        System.out.println("the depth first search from vertice "+vertice + " ...");
        boolean[] visited = new boolean[noOfVertices];
        DepthFirstUtil(vertice,visited);
    }

    public void breadthFirstSearch(int vertice) throws QueueEmptyException {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(vertice);
        boolean visited[] = new boolean[noOfVertices];
        while(!queue.isEmpty()){
            int current = queue.remove();
            visited[current] = true;
            System.out.println(current);
            for(int i=0; i<adjacentNodes[current].size();i++){
                if(!visited[adjacentNodes[current].get(i)]){
                    queue.add(adjacentNodes[current].get(i));
                }
            }
        }

    }

}
