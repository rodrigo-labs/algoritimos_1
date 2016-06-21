import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        double delta;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero: "));
        
        delta = (b * b) - 4 * a * c;
        
        JOptionPane.showMessageDialog(null, "O valor de delta é: " + delta);
    }
}
