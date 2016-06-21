import javax.swing.JOptionPane;

public class Exercicio37 {

    public static void main(String[] args) {
    
        int numero = 0;
        int positivos = 0;
        int negativos = 0;
        int i = 0;

        while (i < 6) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
            
            if (numero >= 0) {
                positivos = positivos + numero;
            }else {
                negativos = negativos + numero;
            }

            i++;
        }
        JOptionPane.showMessageDialog(null, "Soma dos positivos: " + positivos);
        JOptionPane.showMessageDialog(null, "Soma dos negativos: " + negativos);
    }
}
