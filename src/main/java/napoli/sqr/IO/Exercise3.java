package napoli.sqr.IO;

import java.io.*;

public class Exercise3 {

    public static void copyArchive() throws IOException {
        File file = new File("/abacate.txt");
        String nameArchive = file.getName();

        BufferedReader br = new BufferedReader(new FileReader(nameArchive));
        String line = br.readLine();

        String nameArchiveCopy = nameArchive.substring(0, nameArchive.indexOf(".")).concat("-copy.txt");
        File copyFile = new File(nameArchiveCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(copyFile.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();

        } while (!(line.isEmpty()));

        System.out.printf("\nArquivo \"%s\" copiado com sucesso.", file.getName());
        System.out.printf("\nTamanho de Arquivo: %d.", copyFile.length());


        System.out.println("Faça 3 recomendações de livro: ");
        adicionarInfoNoLivro(copyFile.getName());

        bw.close();
        br.close();

    }

    public static void adicionarInfoNoLivro(String archive) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(archive, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line.equalsIgnoreCase("fim"));

        System.out.println("TOP.");

        bw.close();
        br.close();
    }

    public static void main(String[] args) {
        try {
            copyArchive();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não Encontrado. ");
        } catch (IOException e) {
            System.out.println("Ocorreu algum problema. ");
        }
    }
}
