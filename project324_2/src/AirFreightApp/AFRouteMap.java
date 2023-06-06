/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */
package AirFreightApp;

import GraphFramework.Edge;
import GraphFramework.Vertex;
import GraphFramework.Graph;
import AirFreightApp.Route;

public class AFRouteMap extends Graph {

    public AFRouteMap() {
        
    }
    
    public AFRouteMap(int verticesNo, int edgeNo, boolean isDigraph) {
        super(verticesNo, edgeNo, isDigraph);
    }
    
    // Create Vertex
    @Override
    public Vertex createVertex(int label) {
        return new Location(label);
    }

    // Create Edge
    @Override
    public Edge createEdge(Vertex source, Vertex target, int weight) {
        return new Route(source, target, weight);
    }

}
