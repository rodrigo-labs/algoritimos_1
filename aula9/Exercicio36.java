import javax.swing.JOptionPane;

public class Exercicio36 {

    public static void main(String[] args) {
        
        int i = 0; 
        int numero = 0;

        while (i < 3) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
            
            if (numero % 10 == 0) {
                JOptionPane.showMessageDialog(null, numero + " É multiplo de 10");
            }else {
                JOptionPane.showMessageDialog(null, numero + " Não é multiplo de 10");
            }

            i++;
        }
    }
}
