package core;

public class MensagemSingleton {
	private static Mensagem mensagem;
	
	private MensagemSingleton() {
		mensagem = new Mensagem();
	}
	
	public static Mensagem getInstance() {
		if (mensagem == null) {
			mensagem = new Mensagem();
		}
		return mensagem;
	}
}
