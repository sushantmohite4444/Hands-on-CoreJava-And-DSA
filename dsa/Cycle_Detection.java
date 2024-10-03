package dsa;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Cycle_Detection {
	public static void create(ArrayList<ArrayList<Edge1>> Graph) {
		
		ArrayList<Edge1> a=new ArrayList<>();
		ArrayList<Edge1> b=new ArrayList<>();
		ArrayList<Edge1> c=new ArrayList<>();
		ArrayList<Edge1> d=new ArrayList<>();
		
		a.add(new Edge1(0, 2));
		b.add(new Edge1(1, 0));
		c.add(new Edge1(2, 3));
//		d.add(new Edge1(3, 0));
		
		Graph.add(a);
		Graph.add(b);
		Graph.add(c);
		Graph.add(d);

	}
	
	public static boolean dfsfindcycle(ArrayList<ArrayList<Edge1>> Graph,int current , boolean arr[] ,boolean stack[]) {
		
		arr[current]=true;
		stack[current]=true;
		
		
		for (int i = 0; i < Graph.get(current).size(); i++) {
			
			int n=Graph.get(current).get(i).destination;
			if(stack[n]==true) {
				return true;
			}
			else if(!arr[n]) {
				if(dfsfindcycle(Graph, n, arr, stack)) return true;
			}
		}
		stack[current]=false;
		return false;

	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Edge1>> Graph =new ArrayList<ArrayList<Edge1>>() ;
		create(Graph);
		
		boolean arr[]=new boolean[Graph.size()];
		boolean stack[]=new boolean[Graph.size()];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==false) {
				if(dfsfindcycle(Graph, i, arr, stack))
				   System.out.println(true);
				break;
			}
		}
		
		
	}

}
