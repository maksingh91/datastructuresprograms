/**
 * 
 */
package com.datastructureproject.programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ars
 *
 */
public class StackUsingLinkedList {

	/**
	 * @param args
	 */
	
	List<Integer> arrayLst = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		StackUsingArrays sa = new StackUsingArrays();
		sa.push(5);
		sa.push(8);
		sa.push(22);
		sa.push(90);
		System.out.println(Arrays.toString(sa.arrayStack));
		
		System.out.println("peek is : "+sa.peek());
		
		sa.pull();
		
		System.out.println(Arrays.toString(sa.arrayStack));

	}
	public boolean pull() {		
		if(arrayLst.size()>0) {
			arrayLst.remove(arrayLst.size());
			return true;
		}else
			return false;
	}
	
	public void push(int a) {
		arrayLst.add(a);
	}
	
	public int peek() {
		if(arrayLst.size()>0)
			return arrayLst.get(arrayLst.size());
		else
			return -1;
	}

}
