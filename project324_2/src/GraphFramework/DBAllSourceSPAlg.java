 /*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */

package GraphFramework;
 
public class DBAllSourceSPAlg extends ShortestPathAlgorithm{
  
    public DBAllSourceSPAlg(Graph graph) {
        this.graph = graph;
    }

    public void computeDijkstraBasedSPAlg() {
        
        SingleSourceSPAlg dijkstra = new SingleSourceSPAlg(this.graph); 
        
        for (int i = 0; i < graph.verticesNO; i++) {
            dijkstra.computeDijkstraAlg(graph.vertices[i]);
        }
    }

}