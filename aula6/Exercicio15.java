import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {

        int numeroUm;
        int numeroDois;
        int soma;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        soma = numeroUm + numeroDois;
        
        if(soma > 10) {
            JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma);
        }
    }
}
