import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class List_ofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<ArrayList<Integer> > arrLL = new ArrayList<ArrayList<Integer> >();
		// Integer[][] arr2= {{1,4,3}, {4,2}, {2,1,7}};
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
		
		int val = 10;
		//if((0+10)%2 == 0) (0+10)/2 +1;
		
		
		List<List<Integer>> arr2= Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		//List<List<Integer>> list = new ArrayList<List<Integer>>();
		//list.add(new ArrayList<Integer>());
		//list.get(0).add(1,4);
		/*
		 * list.get(1).add(1,3); list.get(2).add(2,6);
		 */
		Set<Integer> hs = arr2.stream().flatMap(n -> n.stream()).sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toSet());
		List<Integer> list = arr2.stream().flatMap(n -> n.stream()).sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		//List<Integer> list = arr2.stream().flatMap(n -> n.stream()).sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(hs);
		
		ArrayList<Integer> list2 = new ArrayList(list);
		Iterator<Integer> itr = list2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
