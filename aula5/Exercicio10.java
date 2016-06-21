import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {
        
        int numeroUm;
        int numeroDois;
        int resultado;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));

        resultado = numeroUm - numeroDois;
        
        JOptionPane.showMessageDialog(null, "A subtração dos resultadoes é: " + resultado);
    }
}
