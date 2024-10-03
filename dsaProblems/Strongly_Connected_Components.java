package dsaProblems;

import java.util.ArrayList;
import java.util.Stack;

public class Strongly_Connected_Components {
	
	public static void create(ArrayList<ArrayList<Edge1>> Graph) {
		
		ArrayList<Edge1> a=  new ArrayList<>();
		ArrayList<Edge1> b= new ArrayList<>();
		ArrayList<Edge1> c=  new ArrayList<>();
		ArrayList<Edge1> d= new ArrayList<>();
		ArrayList<Edge1> e=  new ArrayList<>();
		
		a.add(new Edge1(0, 2));
		a.add(new Edge1(0, 3));
		b.add(new Edge1(1, 0));
		c.add(new Edge1(2, 1));
		d.add(new Edge1(3, 4));
		
		Graph.add(a);
		Graph.add(b);
		Graph.add(c);
		Graph.add(d);
		Graph.add(e);
		
	
		
	}
	
	public static void topologicalOrder(ArrayList<ArrayList<Edge1>> Graph,boolean arr[],Stack st,int source) {
		 
		arr[source]=true;
		
		for (int i = 0; i < Graph.get(source).size(); i++) {
			int n=Graph.get(source).get(i).destination;
			
			if(!arr[n]) {
				topologicalOrder(Graph, arr, st, n);
			}
		}
		st.add(source);
		
		
	}
	
	public static void transpose(ArrayList<ArrayList<Edge1>> Transpose,ArrayList<ArrayList<Edge1>> Graph) {
		
		for (int i = 0; i < Graph.size(); i++) {
			ArrayList<Edge1> el=new ArrayList<Edge1>();
			for (int j = 0; j < Graph.get(i).size(); j++) {
				
				Edge1 e=Graph.get(i).get(j);
				
				int s=e.source;
				int d=e.destination;
		
				el.add(new Edge1(d,s));
				
				Transpose.set(d, el);
			}
			
			
		}
	}
	
	public static void DFS(ArrayList<ArrayList<Edge1>> Transpose, int source, boolean arr1[]) {
		
		arr1[source]=true;
		
		for (int i = 0; i < Transpose.get(source).size(); i++) {
			 Edge1 e=Transpose.get(source).get(i);
			 System.out.println(e.source + " "+e.destination);
			if(arr1[e.destination]==false) {
				DFS(Transpose, e.destination,arr1);
			}
		}
		
	}

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Edge1>> Graph =new ArrayList<ArrayList<Edge1>>();
		
		create(Graph);
		
		Stack<Integer> st =new Stack<>();
		boolean arr[]=new boolean[Graph.size()];
		
		topologicalOrder(Graph, arr, st, 0);
		
		
		
		
		ArrayList<ArrayList<Edge1>> Transpose =new ArrayList<ArrayList<Edge1>>();
		
		
		
		transpose(Transpose, Graph);
		
		
		boolean arr1[]=new boolean[Transpose.size()];
		
		for (int i = 0; i < arr1.length; i++) {
			arr[i]=false;
		}
		
		
		
		while(!st.isEmpty()) {
			int n=st.pop();
//			System.out.println(n + "from stack");
			
			if(!arr1[n]) {
			DFS(Transpose, n,arr1);
			}
		}
		
		
		
			
		
		
	}

}
