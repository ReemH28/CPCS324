/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */

package AirFreightApp;

import GraphFramework.Edge;
import GraphFramework.Vertex;

public class Route extends Edge {
   int ILength;

    public Route(Vertex source, Vertex target, int weight) {
        super( source, target,weight);
        this.ILength = weight * 5;
    }
    
    
    @Override
    public void displayInfo(){
        System.out.println("Route Length: " + ILength);
    }
}