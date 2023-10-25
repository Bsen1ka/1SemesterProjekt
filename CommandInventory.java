import java.util.Objects;

public class CommandInventory extends BaseCommand implements Command{

    public CommandInventory() {
    }

    @Override
    public void execute(Context context, String command, String[] parameters) {
         if (Objects.equals(context.getCurrent().getName(), "klasselokale ")) {
             if (parameters[0] == "bord"){
                 System.out.println("Du har nu tilføjet et bord, til dit inventory");
                 addItem("bord",1);
             } else if (parameters[0] == "forbinding") {
                 System.out.println("Du har nu tilføjet en forbinding, til dit inventory");
                 addItem("forbinding" , 1);
             } else if (guardEq(parameters, 1)) {
                 System.out.println("Dette kan du ikke samle op");
             }
             else {
                 System.out.println("Du kan ikke samle dette op!");
             }
         } else {
            System.out.println("Jeg ved ikke hvilket item det er 🤔");
            return;
        }
         displayInventory();
    }
}

