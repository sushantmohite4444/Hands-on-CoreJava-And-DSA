package dsa;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;
import javax.swing.text.StyledEditorKit.BoldAction;

//  go to immediate neighborS first    ( Print neighborS first)
class Edge1{
	int source;
	int destination;
	Edge1(int source,int destination){
		this.source=source;
		this.destination=destination;
	}
}
public class Breadth_First_SearchBSF {
	public static void create(ArrayList<Edge1>  Graphs[]) {
		
		for(int i=0;i<Graphs.length;i++) {
			Graphs[i]=new ArrayList<>();
		}
		
		Graphs[0].add(new Edge1(0,1));
		Graphs[0].add(new Edge1(0,2));
		
		Graphs[1].add(new Edge1(1,0));
		Graphs[1].add(new Edge1(1,3));
		
		Graphs[2].add(new Edge1(2,0));
		Graphs[2].add(new Edge1(2,4));
		
		Graphs[3].add(new Edge1(3,1));
		Graphs[3].add(new Edge1(3,4));
		Graphs[3].add(new Edge1(3,5));
		
		Graphs[4].add(new Edge1(4,2));
		Graphs[4].add(new Edge1(4,3));
		Graphs[4].add(new Edge1(4,5));
		
		Graphs[5].add(new Edge1(5,3));
		Graphs[5].add(new Edge1(5,4));
		Graphs[5].add(new Edge1(5,6));
			
	}
	public static  void printBFS(ArrayList<Edge1> Graph[],int start ,boolean arr[]){
		Queue<Integer> Q =new LinkedList<>();
		Q.add(start);
		while(!Q.isEmpty()) {
			//remove() function in Java returns the element available at the front of the queue and removes that element from the queue.
			int o= Q.remove();
			if(arr[o]==false) {
				arr[o]=true;
				System.out.println(o + " ");
				for(int i=0;i<Graph[o].size();i++) {
					Q.add(Graph[o].get(i).destination);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int n=7;

		ArrayList<Edge1> Graph[]= new ArrayList[n];

//		  1------3--
//		 /       |  \
//		0        |    5-------6 
//		\        |  /
//		 2-------4--
		
		create(Graph);
		
//		for(int i=0 ;i<Graph.length;i++) {
//			System.out.println("Neighbours of" + i + " is ");
//			for (int j = 0; j <Graph[i].size(); j++) {
//				
//				System.out.println(Graph[i].get(j).destination);
//
//			}
//		}
		
		boolean arr[]=new boolean[7];
		
	// for disconnected Component like 0-------1------2   , 3-----4-------5;
		for (int i = 0; i < Graph.length; i++) {
			
			if(arr[i]==false) {
				
				printBFS(Graph, i, arr);
			}
		}
	}
}
