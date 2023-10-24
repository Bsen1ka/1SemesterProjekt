/* Context class to hold all context relevant to a session.
 */

class Context {
  Space current;
  boolean done = false;

  Context (Space node) {
    current = node;
  }
  class RoomDescription {
    private String description;

    RoomDescription(String description) {
      this.description = description;
    }

    public String getDescription() {
      return description;
    }

    public void udenfor() {
      System.out.println("Sup");
    }
  }
  public Space getCurrent() {
    return current;
  }

  public void transition (String direction) {
    Space next = current.followEdge(direction);
    if (next==null) {
      System.out.println("Du er forvirret, og går i cirkel i søgen efter '"+direction+"'.Til sidst giver du op 😩");
    } else {
      current.goodbye();
      current = next;
      current.welcome();
    }
  }
  
  public void makeDone () {
    done = true;
  }
  
  public boolean isDone () {
    return done;
  }
}

