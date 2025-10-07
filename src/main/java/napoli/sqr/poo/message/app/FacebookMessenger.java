package napoli.sqr.poo.message.app;

public class FacebookMessenger extends ServicoPai{
    @Override
    public void sendMessage() {
        validarInternet();
        System.out.println("Mandando uma mensagem do Facebook.");
    }

    @Override
    public void receveMessage() {
        validarInternet();
        System.out.println("Recebendo uma mensagem no Facebook.");
    }
}
