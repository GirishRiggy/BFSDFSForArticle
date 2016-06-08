
public class Main {

//	public List<Deals> getDeals() {
//
//		ArrayList<Deals> allDeals = new ArrayList<Deals>();
//		ObjectMapper mapper = new ObjectMapper();
//
//		Deals deal = new Deals();
//
//		mapper.readValue(new File("D:\\response.json"), Deals.class);
//
//		
//		return allDeals;
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Lets create nodes as given as an example in the article
		Node nA = new Node('A');
		Node nB = new Node('B');
		Node nC = new Node('C');
		Node nD = new Node('D');
		Node nE = new Node('E');
		Node nF = new Node('F');

		// Create the graph, add nodes, create edges between nodes
		Graph g = new Graph();
		g.addNode(nA);
		g.addNode(nB);
		g.addNode(nC);
		g.addNode(nD);
		g.addNode(nE);
		g.addNode(nF);
		g.setRootNode(nA);

		g.connectNode(nA, nB);
		g.connectNode(nA, nC);
		g.connectNode(nA, nD);

		g.connectNode(nB, nE);
		g.connectNode(nB, nF);
		g.connectNode(nC, nF);

		// Perform the traversal of the graph
        //adding a comment below traversal
		System.out.println("DFS Traversal of a tree is ------------->");
		g.dfs();

		System.out.println("\nBFS Traversal of a tree is ------------->");
		g.bfs();

	}

}
