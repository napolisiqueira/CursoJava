package napoli.sqr.poo.message.app;

public class InstagramMessenger extends ServicoPai{


    @Override
    public void sendMessage() {
        validarInternet();
        System.out.println("Mandando uma messagem do Instagram.");
    }

    @Override
    public void receveMessage() {
        validarInternet();
        System.out.println("Recebendo mensagem no Instagram.");
    }
}
