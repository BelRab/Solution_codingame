package fr.solinum.test;

import java.util.Scanner;

	import java.util.*;
	import java.io.*;
	import java.math.*;

	/**
	 * Auto-generated code below aims at helping you parse
	 * the standard input according to the problem statement.
	 **/
	class Solution {

	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt(); // the number of temperatures to analyse
	        int plusProche=0;//va retourner 0 si n=0
	        if(n>0) {
	        	int[] result=new int[n];
		        for (int i = 0; i < n; i++) {
		            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
		            result[i]=t;//on va les mettres dans un tableau dabord
		        }
		        plusProche=result[0];
		        for(int i=1;i<n;i++) {
		        	if(plusProche>0) {
		        		if(result[i]<0) {
			        		if(Math.abs(result[i])<plusProche) {
			        			plusProche=Math.abs(result[i]);// je crois je doit ajouter Math.abs
			        		}
			        	}else {
			        		if(result[i]<plusProche) {
			        			plusProche=result[i];
			        		}
			        	}	
		        	}else {
		        		if(result[i]<0) {
		        			if(result[i]>plusProche) {
		        				plusProche=result[i];
		        			}
		        		}else {//result[i]>=0
		        			if(Math.abs(plusProche)>=result[i]) {
		        				plusProche=result[i];
		        			}
		        		}
		        	}
		        }	
	        }
	        
	        System.out.println(plusProche);
	        		
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        System.out.println("result");
	    }
}
