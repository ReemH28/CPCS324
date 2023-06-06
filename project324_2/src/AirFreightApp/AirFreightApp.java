/*
 * Reem, Hanady, Sara, Aisha
 * CPCS-324
 * Project Code
 * 4 June. 2023
 */
package AirFreightApp;

import GraphFramework.DBAllSourceSPAlg;
import GraphFramework.Graph;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AirFreightApp {
static AFRouteMap map;
    public static void main(String[] args) throws FileNotFoundException {
        try (
                 Scanner input = new Scanner(System.in)) {

            int verticesNO = 0; // number of vertices
            int edgesNO = 0; // number of edges

            // ======================Header========================//
            System.out.println("\t\t--------------------------------------------------------------------\n"
                    + "\t\t|Dijkstra algorithm for the single-source shortest path|\n"
                    + "\t\t-------------------------------------------------------------------\n");

            System.out.println("\t\t*** Requirement 1 Using Read_from_Graph Func. *** \n"
                    + "\t\t*** Requirement 2 Using Make_Graph Func.     *** \n");

            System.out.print("Select Requirement Option --> ");

            int userInput = input.nextInt(); // Option of the Requirement
            //check the option
            while (userInput != 1 && userInput != 2) {
                System.out.println("Wrong Selection. ");
                System.out.print("Select Requirement Option -> ");
                userInput = input.nextInt();
            }

            // ------------------------ Requirement 1 ------------------------ //
            if (userInput == 1) {
                System.out.println("\n\n\t\t\t-Requirement 1 Using Read From Graph function-");

                File graphFile = new File("graphFile.txt"); // Read from File
               // Graph map = new Graph(); 
                map = new AFRouteMap();
                map.readGraphFromFile(graphFile); // Access readGraphFromFile Method in Graph Class

            } // End of Requirement 1

            // --------------------- Requirement 2 ------------------ //
            if (userInput == 2) {
                System.out.println("\t\t\t-Requirement 2 Using Make Graph function-");

                System.out.println("\n 1-  n=2000 , m=10000");
                System.out.println(" 2-  n=3000 , m=15000");
                System.out.println(" 3-  n=4000 , m=20000");
                System.out.println(" 4-  n=5000 , m=25000");
                System.out.println(" 5-  n=6000 , m=30000");

                // ------- Read User Input for the Selected Case -------- //

                System.out.print("\nSelect your Test Option -> ");
                userInput = input.nextInt(); // Option of the Case

                while (userInput > 5 || userInput < 1) {
                    System.out.println("Option not found.");
                    System.out.print("Select your Test Option -> ");
                    userInput = input.nextInt();
                } // End of while

                switch (userInput) {
                    case 1: {
                        verticesNO = 2000;
                        edgesNO = 10000;
                    };
                    break;

                    case 2: {
                        verticesNO = 3000;
                        edgesNO = 15000;
                    };
                    break;
                    case 3: {
                        verticesNO = 4000;
                        edgesNO = 20000;
                    };
                    break;
                    case 4: {
                        verticesNO = 5000;
                        edgesNO = 25000;
                    };
                    break;
                    case 5: {
                        verticesNO = 6000;
                        edgesNO = 30000;
                    }
                    break;
                }

                map = new AFRouteMap(verticesNO, edgesNO, false); // Create An Object of Graph 
                map.makeGraph(verticesNO, edgesNO); // Access readGraphFromFile Method in Graph Class
                
                //System.out.println("Run time for Dijkstra algorithm " + (finishTime - startTime) + " ms \n");

            }
        //AFRouteMap map = new AFRouteMap(verticesNO, edgesNO, false);// End of if 2
        DBAllSourceSPAlg dijkstra = new DBAllSourceSPAlg(map);
        long start = System.currentTimeMillis();
        dijkstra.computeDijkstraBasedSPAlg();
        long end = System.currentTimeMillis();
        long totalTime = end-start;
        System.out.println("*** Total running time: " + totalTime + " msec ~" + totalTime/1000.0 +" sec ***");
  
        } // number of vertices

    } // End of Main

}


