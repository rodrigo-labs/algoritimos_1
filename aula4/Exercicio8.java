import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
        
        int numeroUm;
        int numeroDois;
        int soma;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));

        soma = numeroUm + numeroDois;
        
        JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma);
    }
}
