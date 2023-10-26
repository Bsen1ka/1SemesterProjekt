/* Node class for modeling graphs
 */

import java.util.HashMap;
import java.util.Map;

class Node{
  String name;
  String meddelse;

  Map<String, Node> edges = new HashMap<String, Node>();
  
  Node (String name, String meddelse) {
    this.name = name;
    this.meddelse = meddelse;
  }

  public void addEdge (String name, Node node) {
    edges.put(name, node);
  }
  
  public Node followEdge (String direction) {
    return edges.get(direction);
  }
}

