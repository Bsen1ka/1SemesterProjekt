/* Main class for launching the game
 */

import java.util.Scanner;

class Game {
  static World    world    = new World();
  static Context  context  = new Context(world.getEntry());
  static Command  fallback = new CommandUnknown();
  static Registry registry = new Registry(context, fallback);
  static Scanner  scanner  = new Scanner(System.in);

  
  private static void initRegistry () {
    Command cmdExit = new CommandExit();
    registry.register("exit", cmdExit);
    registry.register("quit", cmdExit);
    registry.register("bye", cmdExit);
    registry.register("go", new CommandGo());
    registry.register("help", new CommandHelp(registry));
    registry.register("inventory", new CommandInventory());
  }

  public static void main (String[] args) {
    System.out.println("Velkommen til World of evacuation!");
    System.out.println("Advarsel dette spil simulerer skoleskyderi, hvis du har PTSD eller traumatiske oplevelser med ligne burde du lukke spillet");
    initRegistry();
    context.getCurrent().welcome();

    while (!context.isDone()) {
      System.out.print("> ");
      String line = scanner.nextLine();
      registry.dispatch(line);
    }

    System.out.println("Game Over 😥");
  }
}
