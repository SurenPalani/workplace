package strrev;

import java.util.Arrays;
import java.util.Comparator;

public class str_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = "This is a test".split(" ");
		String output = "";
		for (int i=a.length-1; i >=0; i--)
		{
			output += a[i] + " ";
		}
		System.out.println(output);
		
		/*** Sort by length ***/
		Arrays.sort(a, new Comparator<String>() {
			 
		      @Override
		      public int compare(final String s1, final String s2) {
		        return s1.length() < s2.length() ? -1 : 1;
		      }
		});
		      for (int i = 0; i < a.length; i++)
		          System.out.print(a[i] + " ");
	}
	

}
