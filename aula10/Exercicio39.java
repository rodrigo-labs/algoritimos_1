import javax.swing.JOptionPane;

public class Exercicio39 {
    
    public static void main(String[] args) {
        
        int numero = 0;
        int soma = 0;
        int i = 0;
        
        do{
            if (i == 0) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: " + i));
            }else {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o proximo numero: " + i));
            }

            soma = soma + numero;
            i++;
        }while(i < 20);
        
        JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma);
    }
}
