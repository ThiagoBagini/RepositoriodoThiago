package calculadora;
import javax.swing.JOptionPane;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstNumber=
                JOptionPane.showInputDialog("Insira o primeiro número");
        String secondNumber=
                JOptionPane.showInputDialog("Insira o segundo número");
        String operacao=
                JOptionPane.showInputDialog("Insira a operação desejada entre +, -, * ou /");
        
        int number1=Integer.parseInt(firstNumber);
        int number2=Integer.parseInt(secondNumber);
        
        int result=0;
           switch (operacao){
               case "+":
                   int soma=number1+number2;
                   result=soma;
                   break;
               case "-":
                   int subt=number1+number2;
                   result=subt;
                   break;
               case "*":
                   int mult=number1*number2;
                   result=mult;
                   break;
               case "/":
                   int div=number1/number2;
                   result=div;
                   break; 
               default:
                   JOptionPane.showMessageDialog(null,"A operação não existe");
                   break;
           } 
        
        JOptionPane.showMessageDialog(null,"O resultado é " +result);
    }
    
}
