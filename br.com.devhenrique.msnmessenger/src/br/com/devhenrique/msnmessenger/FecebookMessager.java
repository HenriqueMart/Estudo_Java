package br.com.devhenrique.msnmessenger;

public class FecebookMessager extends ServicoMensagemInstantania{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando Mensagem pelo Fecebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Fecebook");
		
	}
	
}
