package letter_comb_ph_no;

import java.util.HashMap;
import java.util.Map;

public class letter_comb_ph_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, null); hm.put(2, "abc"); hm.put(3, "def"); 
		hm.put(4, "ghi"); hm.put(5, "jkl"); hm.put(6, "mno");
		hm.put(7, "pqrs"); hm.put(8, "tuv"); hm.put(9, "wxyz");
		
		String s = "23";
		char i[]= s.toCharArray();
		String val = null;
		char a[][];
		
		for (int j=0; j < s.length(); j++)
		{
			int k = Integer.parseInt(String.valueOf(i[j]));
			Integer K = k;
			val=hm.get(K);
			System.out.println(val);
			a[j][]=val.toCharArray();
			
		}
	}

}
