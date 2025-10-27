package napoli.sqr.IO;

import java.io.*;
import java.util.Scanner;

public class Exercise2 {

    public static void lerLinhaEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Escreve 3 jogos que mais gosta: ");
        pw.flush();


        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("recomendações.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = scan.nextLine();
        } while (!(line.equalsIgnoreCase("fim")));

        pw.close();
        scan.close();
        bw.close();
    }

    public static void main(String[] args) {
        try {
            lerLinhaEscreverDocumento();
        } catch (IOException e) {
            System.out.println("Houve um erro: " + e);
        }

    }
}
