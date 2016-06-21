import javax.swing.JOptionPane;

public class Exercicio34 {

    public static void main(String[] args) {
        
        int i = 33;

        while (i <= 57) {
            if(i % 2 == 0) {
                JOptionPane.showMessageDialog(null,"Valor de i: " + i);
            }

            i++;
        }
    }
}
