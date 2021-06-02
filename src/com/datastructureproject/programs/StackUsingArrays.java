/**
 * 
 */
package com.datastructureproject.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mahaveer singh ratnoo
 *
 */
public class StackUsingArrays {

	/**
	 * {@summary} Implementing stack using Arrays
	 * @throws IOException 
	 */
	
	
	int[] arrayStack = new int[10];
	int currentIndex=-1;
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println(br.readLine());
		 * 
		 * Scanner in = new Scanner(System.in);
		 * 
		 * String s = in.nextLine();
		 

		if(args.length>0) {
			for(String str:args) {
				System.out.println(str);
			}
		}*/
		
		
		StackUsingArrays sa = new StackUsingArrays();
		sa.push(5);
		sa.push(8);
		sa.push(22);
		
		System.out.println(Arrays.toString(sa.arrayStack));
		
		System.out.println("peek is : "+sa.peek());
		
		sa.pull();
		
		System.out.println(Arrays.toString(sa.arrayStack));
		
		
	}
	
	public boolean pull() {		
		if(currentIndex>=0) {
			arrayStack[currentIndex]=0;
			currentIndex = currentIndex-1;
			return true;
		}else
			return false;
	}
	
	public void push(int a) {
		arrayStack[currentIndex+1]=a;
		currentIndex = currentIndex+1;
	}
	
	public int peek() {
		if(currentIndex>=0)
			return arrayStack[currentIndex];
		else
			return -1;
	}

}
