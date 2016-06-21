import javax.swing.JOptionPane;

public class Exercicio22 {

    public static void main(String[] args) {

        String nome = "Tibúrcio";
        
        String controle;
        
        controle = JOptionPane.showInputDialog("Qual operação você quer executar ?"
                                             + " \n e - engenheiro \n p - programador" 
                                             + " \n m - médico \n a - advogado \n d - design");
        
        switch(controle.toLowerCase()) {
            case "e":
                JOptionPane.showMessageDialog(null, nome + " é engenheiro");
            break;
        
            case "p":
                JOptionPane.showMessageDialog(null, nome + " é programador");
            break;
            
            case "m":
                JOptionPane.showMessageDialog(null, nome + " é médico");
            break;
        
            case "a":
                JOptionPane.showMessageDialog(null, nome + " é advogado");
            break;
            
            case "d":
                JOptionPane.showMessageDialog(null, nome + " é design");
            break;
            
            default:
                JOptionPane.showMessageDialog(null, nome + " esta desempregado");
            break;
        }
    }
}
