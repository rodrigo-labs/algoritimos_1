import javax.swing.JOptionPane;

public class Trabalho2 {

    public static void main(String[] args) {
        
        String nome;
        int tempo_empresa;
        int numero_dependentes;
        double salario_atual;
        
        int menu;
        
        double aumento = 0;
        double imposto = 0;
        double salario_final = 0;
        
        //Solicitar dados do Empregado
        nome = JOptionPane.showInputDialog( "Digite o nome do cliente: ");
        tempo_empresa = Integer.parseInt(JOptionPane.showInputDialog( "Digite o tempo de empresa: "));
        numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero de dependentes: "));
        salario_atual = Double.parseDouble(JOptionPane.showInputDialog( "Digite o salário atual: "));
        
        //calculo do aumento
        if(tempo_empresa > 7) {
            aumento = salario_atual * 0.20;
        }else if(tempo_empresa > 5) {
            aumento = salario_atual * 0.15;
        }else if(tempo_empresa > 3) {
            aumento = salario_atual * 0.10;
        }
        
        //calculo do imposto
        if(numero_dependentes == 0) {
            imposto = salario_atual * 0.20;
        }else if(numero_dependentes == 1) {
            imposto = salario_atual * 0.18;
        }else if(numero_dependentes == 2) {
            imposto = salario_atual * 0.16;
        }else {
            imposto = salario_atual * 0.15;
        }
        
        //calculo do salario final
        salario_final = salario_atual + aumento - imposto;
        
        //Mostrar um MENU com as seguintes opções
        menu = Integer.parseInt(JOptionPane.showInputDialog( "MENU\n" 
                                                + "\n3) Mostrar todos os dados do Empregado."
                                                + "\n4) Mostrar o valor do Aumento."
                                                + "\n5) Mostrar o valor do Imposto que será retido na folha de pagamento."
                                                + "\n6) Mostrar o valor do Salário Final."
                                                + "\n7) Apresentar um resumo de cálculos do Empregado."));
                                                
        switch(menu) {
            case 3 :
                //Mostrar todos os dados do Empregado
                JOptionPane.showMessageDialog(null, "Nome: " + nome
                                                  + "\nTempo de Empresa: " + tempo_empresa
                                                  + "\nNúmero de Dependentes: " + numero_dependentes
                                                  + "\nSalário: R$" + salario_atual);
                break;
                
            case 4 :
                //Mostrar o valor do Aumento
                JOptionPane.showMessageDialog(null, "Aumento: R$" + aumento);
                break;
                
            case 5 :
                //Mostrar o valor do Imposto que será retido na folha de pagamento
                JOptionPane.showMessageDialog(null, "Imposto: R$" + imposto);
                break;
                
            case 6 :
                //Mostrar o valor do Salário Final
                JOptionPane.showMessageDialog(null, "Salário Final: R$" + salario_final);
                break;
                
            case 7 :
                //Apresentar um resumo de cálculos do Empregado
                JOptionPane.showMessageDialog(null, "Nome: " + nome
                                                  + "\nTempo de Empresa: " + tempo_empresa
                                                  + "\nNúmero de Dependentes: " + numero_dependentes
                                                  + "\nSalário: R$" + salario_atual
                                                  + "\nAumento: R$" + aumento
                                                  + "\nImposto: R$" + imposto
                                                  + "\nSalário Final: R$" + salario_final);
                break;
                
            default:
            //mensagem de opcao invalida
                JOptionPane.showMessageDialog(null, "Opção inválida. ");
            break;	
        }
        
    }
}
