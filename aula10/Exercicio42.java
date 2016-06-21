import javax.swing.JOptionPane;

public class Exercicio42 {

    public static void main(String[] args) {
        
        int i = 0; 
        int numero = 0;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
            
            if (numero % 3 == 0) {
                JOptionPane.showMessageDialog(null, numero + " É multiplo de 3");
            }else {
                JOptionPane.showMessageDialog(null, numero + " Não é multiplo de 3");
            }

            i++;
        } while (i < 3 );
    }
}
