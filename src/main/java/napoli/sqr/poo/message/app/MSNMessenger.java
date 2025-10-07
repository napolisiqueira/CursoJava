package napoli.sqr.poo.message.app;

public class MSNMessenger extends ServicoPai {
    @Override
    public void sendMessage() {
        validarInternet();
        System.out.println("Enviando mensagem do MSN.");
    }
    public void receveMessage() {
        validarInternet();
        System.out.println("Recebendo message no MSN");
    }
}
