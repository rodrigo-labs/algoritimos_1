import javax.swing.JOptionPane;

public class Exercicio32 {
    
    public static void main(String[] args) {
        
        int i = 0;
        double soma = 0;
        double media;

        while (i <= 1000) {
            
            soma = soma + i;
            i++;
        }
        
        media = soma / 1000;
        JOptionPane.showMessageDialog(null, "Soma = " + soma +
                                            "\nMedia = " + media);
    }
}
