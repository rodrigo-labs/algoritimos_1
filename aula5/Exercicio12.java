import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        
        double numeroUm;
        double numeroDois;
        double resultado;

        numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

        resultado = numeroUm * numeroDois;
        
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
    }
}