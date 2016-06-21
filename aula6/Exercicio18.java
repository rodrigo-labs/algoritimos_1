import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {

        double salarioBruto;
        double prestacao;

        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário bruto: "));
        prestacao = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da prestação: "));
        
        if (prestacao <= (salarioBruto * 0.3)) {
            JOptionPane.showMessageDialog(null, "Credito aceito.");
        }else {
            JOptionPane.showMessageDialog(null, "Credito negado, prestação acima do valor permitido.");
        }
    }
}
