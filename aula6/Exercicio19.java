import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {

        int anoAtual = 2016;
        int anoNascimento;
        int idade;
        
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira seu ano de nascimento: "));
        
        if (anoNascimento < anoAtual) {
            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        }else {
            JOptionPane.showMessageDialog(null, "O ano de nascimento esta errado!");
        }
    }
}
