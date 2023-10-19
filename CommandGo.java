/* Command for transitioning between spaces
 */

class CommandGo extends BaseCommand implements Command {
  CommandGo () {
    description = "Følg en udgang";
  }
  
  @Override
  public void execute (Context context, String command, String[] parameters) {
    if (guardEq(parameters, 1)) {
      System.out.println("Jeg ved ikke hvor det er 🤔");
      return;
    }
    context.transition(parameters[0]);
  }
}
