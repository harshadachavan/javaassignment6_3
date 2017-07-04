package binarysearch;

public class BinarySearch {
	
	public static void main(String args[]) {
		//declare and initialize
	    int first, last, middle, n, search;
	    
		int a[]=new int[5];
		
		System.out.println("Array Values");
		for(int i=0;i<a.length;i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		n = a.length; //Set value of n to the length of array
		
		search = 4; // define the value we can't to search
		
		first  = 0; 
	    last   = n - 1;
	    middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( a[middle] < search )
	        first = middle + 1;    
	      else if ( a[middle] == search ) 
	      {
	    	// If the element is present at the middle itself
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
		   // We reach here when element is not present in array
	      System.out.println(search + " is not present in the list.\n");
	  }
		
	}

