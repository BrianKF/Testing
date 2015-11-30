package com.adtheorent.Testing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	    String s[] = "This is a test of the emergency".split(" "); //creates a string array splits the array with space as the delimiter
    	    String o="";//creates a string with no contents
    	    System.out.println(s.length);
   	        for(int i = s.length-1; i>= 0 ;i--){// str.length is the number of arrays created from the split  In order to print them out, we create a loop
    	            o += s[i]+" ";//This store each array to be printed in the next step
    	        }
   	     System.out.println(o);
    	    }
    }
    
