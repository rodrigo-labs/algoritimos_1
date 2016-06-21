import javax.swing.JOptionPane;

public class Exercicio27 {

    public static void main(String[] args) {
    
        int numeroInicial;
        int numeroFinal;
        int soma = 0;

        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero inicial: "));
        numeroFinal = Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero final: "));

        for (int i = numeroInicial; i <= numeroFinal; i++) {
            soma = soma + i;
        }
        
        JOptionPane.showMessageDialog(null,"Numero Inicial: " + numeroInicial + 
                                           "\nNumero final: " + numeroFinal +
                                           "\nSoma dos numeros: " + soma);
    }
}
