import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {
        
        int numero;
        String frase;
        
        frase = JOptionPane.showInputDialog( "Digite sua frase: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero de repetições: "));
        
        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, frase + " numero: " + i);
        }
    }
}
