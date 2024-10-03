package dsa;

import java.util.ArrayList;

//types of cycle detection  undirected Graph 1.DFS 2.BSF 3. DSU (Disjoint set Union)
//						    Directed Graph  1.DFS 2.BFS 3.TepologicalSorting(kans algo),graph coloring

// Undirected Graph

public class Cycle_in_Graphs {
	
			public static void create(ArrayList<ArrayList<Edge1>> Graph) {
				
				ArrayList<Edge1> a=new ArrayList<>();
				ArrayList<Edge1> b=new ArrayList<>();
				ArrayList<Edge1> c=new ArrayList<>();
				ArrayList<Edge1> d=new ArrayList<>();
				ArrayList<Edge1> e=new ArrayList<>();
				ArrayList<Edge1> f=new ArrayList<>();
				
				
				
				a.add(new Edge1(0, 1)); 
				a.add(new Edge1(0, 4));
				
				b.add(new Edge1(1, 0));
				b.add(new Edge1(1, 2));
//				b.add(new Edge1(1, 4));
				
				c.add(new Edge1(2, 1));
				c.add(new Edge1(2, 3));
				
				d.add(new Edge1(3, 2));
				
				e.add(new Edge1(4, 0));
//				e.add(new Edge1(4, 1));
				e.add(new Edge1(4, 5));
				
			   f.add(new Edge1(5, 4));
				
				
				
				
				Graph.add(a);
				Graph.add(b);
				Graph.add(c);
				Graph.add(d);
				Graph.add(e);
				Graph.add(f);
				
			}
			
			public static boolean topSort(ArrayList<ArrayList<Edge1>> Graph,int current , boolean arr[],int parent ) {
				
				arr[current]=true;
				
				for (int i = 0; i < Graph.get(current).size(); i++) {
					int n = Graph.get(current).get(i).destination;
					System.out.println(current +" "+ n +" "+  parent);
					if(!arr[n]) {
						if(topSort(Graph, n, arr, current)) {
							
							return true;
						}
					}
					else if(arr[n] && n!=parent) {
//						System.out.println("llllllllllllllllllll" + n +  parent);
						return true;
					}
					
				}
				
				return false;
			}
			public static void main(String[] args) {
				ArrayList<ArrayList<Edge1>> Graph =new ArrayList<ArrayList<Edge1>>() ;
				create(Graph);
				
				boolean arr[]=new boolean[Graph.size()];
				
				
				boolean b=topSort(Graph, 0, arr,-1);
				
				System.out.println(b);
				 
				
//				for (int i = 0; i < arr.length; i++) {
//					
//					if(!arr[i]) {
//						if(topSort(Graph, i, arr,-1)) {
//							System.out.println(true);
//						}
//						
//					}
//				}
				
			}
			
	}
				
			

		



