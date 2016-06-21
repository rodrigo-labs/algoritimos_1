import javax.swing.JOptionPane;

public class Exercicio26 {

    public static void main(String[] args) {
        
        for (int i = 33; i <= 57; i++) {
            if(i % 2 == 0) {
                JOptionPane.showMessageDialog(null,"Valor de i: " + i);
            }
        }
    }
}
