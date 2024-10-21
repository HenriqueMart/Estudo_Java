package br.com.devhenrique.msnmessenger;

public class ComputadorJose {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		FecebookMessager fecebook = new FecebookMessager();
		Telegram telegram = new Telegram();
		
		msn.enviarMensagem();
	}
}
