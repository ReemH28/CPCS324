/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */
package AirFreightApp;


import GraphFramework.Vertex;

public class Location extends Vertex{
  private String city;
    
    public Location (int label){
        super(label);
        this.label = label; 
    }
    
    public void SetLabel(){
         
    }
    
    @Override
    public void displayInfo(){
        
        System.out.println("loc. " + label);
        
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}