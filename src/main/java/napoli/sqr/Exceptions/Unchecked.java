package napoli.sqr.Exceptions;

import javax.swing.*;

public class Unchecked {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominadors: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);

        }catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally.");
        }

    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
