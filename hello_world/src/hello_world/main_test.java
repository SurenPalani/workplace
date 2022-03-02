package hello_world;

import java.util.Arrays;
import java.util.List;

public class main_test {

	public static void main() {
		// TODO Auto-generated method stub
System.out.println("Hello World");

	List<Integer> arr1 = Arrays.asList(4,7,2,8);
	List<Integer> arr2 = Arrays.asList(6,7,1,5);
	arr1.addAll(arr2);
	System.out.println(arr1);
	
		// TODO Auto-generated method stub
		
		String[] a = "This is a test".split(" ");
		String output = " ";
		for (int i=a.length-1; i >=0; i--)
		{
			output = a[i] + output +" ";
		}
		System.out.println(a);


	}

}
