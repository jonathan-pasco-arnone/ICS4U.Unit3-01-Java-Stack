/**
* This is the Main function.
*/
class Main {
	public static void main(String[] args) {
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
