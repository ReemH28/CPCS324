/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */
package GraphFramework;
import java.util.LinkedList;



public class Vertex {
   
    public int label; // Name of this Vertex
    public Boolean isVisited;
    public LinkedList <Edge> adjList; // The AdjList of this Vertex
    
    public Vertex() {
        adjList = new LinkedList<Edge>() ;
    }
  
    public Vertex(int label) {
        this.label = label;
        this.isVisited = false;
        adjList = new LinkedList<Edge>();
    }
    
    public int getLabel() {
        return label;
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }
    
   public void displayInfo() {
        System.out.print(label);
    }
} 
