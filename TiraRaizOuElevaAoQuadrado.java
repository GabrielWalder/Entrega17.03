import javax.swing.JOptionPane;

public class TiraRaizOuElevaAoQuadrado{
   public static void main(String [] args){
      
      double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
      
      if(valor1 > 0){
         JOptionPane.showMessageDialog(null, Math.sqrt(valor1));
      } else {
         JOptionPane.showMessageDialog(null, valor1 * valor1);
      }      
   }
}