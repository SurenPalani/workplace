package long_palindrome;

public class long_palindrome {

	public static void main(String[] args) {
		String s = "dfdmalayalamsdf";
		char c[] = s.toCharArray();
		int mid=0;
		int result=0;
		int loopCnt=0;
		if(s.length()>0)
			result=1;
		
		for (int k=0; k < s.length(); k++)
		{
			int i = k, j=k;
			//System.out.println("Value of k: " + k + " Mid value is: " + c[k]);
			loopCnt=0;
		  while(i > 0 && j < s.length()-1)
		  { 
			  i--;  j++;
			 // System.out.println("Value of c[" +i +"]: " + c[i] + ", Value of c[" + j + "]: " + c[j]);
			  
			  if (c[i] != c[j])
			  {
				  break;
			  }
			loopCnt++;
							
		  }
		  if(result < loopCnt) 
			  result = loopCnt;
		}
		if(result >1)
			result= result + result + 1;
		System.out.println(result);

	}

}
