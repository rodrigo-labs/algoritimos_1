import javax.swing.JOptionPane;

public class Exercicio22B {

    public static void main(String[] args) {

        String nome;
        double preco;
        double precoDesconto;
        
        String categoria;
        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto: "));
        categoria = JOptionPane.showInputDialog("Escolha a gategoria do produto: "
                                              + " \n A - 10% \n B - 15% \n C - 20% \n D - 25% \n E - 50%");

        switch(categoria.toUpperCase()) {
            case "A":
                precoDesconto = preco * 0.9;
                JOptionPane.showMessageDialog(null, nome + ", o produto esta com 10% de desconto: R$" + precoDesconto);
            break;
        
            case "B":
                precoDesconto = preco * 0.85;
                JOptionPane.showMessageDialog(null, nome + ", o produto esta com 10% de desconto: R$" + precoDesconto);
            break;
            
            case "C":
                precoDesconto = preco * 0.8;
                JOptionPane.showMessageDialog(null, nome + ", o produto esta com 10% de desconto: R$" + precoDesconto);
            break;
        
            case "D":
                precoDesconto = preco * 0.75;
                JOptionPane.showMessageDialog(null, nome + ", o produto esta com 10% de desconto: R$" + precoDesconto);
            break;
            
            case "E":
                precoDesconto = preco * 0.5;
                JOptionPane.showMessageDialog(null, nome + ", o produto esta com 10% de desconto: R$" + precoDesconto);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, nome + ", o produto esta sem desconto: R$" + preco);
            break;
        }
    }
}
