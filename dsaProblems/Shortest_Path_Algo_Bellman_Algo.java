package dsaProblems;

import java.util.ArrayList;
import java.util.PriorityQueue;

// Bellman Algorithm use for -ve values not for  -ve cycle

	class Edge3{
		int source;
		int Destinetion;
		int value;
		Edge3(int source,int Destinetion,int value)
		{
			this.source=source;
			this.Destinetion=Destinetion;
			this.value=value;
		}
		
	}

	class nodesum11 implements Comparable<nodesum11>{
		int node;
		int sum;
		public nodesum11(int node ,int sum) {
			this.node=node;
			this.sum=sum;
		}
		@Override
		public int compareTo(nodesum11 o) {
			
			return this.sum - o.sum;
		}
	}



	public class Shortest_Path_Algo_Bellman_Algo {		
		public static void  creategraph(ArrayList<ArrayList<Edge3>> Graph) {
			
			
			ArrayList<Edge3> a =new ArrayList<>();
			ArrayList<Edge3> b =new ArrayList<>();
			ArrayList<Edge3> c =new ArrayList<>();
			ArrayList<Edge3> d =new ArrayList<>();
			ArrayList<Edge3> f =new ArrayList<>();
			
			a.add(new Edge3(0, 1,2));
			a.add(new Edge3(0, 2,4));
			b.add(new Edge3(1, 2,-4));
			c.add(new Edge3(2, 3,2));
		    d.add(new Edge3(3, 4,4));
			f.add(new Edge3(4, 1,-10));
			
			
			Graph.add(a);
			Graph.add(b);
			Graph.add(c);
			Graph.add(d);
			Graph.add(f);
		}
		
		
		
		public static void shortest(ArrayList<ArrayList<Edge3>> Graph , int values[]) {
			
			 
			for (int i = 0; i < values.length; i++) {
				if(i!=0)
					values[i]=Integer.MAX_VALUE;
			}
			
			
			for (int i = 0; i < values.length; i++) {
				for (int j = 0; j < values.length; j++) {
					for (int k = 0; k < Graph.get(j).size(); k++) {
						
						Edge3 e = Graph.get(j).get(k);
						
						int s=e.source;
						int d=e.Destinetion;
						
						if(values[s]+e.value < values[d] && values[s]!=Integer.MAX_VALUE) {
							values[d]=values[s]+e.value;
						}
						
						
						
					}
					
				}
				
			}
			
			for (int i = 0; i < values.length; i++) {
				System.out.println(values[i]);
			}
			
			
			
				for (int j = 0; j < values.length; j++) {
					for (int k = 0; k < Graph.get(j).size(); k++) {
						
						Edge3 e = Graph.get(j).get(k);
						
						int s=e.source;
						int d=e.Destinetion;
						
						if(values[s]+e.value < values[d] && values[s]!=Integer.MAX_VALUE) {
							System.out.println("Negative cycle");
						}
						
						
						
					}
					
				}
				
			}
			
		
		
		
		public static void main(String[] args) {
			
			
			ArrayList<ArrayList<Edge3>> Graph = new ArrayList<ArrayList<Edge3>>();
		
			creategraph(Graph);
			
			
			
			shortest(Graph, new int[Graph.size()]);
		}
		

	}


