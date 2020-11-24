package singleton;

/**
 * Singleton: padrão que cria uma classe que é instanciável somente uma única vez. 
 * @author Ricardo do Rosário
 *
 */
public class Console {
	private static Console c = null;
	/**
	 * Construtor privado para impedir de instanciá-la mais de uma vez.
	 */
	private Console() {
		//
	}
	/**
	 * Método para criar/selecionar a instância da classe
	 * @return
	 */
	public static Console getInstance() {
		if(c == null) {
			c = new Console();
		}
		return c;
	}
	
	/**
	 * Gera um log
	 * @param text
	 */
	public void log(String text) {
		System.out.println(text);
	}
}
