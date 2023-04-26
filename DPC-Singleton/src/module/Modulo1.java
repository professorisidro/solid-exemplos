package module;

import core.MensagemSingleton;

public class Modulo1 {
	
	public void executa() {
		MensagemSingleton.getInstance().setConteudo("Modulo 1 criado");
		System.out.println(MensagemSingleton.getInstance().getConteudo());
	}

}
