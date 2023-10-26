import java.util.Objects;

public class CommandInventory extends BaseCommand implements Command{
    Inventory inventory = new Inventory();
    public CommandInventory() {
        description = "For at kunne se dit inventory, skriv inventory, add til dit inventory, skriv inventory *Genstand*";
    }

    @Override
    public void execute(Context context, String command, String[] parameters) {
         if (Objects.equals(context.getCurrent().getName(), "klasselokale ") ||
                 Objects.equals(context.getCurrent().getName(), "klasselokale "))  {
             if (guardEq(parameters, 1)) {
                 inventory.displayInventory();
             }
             else if (Objects.equals(parameters[0], "bord")){
                 System.out.println("Du har nu tilføjet et bord, til dit inventory");
                 inventory.addItem("bord",1);
             } else if (Objects.equals(parameters[0],"forbinding")) {
                 System.out.println("Du har nu tilføjet en forbinding til dit inventory");
                 inventory.addItem("forbinding",1);
             }
             else {
                 System.out.println("Dette kan du ikke samle op");
             }
         } else {
             inventory.displayInventory();
        }

    }
}

