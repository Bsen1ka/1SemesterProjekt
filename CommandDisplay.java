import java.util.Objects;

public class CommandDisplay extends BaseCommand implements Command {

public CommandDisplay (){

}
    @Override
    public void execute(Context context, String command, String[] parameters) {
        if (Objects.equals(context.getCurrent().getName(), "klasselokale ")) {
            String item = parameters[0];
            switch (item) {
                case "bord":
                    System.out.println("Du har fået et bord");
                    addItem("bord", 1);
                    break;
                case "forbinding":
                    System.out.println("Du har nu fået forbinding");
                    addItem("forbinding", 1);
                    break;
                default:
                    System.out.println("Du kan ikke samle dette op.");
            }
        } else {
            System.out.println("Jeg ved ikke hvilket item det er 🤔");
            return;
        }
        displayInventory();
    }
}
