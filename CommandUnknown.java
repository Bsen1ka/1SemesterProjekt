/* Fallback for when a command is not implemented
 */

class CommandUnknown extends BaseCommand implements Command {
  @Override
  public void execute (Context context, String command, String parameters[]) {
    System.out.println("Hovsa, det forstår jeg ikke '"+command+"' 😕");
  }
}
