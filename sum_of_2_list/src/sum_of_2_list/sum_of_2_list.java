package sum_of_2_list;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class sum_of_2_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(4,0,9);
		List<Integer> list2 = Arrays.asList(5,2,1);
		
		ListIterator l1 = list1.listIterator();
		ListIterator l2 = list2.listIterator();
		
		StringBuilder temp1=new StringBuilder();
		StringBuilder temp2=new StringBuilder();
		
				
		for (int i = list1.size()-1; i >= 0; i--)
		{
			temp1.append(list1.get(i));
		}
		for (int i = list2.size()-1; i >= 0; i--)
		{
			temp2.append(list2.get(i));
		}
		System.out.println("list1: " + temp1 + " list2: " + temp2);
		System.out.println(Integer.parseInt(temp1.toString()) + Integer.valueOf(temp2.toString()));
	}

}
