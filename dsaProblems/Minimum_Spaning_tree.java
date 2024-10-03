package dsaProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

//Prim's Algorithm

class sv implements Comparable<sv>{
	int source;
	int value ;
	
	public sv(int source , int value) {
		this.source=source;
		this.value=value;
		
	}

	@Override
	public int compareTo(sv o) {
		return this.value -o.value;
	}
}




public class Minimum_Spaning_tree {

	public static void  creategraph(ArrayList<ArrayList<Edge3>> Graph) {
		
		
		ArrayList<Edge3> a =new ArrayList<>();
		ArrayList<Edge3> b =new ArrayList<>();
		ArrayList<Edge3> c =new ArrayList<>();
		ArrayList<Edge3> d =new ArrayList<>();
		
		
		
		a.add(new Edge3(0, 1,10));
		a.add(new Edge3(0, 2,15));
		a.add(new Edge3(0, 3,30));
	
		b.add(new Edge3(1, 0,10));
		b.add(new Edge3(1, 3,40));
		
		c.add(new Edge3(2, 0,15));
	    c.add(new Edge3(2, 3,50));
	    
	    d.add(new Edge3(3, 0,30));
		d.add(new Edge3(3, 1,40));
		d.add(new Edge3(3, 2,50));
		
		Graph.add(a);
		Graph.add(b);
		Graph.add(c);
		Graph.add(d);
		
	}
	
	public static void MST(ArrayList<ArrayList<Edge3>>Graph) {
		
		boolean arr[]=new boolean [Graph.size()];
		
		PriorityQueue<sv> pq =new PriorityQueue<>();
		pq.add(new sv(0, 0));
		
		
		 int finalval=0; 
		 
		while(!pq.isEmpty()) {
		sv s=pq.remove();
		if(!arr[s.source]) {
			arr[s.source]=true;
			
			finalval+= s.value;
		
			for (int i = 0; i < Graph.get(s.source).size(); i++) {
				
				Edge3 e=Graph.get(s.source).get(i);
				System.out.println(s.source + " "+s.value);
				
				pq.add(new sv(e.Destinetion,e.value));
			}
		}
			
		}
		
		System.out.println(finalval);
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Edge3>> Graph =new ArrayList<ArrayList<Edge3>>();
		
		creategraph(Graph);
		
		MST(Graph);
		
	}
	
	
}
