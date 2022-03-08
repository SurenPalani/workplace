package longest_substring;

public class longest_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcalsdseebn";
		int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
            System.out.println("r is: " + r + " chars[" + r + "] is: " + chars[r]);

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
                System.out.println("chars["+l +"] is: " + chars[l] + " chars[" +r + "] is: " + chars[r]);
            }
            
            System.out.println("res: " + res + " right: " + right + " left: " + left);

            res = Math.max(res, right - left + 1);

            right++;
        }
        
        System.out.println(res);
	}

}
