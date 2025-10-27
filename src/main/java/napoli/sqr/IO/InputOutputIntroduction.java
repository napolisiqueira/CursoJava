package napoli.sqr.IO;

import java.io.*;
import java.nio.Buffer;

public class InputOutputIntroduction {

    public static void lerTecladoEscreverDocumento() throws  IOException {
        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        } while (!(line.isEmpty()));

        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        try {
            lerTecladoEscreverDocumento();
        } catch (IOException e) {
            System.out.println("Erro ao exewcutar o programa: " + e);
        }

    }

}
