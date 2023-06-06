/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */
package GraphFramework;
public class Edge implements Comparable<Edge> {
  
    int weight;
    public Vertex source;
    public Vertex target;
    public Vertex parent;


    public Edge() {
        source = new Vertex(); 
        target = new Vertex();
        parent = new Vertex();
    }
    
    public Edge(Vertex source, Vertex target, int weight) {
        
        this.weight = weight;
        this.source = source;
        this.target = target;
    }
    
       /* @Override
        public int compareTo(Edge o) {
            if(this.weight > o.weight)
                return 1;
            else if (this.weight == o.weight)
                return 0;
            else return -1;

        }*/

	public void displayInfo() {
		 System.out.print(weight);
	}

    @Override
    public int compareTo(Edge o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
} 

