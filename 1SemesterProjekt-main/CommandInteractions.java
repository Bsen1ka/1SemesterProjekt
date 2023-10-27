import java.util.Objects;
public class CommandInteractions extends BaseCommand implements Command {
    boolean lys = true;
    public CommandInteractions() {


    }

    @Override
    public void execute(Context context, String command, String[] parameters) {
        if (Objects.equals(context.getCurrent().getName(), "klasselokale ") &&
                Objects.equals(context.getCurrent().getName(), "klasselokaleUnderEtagen ")){
       if (guardEq(parameters, 1)){
           System.out.println("Det er ikke muligt at lave interaktioner med ingenting");
       }

           else if (Objects.equals(parameters[0], "lys")) {

               if (lys == true) {
                   System.out.println("Lyset er tændt du kan vælge at slukke det");
                   lys = false;
               }

              else if (lys == false) {
                   System.out.println("Lyset er slukket du kan vælge at tænde lyset");
                   lys = true;
               }
            } else {
                System.out.print("Dette er ikke et muligt input");

    }
}}}