package ca.vanier;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    CustomerControler custController = new CustomerControler();
    try {
      custController.save("John", "Doe", 35);
      custController.save("Joao", "Silva", 25);

      if (args[0].equalsIgnoreCase("save")) {
        System.out.println(
          custController.save(args[1], args[2], Integer.valueOf(args[3]))
        );
        custController.list();
      } else if (args[0].equalsIgnoreCase("list")) {
        custController.list();
      } else {
        System.out.println("invalid response");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
