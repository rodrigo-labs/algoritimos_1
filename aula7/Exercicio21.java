import javax.swing.JOptionPane;

public class Exercicio21 {

    public static void main(String[] args) {

        double numeroUm;
        double numeroDois;
        double resultado;
        int controle;
        
        numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro numero: "));
        numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo numero: "));
        
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar ?"
                                                              + " \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão"));
        
        switch(controle) {
            case 1:
                resultado = numeroUm + numeroDois;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
        
            case 2:
                resultado = numeroUm - numeroDois;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            
            case 3:
                resultado = numeroUm * numeroDois;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
        
            case 4:
                resultado = numeroUm / numeroDois;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida! ");
            break;
        }
    }
}
