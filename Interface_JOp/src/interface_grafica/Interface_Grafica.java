package interface_grafica;

import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class Interface_Grafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String PrimeiroNumero;
        String SegundoNumero;
        int number1;
        int number2;
        int sum;

        PrimeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro Numero");

        SegundoNumero = JOptionPane.showInputDialog("Digite o segundo Numero");

        number1 = Integer.parseInt(PrimeiroNumero);
        number2 = Integer.parseInt(SegundoNumero);

        sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "A soma é " + sum, "Results",
                JOptionPane.PLAIN_MESSAGE);

        System.exit(0);

    }

}
