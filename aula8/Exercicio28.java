import javax.swing.JOptionPane;

public class Exercicio28 {

    public static void main(String[] args) {
    
        int numero = 0;

        for (int i = 0; i < 3; i++) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
            
            if (numero % 10 == 0) {
                JOptionPane.showMessageDialog(null,numero + " É multiplo de 10");
            }else {
                JOptionPane.showMessageDialog(null,numero + " Não é multiplo de 10");
            }
        }
    }
}
