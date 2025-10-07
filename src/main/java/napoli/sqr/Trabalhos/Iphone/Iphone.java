package napoli.sqr.Trabalhos.Iphone;

public class Iphone implements Telefone, Ipod, Web {
    public static void main(String[] args) {
        Iphone myPhone = new Iphone();

        myPhone.adicionarNovaAba();
        myPhone.atender();
        myPhone.AtualizarPagina();
        myPhone.ligar("(11) 94568-6598");
        myPhone.selecionarMusica("Canto gregoriano da divina misericordia.");

    }
    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s...\n", numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }
    @Override
    public void inciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }
    @Override
    public void pausar() {
        System.out.println("A musica está pasusada.");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("A musica %s foi selecionada.", musica);
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Exibindo pagina.");
    }
    @Override
    public void AtualizarPagina() {
        System.out.println("Exibindo pagina.");
    }
}
