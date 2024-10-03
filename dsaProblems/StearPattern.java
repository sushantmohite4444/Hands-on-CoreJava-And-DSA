package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StearPattern {
	public static void main(String[] args) {

		int n = 4;
		
		 for(int i=1;i<=n;i++){
             for(int j=i;j<n;j++){
                 System.out.print(" ");
             }
         for(int k=0;k<i;k++){
                  System.out.print("#");
         }
         System.out.println();
     }

	}
}
