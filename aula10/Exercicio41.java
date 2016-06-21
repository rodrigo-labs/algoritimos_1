import javax.swing.JOptionPane;

public class Exercicio41 {

    public static void main(String[] args) {
        
        int i = 13;

        do {
            if(i % 2 == 0) {
                JOptionPane.showMessageDialog(null,"Valor de i: " + i);
            }

            i++;
        } while (i <= 23); 
    }
}
