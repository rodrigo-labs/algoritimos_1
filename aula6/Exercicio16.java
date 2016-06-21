import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é um multiplo de 2");
        }else {
            JOptionPane.showMessageDialog(null, numero + " não é um multiplo de 2");
        }
    }
}
