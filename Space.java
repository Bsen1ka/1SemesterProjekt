/* Space class for modeling spaces (rooms, caves, ...)
 */

import java.util.Objects;
import java.util.Set;

class Space extends Node {
  Space (String name, String meddelese) {
    super(name,meddelese);

  }

  public void welcome () {
    System.out.println("Du er nu ved "+name);
    System.out.println(meddelse);
    Set<String> exits = edges.keySet();
    System.out.println("Mulige udgange er:");
    for (String exit: exits) {
      System.out.println(" - "+exit);
    }
  }
  public String getName () {
    return name;
  }

  public void goodbye () {
  }
  
  @Override
  public Space followEdge (String direction) {
    return (Space) (super.followEdge(direction));
  }
}
