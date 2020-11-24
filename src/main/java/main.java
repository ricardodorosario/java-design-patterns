import singleton.Console;

public class main {
	public static void main(String[] args) {
		/**
		 * Singleton
		 */
		Console console = Console.getInstance();
		console.log("Teste 1");
		console.log("Teste 2");
		Console.getInstance().log("Teste 3");
	}
}
