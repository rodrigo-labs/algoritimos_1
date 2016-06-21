import javax.swing.JOptionPane;

public class Exercicio35 {

    public static void main(String[] args) {
        
        int numeroInicial;
        int numeroFinal;
        int soma = 0;

        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero inicial: "));
        numeroFinal = Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero final: "));

        int i = numeroInicial;

        while (i <= numeroFinal) {
            soma = soma + i;
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Numero Inicial: " + numeroInicial + 
                                            "\nNumero final: " + numeroFinal +
                                            "\nSoma dos numeros: " + soma);
    }
}
