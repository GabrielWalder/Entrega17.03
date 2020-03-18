import javax.swing.JOptionPane;

public class SomaMenorOuIgualAVinte{
   public static void main(String [] args){
      
      int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
      int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
      
      if(valor1 + valor2 <= 20){
         JOptionPane.showMessageDialog(null, (valor1 + valor2) - 5);
      } else {
         JOptionPane.showMessageDialog(null, "Fim");
      }      
   }
}