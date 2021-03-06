package string_words_samp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class string_words_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String samp = "kenishaandtejaz";
		List<String> list = Arrays.asList("suji", "suren", "kenisha", "tejaz", "and");
		/*
		 * list.add("suji"); list.add("suren"); list.add("kenisha"); list.add("tejaz");
		 * list.add("and");
		 */
		
		System.out.println(list);
		
		try {
			boolean exist = wordBreak(samp, list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("exist ?" + exist);
		
	}
	
	 public static boolean wordBreak(String s, List<String> wordDict) {
	        Set<String> wordDictSet = new HashSet<>(wordDict);
	        boolean[] dp = new boolean[s.length() + 1];
	        dp[0] = true;
	        for (int i = 1; i <= s.length(); i++) {
	            for (int j = 0; j < i; j++) {
	            	System.out.println("Value of i: " + i + " : Value of j: " + j + " : Value of substring: " + s.substring(j, i));
	                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
	                    dp[i] = true;
	                    break;
	                }
	            }
	        }
	        System.out.println("exist ? " + dp[s.length()]);
	        return dp[s.length()];
	    }

}
