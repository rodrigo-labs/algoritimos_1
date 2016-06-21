import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {

        int numeroUm;
        int numeroDois;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
        
        if(numeroUm == numeroDois) {
            JOptionPane.showMessageDialog(null, numeroUm + " é igual a " + numeroDois);
        }else {
            if (numeroUm > numeroDois) {
                JOptionPane.showMessageDialog(null, numeroUm + " é maior que " + numeroDois);
            }else {
                JOptionPane.showMessageDialog(null, numeroUm + " é menor que " + numeroDois);
            }
        }
    }
}
