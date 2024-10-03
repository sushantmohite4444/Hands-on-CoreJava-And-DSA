package dsa;


//Adjacency list = list of list {{},{},{}} 

import java.util.ArrayList;

// Network of Nodes is called graphs.   node is called as vertex or vertices .  connection btn two vertex is called edge.

// Edge Uni-directional(one way) (x)----->(y) Bi-directional/Unidirectional (x)--------->(y) or (x)---------(y) 
                                                  //                           <---------

// Name of graphs 1) --------> direction graph 2) ------------- undirected graph (or) undirected &Un-Weighed graph   3) Weighted graph      10        
                                                       //                                                                              ---------->
//   Storing a graph 
//  1.Adjacency list           list of list
//  2.Adjacency Matrix         2d matrix if {j,i} Edge contain then= 1 or weight , else =0
//  3.Edge List                save Edge in one direction only  {{0,2},{1,2},{1,3},{2,3}} Edge= size of Edge List  (USE FOR SORTIONG)
//  4.Matrix(Implicit Graph)




class Edge{
	int source;
	int destination;
	int weight;
	public Edge(int source,int destination,int weight) {
		this.source= source;
		this.destination=destination;
		this.weight=weight;
	}
}


public class Graphs {
	
	public static void  create(ArrayList<ArrayList<Edge>> Graph) {
		
		
		ArrayList<Edge> a =new ArrayList<>();
		a.add(new Edge(0,2,2));
		
		ArrayList<Edge> b =new ArrayList<>();
		b.add(new Edge(1, 2,10));
		b.add(new Edge(1, 3,0));
		
		ArrayList<Edge> c =new ArrayList<>();
		c.add(new Edge(2, 0,2));
		c.add(new Edge(2, 1,10));
		c.add(new Edge(2, 3,-1));
		
		ArrayList<Edge> d =new ArrayList<>();
		d.add(new Edge(3, 1,0));
		d.add(new Edge(3, 2,-1));
		
		
		Graph.add(a);
		Graph.add(b);
		Graph.add(c);
		Graph.add(d);
		
		
	}
	
	
	public static void main(String[] args) {
		int n=4;
		ArrayList<ArrayList<Edge>> Graph = new ArrayList<ArrayList<Edge>>(n);
		create(Graph);
		for(int i=0;i<Graph.size();i++) {
			System.out.println("Neighbours of " + i + "is ");
			for (int j = 0; j <Graph.get(i).size(); j++) {
				System.out.println(Graph.get(i).get(j).destination);
//				System.out.println(" " + Graph.get(i).get(j).weight);
			}
		}
	}

}
