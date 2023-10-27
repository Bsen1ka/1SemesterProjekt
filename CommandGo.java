/* Command for transitioning between spaces
 */

import java.util.Objects;

class CommandGo extends BaseCommand implements Command {
  public CommandGo () {
    description = "Følg en udgang";
  }
  
  @Override
  public void execute (Context context, String command, String[] parameters) {
    if (guardEq(parameters, 1)) {
      System.out.println("Jeg ved ikke hvor det er 🤔");
      return;
    }
    context.transition(parameters[0]);
    if (Objects.equals(context.getCurrent().getName(), "klasselokale ")) {
      System.out.println(" ");
      System.out.println("Mulige objekter at samle op: ");
      System.out.println("- bord");
      System.out.println("- forbinding");
    }
    if (Objects.equals(context.getCurrent().getName(), "klasselokaleUnderEtagen ")) {
      System.out.println(" ");
      System.out.println("Mulige objekter at samle op: ");
      System.out.println("- bord");
      System.out.println("- forbinding");
      System.out.println("der ligger en forblødene elev på gulvet, vil du hjælpe ham?");
    }
  }
  }
