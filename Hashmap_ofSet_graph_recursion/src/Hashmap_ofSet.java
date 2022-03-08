import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class Hashmap_ofSet {
	/** Samp graph code ***/

	public static void main(String[] args) {
		Map<String, HashSet<String>> hm = new HashMap<String, HashSet<String>>();
		HashSet<String> hs = new HashSet<String>();

		/**Just Create samp data **/
		
		  hm.put("palani", new HashSet<String>()); hm.get("palani").add("naren");
		  hm.get("palani").add("suren");
		  
		  hm.put("shanthi", new HashSet<String>()); hm.get("shanthi").add("naren");
		  hm.get("shanthi").add("suren");
		  
		  hm.put("naren", new HashSet<String>()); hm.get("naren").add("vaishu");
		  hm.get("naren").add("sahana");
		  
		  hm.put("deepika", new HashSet<String>()); hm.get("deepika").add("vaishu");
		  hm.get("deepika").add("sahana");
		  
		  hm.put("suren", new HashSet<String>()); hm.get("suren").add("tejaz");
		  hm.get("suren").add("kenisha");
		  
		  hm.put("sujitha", new HashSet<String>()); hm.get("sujitha").add("tejaz");
		  hm.get("sujitha").add("kenisha");
		  
		  hm.put("prabakaran", new HashSet<String>());
		  hm.get("prabakaran").add("sujitha"); hm.get("prabakaran").add("kavitha");
		  
		  hm.put("jamuna", new HashSet<String>());
		  hm.get("jamuna").add("sujitha"); hm.get("prabakaran").add("kavitha");
		  
		  hm.put("kavitha", new HashSet<String>()); hm.get("kavitha").add("yojith");
		  
		  hm.put("dinakaran", new HashSet<String>()); hm.get("dinakaran").add("yojith");
		 
		  hm.put("seshadri", new HashSet<String>()); hm.get("seshadri").add("palani");
		  hm.get("seshadri").add("kupurani"); hm.get("seshadri").add("baby");
		  hm.get("seshadri").add("sudha"); hm.get("seshadri").add("badri");
		  hm.get("seshadri").add("nirmala"); hm.get("seshadri").add("babu");
		  
		  hm.put("sumathi", new HashSet<String>()); hm.get("sumathi").add("palani");
		  hm.get("sumathi").add("kupurani"); hm.get("sumathi").add("baby");
		  hm.get("sumathi").add("sudha"); hm.get("sumathi").add("badri");
		  hm.get("sumathi").add("nirmala"); hm.get("sumathi").add("babu");

		  hm.put("krishnamoorthi", new HashSet<String>()); hm.get("krishnamoorthi").add("prabakaran");
		  hm.get("krishnamoorthi").add("dhinakaran"); hm.get("krishnamoorthi").add("ramesh");
		  
		  hm.put("jyothi", new HashSet<String>()); hm.get("jyothi").add("prabakaran");
		  hm.get("jyothi").add("dhinakaran"); hm.get("jyothi").add("ramesh");
		// System.out.println(hm);

		for (Entry<String, HashSet<String>> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		String input = "jyothi";

		// hs1 = hm.get(input);

		LinkedHashSet<String> hs2 = new LinkedHashSet<String>();
		recursive(input, hm, hs2);

		System.out.println(hs2);
		/*
		 * StringBuilder sb = new StringBuilder(); System.out.println(hs2.size()); int
		 * temp = hs2.size(); for (int i = 0; i < temp; i++) { sb.append(hs2..get()); if
		 * (i < temp - 1) sb.append(", "); } System.out.println(sb);
		 */
		

	}

	public static void recursive(String in, Map<String, HashSet<String>> hmap, LinkedHashSet<String> finhset) {

		HashSet<String> hs1;

		finhset.add(in);

		hs1 = hmap.get(in);
		// System.out.println(hs1);
		if (hs1 != null) {
			Iterator<String> itr = hs1.iterator();

			while (itr.hasNext()) {
				String str = itr.next();
				recursive(str, hmap, finhset);
				// finhset.add(str);
			}
		}

		// System.out.println(finStr);

		// System.out.println(hm);
	}

}
