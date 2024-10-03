package arrays;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	class Result {

	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */

	    public static int sockMerchant(int n, List<Integer> ar) {
	    	
	    	
	        int ok=0;
	        Iterator itr = ar.iterator();
	        int arr[] = new int[101];
	        while(itr.hasNext()) {
	        	
	        	
	        	int element =(Integer) itr.next();

	        	arr[element]++;
	        	
             	System.out.println(arr[1]);
             	
	        	if(arr[element] % 2 == 0) {
	        		ok++;
	        		
////	        		arr[(int)itr.next()]=0;
	        	}
	        	
	        	
	        }
			return ok;
	    
	        
	    }

	}

	public class Iteratot {
	    public static void main(String[] args) throws IOException {
	        
//	    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	        int n = Integer.parseInt(bufferedReader.readLine().trim());
	    	int n=7;
//
//	        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> ar = new ArrayList<>();
	        
	        ar.add(1);
	        ar.add(2);
	        ar.add(1);
	        ar.add(2);
	        ar.add(1);
	        ar.add(3);
	        ar.add(2);
	        
//	        for (int i = 0; i < n; i++) {
//	            int arItem = Integer.parseInt(arTemp[i]);
//	            ar.add(arItem);
//	        }

	        int result = Result.sockMerchant(n, ar);
	        System.out.println("   "+ result);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedReader.close();
//	        bufferedWriter.close();
	    }
	}

