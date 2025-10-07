package napoli.sqr.poo.message.app;

public abstract class ServicoPai {
    private static void salvarHistorico() {
        System.out.println("Salvando no historico.");
    }
    protected static void validarInternet() {
        System.out.println("Validando a internet.");
    }

    public abstract void sendMessage();
    public abstract void receveMessage();


}
