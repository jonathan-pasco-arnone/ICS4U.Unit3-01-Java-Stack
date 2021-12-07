/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-01
*/

/**
* This is the Main function outer layer.
*/
public class Main {
  /**
  * This is the main function.
  *
  * @param args this will not be used
  */
  public static void main(final String[] args) {
    // use MrCoxallStack class
    MrCoxallStack aStack = new MrCoxallStack();

    final int fourtyTwo = 42;
    final int ninetyOne = 91;
    System.out.println("Initial stack: ");
    aStack.showStack();

    System.out.println("Adding new value");
    aStack.push(fourtyTwo);
    System.out.println("New stack: ");
    aStack.showStack();

    System.out.println("Adding new value");
    aStack.push(ninetyOne);
    System.out.println("New stack: ");
    aStack.showStack();
  }
}
