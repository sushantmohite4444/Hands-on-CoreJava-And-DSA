package dsaProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

// Dijkstras Algorithm  BFS search

class Edge2{
	int source;
	int Destinetion;
	int value;
	Edge2(int source,int Destinetion,int value)
	{
		this.source=source;
		this.Destinetion=Destinetion;
		this.value=value;
	}
	
}

class nodesum implements Comparable<nodesum>{
	int node;
	int sum;
	public nodesum(int node ,int sum) {
		this.node=node;
		this.sum=sum;
	}
	@Override
	public int compareTo(nodesum o) {
		
		return this.sum - o.sum;
	}
}



public class Shortest_Path_algo {
	
	public static void  creategraph(ArrayList<ArrayList<Edge2>> Graph) {
		
		
		ArrayList<Edge2> a =new ArrayList<>();
		ArrayList<Edge2> b =new ArrayList<>();
		ArrayList<Edge2> c =new ArrayList<>();
		ArrayList<Edge2> d =new ArrayList<>();
		ArrayList<Edge2> e =new ArrayList<>();
		ArrayList<Edge2> f=new ArrayList<>();
		
		
		a.add(new Edge2(0, 1,2));
		a.add(new Edge2(0, 2,4));
		b.add(new Edge2(1, 2,1));
		b.add(new Edge2(1, 3,7));
		c.add(new Edge2(2, 4,3));
		d.add(new Edge2(3, 5,1));
		e.add(new Edge2(4, 3,2));
		e.add(new Edge2(4, 5,5));
		
		Graph.add(a);
		Graph.add(b);
		Graph.add(c);
		Graph.add(d);
		Graph.add(e);
		Graph.add(f);
	}
	
	
	
	public static void shortest(ArrayList<ArrayList<Edge2>> Graph ,boolean arr[] , int values[], PriorityQueue<nodesum> ns) {
		
		 
		for (int i = 0; i < values.length; i++) {
			if(i!=0)
				values[i]=Integer.MAX_VALUE;
		}
		
		while (!ns.isEmpty()) {
			nodesum n=ns.remove(); // smallest sum
			
			if(!arr[n.node]) {

				arr[n.node] =true;
				
		for (int i = 0; i <Graph.get(n.node).size() ; i++) {
			
			Edge2 e =Graph.get(n.node).get(i);
			
			int s = e.source;
			int d=  e.Destinetion;
			System.out.print(s +" "+ d);
			System.out.println();
			if(values[s] + e.value < values[d]) {
				values[d]=values[s]+e.value;
				
				ns.add(new nodesum(d,values[d]));
				
			}
		}
			}
	}
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<Edge2>> Graph = new ArrayList<ArrayList<Edge2>>();
	
		creategraph(Graph);
		
		PriorityQueue<nodesum> ns=new PriorityQueue<>();
		ns.add(new nodesum(0, 0));
		
		shortest(Graph, new boolean [Graph.size()], new int[Graph.size()], ns);
	}
	

}
