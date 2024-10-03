package dsa;

import java.util.ArrayList;
import java.util.Stack;

// Directed Acyclic Graph (DAG) is a directed graph with no cycles.
//                                     -----------------------------

//Topological sorting is used for DAG only

// Use for show  Dependency like  ---> laptop--os ---1.code editor-- 2. install java
                                     // 1 + 2------ write code 


public class Topological_Sorting {
	
	


		public static void create(ArrayList<ArrayList<Edge1>> Graph) {
			
			ArrayList<Edge1> a=new ArrayList<>();
			ArrayList<Edge1> b=new ArrayList<>();
			ArrayList<Edge1> c=new ArrayList<>();
			ArrayList<Edge1> d=new ArrayList<>();
			ArrayList<Edge1> e=new ArrayList<>();
			ArrayList<Edge1> f=new ArrayList<>();
			ArrayList<Edge1> g=new ArrayList<>();
			
			
			
			c.add(new Edge1(2, 3));
			d.add(new Edge1(3, 1));
			e.add(new Edge1(4, 0));
			f.add(new Edge1(4, 1));
			g.add(new Edge1(5, 0));
			g.add(new Edge1(5, 1));
			
			
			Graph.add(a);
			Graph.add(b);
			Graph.add(c);
			Graph.add(d);
			Graph.add(f);
			Graph.add(g);
		}
		
		public static void topSort(ArrayList<ArrayList<Edge1>> Graph,int current , boolean arr[] ,Stack  stack) {
			
			arr[current]=true;
			
			for (int i = 0; i < Graph.get(current).size(); i++) {
				int n = Graph.get(current).get(i).destination;
				if(!arr[n]) {
					topSort(Graph, n, arr, stack);
				}
			}
			stack.push(current);
			
		}
		public static void main(String[] args) {
			ArrayList<ArrayList<Edge1>> Graph =new ArrayList<ArrayList<Edge1>>() ;
			create(Graph);
			
			boolean arr[]=new boolean[Graph.size()];
			Stack stack=new Stack<Integer>();
			
			for (int i = 0; i < arr.length; i++) {
				
				if(arr[i]==false) {
					topSort(Graph, i, arr, stack);
					
				}
			}
			
			
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
		}
		
}
			
		

	
