package dsa;


// keep going to the 1st neighbor

// Dsf and Bsf having same time complexity O(V+E)   

import java.util.ArrayList;


public class Depth_First_SearchDFC {
	
	public static void  create(ArrayList<ArrayList<Edge1>> Graph) {
		
		
		ArrayList<Edge1> a =new ArrayList<>();
		
		ArrayList<Edge1> b =new ArrayList<>();
		
		ArrayList<Edge1> c =new ArrayList<>();
		
		ArrayList<Edge1> d =new ArrayList<>();
		
		ArrayList<Edge1> e =new ArrayList<>();
		
		ArrayList<Edge1> f =new ArrayList<>();
		
		ArrayList<Edge1> g  =new ArrayList<>();
		
		a.add(new Edge1(0,1));
		a.add(new Edge1(0,2));
		
		b.add(new Edge1(1,0));
		b.add(new Edge1(1,3));    // swap (1,3) and (1,0)   result is different
		
		c.add(new Edge1(2,0));
		c.add(new Edge1(2,4));
		
		d.add(new Edge1(3,1));
		d.add(new Edge1(3,4));
		d.add(new Edge1(3,5));
		
		e.add(new Edge1(4,2));
		e.add(new Edge1(4,3));
		e.add(new Edge1(4,5));
		
		f.add(new Edge1(5,3));
		f.add(new Edge1(5,4));
		f.add(new Edge1(5,6));
		
		
		g.add(new Edge1(6, 5));
		
		
		Graph.add(a);
		Graph.add(b);
		Graph.add(c);
		Graph.add(d);
		Graph.add(e);
		Graph.add(f);
		Graph.add(g);
		
		
	}
	
	public static void Depth_First_Search(ArrayList<ArrayList<Edge1>> Graph ,int node ,boolean arr[]) {
		
//		System.out.println(node );

		arr[node]=true;
		
		for (int i = 0; i < Graph.get(node).size(); i++) {
			
			int r=Graph.get(node).get(i).destination;
			System.out.println(node + " " +r);
			if(arr[r]==false) {
				System.out.println();
				Depth_First_Search(Graph,r, arr);
				
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Edge1>> Graph =new ArrayList<ArrayList<Edge1>>();
		
		create(Graph);
		boolean arr[] =new boolean[Graph.size()];
		Depth_First_Search(Graph, 0, arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
