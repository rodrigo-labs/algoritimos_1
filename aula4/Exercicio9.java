import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {
        
        double massa;
        double altura;
        double imc;

        massa = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        imc = massa / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
    }
}
