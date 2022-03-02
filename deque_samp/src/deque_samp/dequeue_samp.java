package deque_samp;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class dequeue_samp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int count=6;
		int temp;
		//new ArrayList<Integer>(ints.length);
		// Deque<Integer> deque = new LinkedList<Integer>(nums.length);
		List<Integer> list = Arrays.stream(nums)     // IntStream
                .boxed()        // Stream<Integer>
                .collect(Collectors.toList());
		System.out.println(list);
		ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(list);
		//PriorityQueue<Integer> de_que = new PriorityQueue<Integer>(list);
		
		System.out.println(de_que);
		
		for (int i=0; i<count; i++)
		{
			temp = de_que.pollLast();
			de_que.addFirst(temp);
			System.out.println(de_que);
		}
		//System.out.println(de_que);
		
		// Deque<Integer> deque = new List<Integer>;
		
		//deque.add(1);
		
	}

}
