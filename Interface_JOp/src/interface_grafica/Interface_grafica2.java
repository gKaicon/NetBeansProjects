package interface_grafica;

import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class Interface_grafica2 {

    public static void main(String[] args) {

        try {

            int num;
            num = Integer.valueOf(
                    JOptionPane.showInputDialog(null, "Informe o número", "Calcula Dobro", JOptionPane.INFORMATION_MESSAGE));

            JOptionPane.showMessageDialog(null, "O dobro é: " + num * 2, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato invalido", "error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
