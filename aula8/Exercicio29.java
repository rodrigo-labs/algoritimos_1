import javax.swing.JOptionPane;

public class Exercicio29 {

    public static void main(String[] args) {
    
        int numero = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 6; i++) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
            
            if (numero >= 0) {
                positivos = positivos + numero;
            }else {
                negativos = negativos + numero;
            }
        }
        JOptionPane.showMessageDialog(null,"Soma dos positivos: " + positivos);
        JOptionPane.showMessageDialog(null,"Soma dos negativos: " + negativos);
    }
}
