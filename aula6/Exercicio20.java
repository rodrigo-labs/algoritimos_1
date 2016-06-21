import javax.swing.JOptionPane;

public class Exercicio20 {

    public static void main(String[] args) {

        int anoAtual = 2016;
        int anoNascimento;
        int idade;
        String nome;
        
        nome = JOptionPane.showInputDialog("Insira seu nome: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano de nascimento: "));
        idade = anoAtual - anoNascimento;
        
        if (anoNascimento <= anoAtual) {
            if (idade >= 15 && idade <= 25) {
                JOptionPane.showMessageDialog(null, nome + " Aceito");
            }else {
                JOptionPane.showMessageDialog(null, nome + " Não ceito");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "O seu ano de nascimento esta errado!");
        }
    }
}
