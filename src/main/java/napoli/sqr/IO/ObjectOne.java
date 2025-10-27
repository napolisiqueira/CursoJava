package napoli.sqr.IO;

import java.io.*;

public class ObjectOne {

    public static void Serealization(Gato cat) throws IOException {

        File f = new File("cat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.write(cat);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("O arquivo '%s' foi criado com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

        ps.close();
        oos.close();
    }

    public static void Deserealization(String archivePath) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivePath));
        Gato objectCat = (Gato) ois.readObject();

        objectCat.miar();
    }


    public static void main(String[] args) {
        Gato jamaica = new Gato("Jamaica", "Branco", '1');

        try {
            Serealization(jamaica);
            Deserealization("local/do/arquivo");
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("A classe não foi encontrada no arquivo: " + ex);;
        } catch (IOException e) {
            System.out.println("Houve um erro inesperado: " + e);
        }

    }



}

class Gato implements Serializable{

    private static final long serialVersionUID = 2L;
    private String name;
    private String color;
    private int age;

    public Gato(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void miar() {
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}