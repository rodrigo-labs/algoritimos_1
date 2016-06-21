import javax.swing.JOptionPane;

public class Exercicio40 {

    public static void main(String[] args) {
        
        int i = 1;
        int numero;
        String frase;
        
        frase = JOptionPane.showInputDialog("Digite sua frase: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de repetições: "));
        
        do {
            JOptionPane.showMessageDialog(null, frase + " -> " + i);
            i++;
        } while(i <= numero);
    }
}
