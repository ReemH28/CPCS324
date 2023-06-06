/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */
package GraphFramework;

import java.util.*;

public class SingleSourceSPAlg extends ShortestPathAlgorithm {
    int[] distance;
    String[] path;
    //Graph graph;
    int infinity = Integer.MAX_VALUE; 

    public SingleSourceSPAlg(Graph graph) {
        this.graph = graph;
    }

    public void computeDijkstraAlg(Vertex vert) {

        // Get distance array to calculate cost & Get path array to collect path passed
        distance = new int[graph.vertices.length]; // Hold the shortest distance from source to each vertex
        path = new String[graph.vertices.length]; // Hold the vertices path from the source to the vertex

        // Update all the vertices distance as infinity -- to set it later to minimum
        // distance as needed
        for (int i = 0; i < graph.vertices.length; i++) {
            distance[i] = infinity;
        }

       
        distance[0] = 0;// Distance of source vertex from itself is always 0
        Vertex src = graph.vertices[0].adjList.get(0).source; // Get the source Vertex
        ///////////////////////////////////////
        path[0] = "loc. " + graph.vertices[0].getLabel()+": city " + 0; // Hold 1st source as override output of the path

        // Loop Through the array
        for (int i = 0; i < graph.vertices.length - 1; i++) {
            int u = minDistance(distance); // Pick the minimum distance vertex from the set of not visited vertices
            graph.vertices[u].isVisited = true;// Mark the picked vertex as visited

            Iterator<Edge> iterate = graph.vertices[u].adjList.iterator(); // Iterate through all neighbors

            while (iterate.hasNext()) {
                Edge edge = iterate.next();

                if (graph.vertices[edge.target.label].isVisited != true && edge.weight != infinity
                        && edge.weight != 0) {
                    
                    if (distance[u] + edge.weight < distance[edge.target.label]) {
                        // Update both distance array and path array

                        distance[edge.target.label] = distance[u] + edge.weight; // Update the target location to the
                        // new one minimum distance
                        //////////////////////////////
                        path[edge.target.label] = path[u] + " – " + edge.target.getLabel()+": city " + edge.target.label; // Add the target
                       
                    } 
                } 
            }
        } 
    } 

  
    public int minDistance(int[] smallestDistance) {
        int u = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < graph.vertices.length; i++) {
            // The vertex must be not visited and its less than the minimum distance
            if (graph.vertices[i].isVisited != true && smallestDistance[i] < minDistance) {
                minDistance = smallestDistance[i]; 
                u = i; // Minimum vertex index
            }
        }
        return u;
    }

    public void printResult() {
        String routerName = String.valueOf((char) (graph.vertices[0].label + 65));
        System.out.println("The source router is " + routerName);
        System.out.println("\nThe paths from router " + routerName + " to the rest of the routers are:");

        // Start loop from 1 to ignore 1st Vertex
        for (int i = 1; i < graph.verticesNO; i++) {
            System.out.println("\n" + path[i] + " route length: " + distance[i]); // Print path and final cost
            
        } 
    } 

}

