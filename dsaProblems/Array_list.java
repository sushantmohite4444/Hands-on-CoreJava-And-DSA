package arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Array_list {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(4);
		
		if(al.get(2) > al.get(1));
		al.add(3);
		ArrayList<Integer> l =new ArrayList<>();
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 4));
		Collections.reverse(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

		String s="avabbaccv";
	}  
		
}
