package napoli.sqr.IO;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DataOne {

    public static void includeProduct() throws IOException {
        File f = new File("abacate.bin");

        PrintStream ps = new PrintStream(System.out, true);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath());

        Scanner scan =  new Scanner(System.in);

        ps.print("Nome da peça: ");
        String name = scan.nextLine();
        dos.writeUTF(name);

        ps.print("Tamanho da peça: (P/M/G/U) ");
        char partLenght = (char) System.in.read();
        dos.writeChar(partLenght);


        ps.print("Quantidade: ");
        int amount = scan.nextInt();
        dos.writeInt(amount);

        ps.print("Preço unitário: ");
        double price = scan.nextDouble();
        dos.writeDouble(price);

        ps.close();
        dos.close();
        scan.close();
    }

    public static void readProduct(String archivePath) throws IOException {


        File f = new File(archivePath);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String name = dis.readUTF();
        char partLenght = dis.readChar();
        int amount = dis.readInt();
        double price = dis.readDouble();

        System.out.println("texto");

        dis.close();
    }

    public static void main(String[] args) {
        try {
            includeProduct();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não Encontrado.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro inesperado.");
        }
    }
}
