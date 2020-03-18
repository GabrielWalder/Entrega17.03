import javax.swing.JOptionPane;

public class SomaMaiorQueDez{
   public static void main(String [] args){

      int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
      int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
      
      if(valor1 + valor2 > 10){
         JOptionPane.showMessageDialog(null, valor1 + valor2);
      } else {
         JOptionPane.showMessageDialog(null, "Fim");
      }
   }
}