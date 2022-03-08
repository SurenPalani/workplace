package critical_connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.util.Pair;

public class critical_connection {

	private Map<Integer, List<Integer>> graph;
	private Map<Integer, Integer> rank;
	private Map<Pair<Integer, Integer>, Boolean> connDict;

	public void start() {
		int n = 4;
		List<Integer> a = Arrays.asList(0, 1);
		List<Integer> b = Arrays.asList(1, 2);
		List<Integer> c = Arrays.asList(2, 0);
		List<Integer> d = Arrays.asList(1, 3);
		/*
		 * List<Integer> e = Arrays.asList(4, 3); List<Integer> f = Arrays.asList(4, 5);
		 * List<Integer> g = Arrays.asList(5, 3);
		 */

		List<List<Integer>> connections = Arrays.asList(a, b, c, d);
		
		System.out.println(connections);

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		 // List<List<Integer>> result = new ArrayList<List<Integer>>();
		  result = criticalConnections(n, connections);
		  System.out.println(result);
	}
	
	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        this.formGraph(n, connections);
        this.dfs(0, 0);
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (Pair<Integer, Integer> criticalConnection : this.connDict.keySet()) {
            result.add(new ArrayList<Integer>(Arrays.asList(criticalConnection.getKey(), criticalConnection.getValue())));
        }
        
        return result;
	}

	private int dfs(int node, int discoveryRank) {

		// That means this node is already visited. We simply return the rank.
		System.out.println("rank: " + this.rank);
		System.out.println("rank get node [" + node + "] : " + this.rank.get(node));
		if (this.rank.get(node) != null) {
			return this.rank.get(node);
		}
		System.out.println("Discovery Rank: " + discoveryRank);
		// Update the rank of this node.
		this.rank.put(node, discoveryRank);

		// This is the max we have seen till now. So we start with this instead of
		// INT_MAX or something.
		int minRank = discoveryRank + 1;

		for (Integer neighbor : this.graph.get(node)) {

			// Skip the parent.
			Integer neighRank = this.rank.get(neighbor);
			System.out.println("neighbor: " + neighbor + ", neighRank: " + neighRank);
			if (neighRank != null && neighRank == discoveryRank - 1) {
				continue;
			}
			
			// System.out.println("connDict: " + this.connDict);
			
			// System.out.println("graph: " + this.graph);
			
			// Recurse on the neighbor.
			int recursiveRank = this.dfs(neighbor, discoveryRank + 1);
			
			System.out.println("Recursive Rank: " + recursiveRank);

			// Step 1, check if this edge needs to be discarded.
			if (recursiveRank <= discoveryRank) {
				int sortedU = Math.min(node, neighbor), sortedV = Math.max(node, neighbor);
				System.out.println("RecursiveRank: " + recursiveRank + ", DiscoveryRank: " + discoveryRank + ". Removing the pair " + sortedU + ", " + sortedV + " from connDict");
				this.connDict.remove(new Pair<Integer, Integer>(sortedU, sortedV));
			}

			// Step 2, update the minRank if needed.
			minRank = Math.min(minRank, recursiveRank);
		}

		return minRank;
	}

	private void formGraph(int n, List<List<Integer>> connections) {

		this.graph = new HashMap<Integer, List<Integer>>();
		this.rank = new HashMap<Integer, Integer>();
		this.connDict = new HashMap<Pair<Integer, Integer>, Boolean>();

		// Default rank for unvisited nodes is "null"
		for (int i = 0; i < n; i++) {
			this.graph.put(i, new ArrayList<Integer>());
			this.rank.put(i, null);
		}

		for (List<Integer> edge : connections) {

			// Bidirectional edges
			int u = edge.get(0), v = edge.get(1);
			this.graph.get(u).add(v);
			this.graph.get(v).add(u);

			int sortedU = Math.min(u, v), sortedV = Math.max(u, v);
			connDict.put(new Pair<Integer, Integer>(sortedU, sortedV), true);
		}
		System.out.println("connDict: " + this.connDict);
		System.out.println("rank: " + this.rank);
		System.out.println("graph: " + this.graph);
		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		critical_connection begin = new critical_connection();
		begin.start();

	}
}
