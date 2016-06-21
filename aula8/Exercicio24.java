import javax.swing.JOptionPane;

public class Exercicio24 {

    public static void main(String[] args) {
      
	double media = 0.0;
	double soma = 0.0;

	for (int i=0; i<=1000;i++) {
	    soma = soma + i;  
	}

	media = soma / 1000;

	JOptionPane.showMessageDialog(null, "Soma = " + soma +
                                            "\nMedia = " + media);
    }
}
