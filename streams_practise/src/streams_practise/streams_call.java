package streams_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class streams_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello World1");

		Integer[] a1 = {4,7,2,8};
		Integer[] a2 = {6,7,1,5,2};
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		List<Integer> sortedArr = new ArrayList<Integer>();
		System.out.println(a1.length);
		for (int i=0; i<a1.length; i++)
		{
			arr1.add(a1[i]);
		}
		for (int j=0; j<a2.length; j++)
		{
			arr2.add(a2[j]);
		}

		arr1.addAll(arr2);
		
		System.out.println(arr1);
		
		//int v1[] = (int[])arr1;
		
		sortedArr = arr1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedArr);
		System.out.println(sortedArr.get(sortedArr.size()/2));
		
		/*
		 * ListIterator li = sortedArr.listIterator(); int k=sortedArr.size()/2;
		 */
		
			
		// arr1.stream().sorted().forEach(System.out::print);
		//Arrays.stream(arr2)

	}

}
