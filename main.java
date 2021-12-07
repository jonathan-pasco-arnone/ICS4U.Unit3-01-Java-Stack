class main {
	public static void main(String[] args) {
		// use MrCoxallStack class
		MrCoxallStack aStack = new MrCoxallStack();
		
		System.out.println("Initial stack: ");
		aStack.showStack();
    
    System.out.println("Adding new value");
    aStack.push(42);
    System.out.println("New stack: ");
    aStack.showStack();

    System.out.println("Adding new value");
    aStack.push(91);
    System.out.println("New stack: ");
    aStack.showStack();
	}
}