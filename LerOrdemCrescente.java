import javax.swing.JOptionPane;

public class LerOrdemCrescente{
   public static void main(String [] args){
      
      int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
      int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
      int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));
      
      if(valor1 < valor2){
         if(valor2 < valor3){
            JOptionPane.showMessageDialog(null, valor1 + " " + valor2 + " " + valor3);
         }
         else if(valor1 < valor3){
            JOptionPane.showMessageDialog(null, valor1 + " " + valor3 + " " + valor2);
         }
         else{
            JOptionPane.showMessageDialog(null, valor3 + " " + valor1 + " " + valor2);
         }
      }
      else if(valor1 > valor2){
         if(valor1 < valor3){
            JOptionPane.showMessageDialog(null, valor2 + " " + valor1 + " " + valor3);
         }
         else if(valor2 < valor3){
            JOptionPane.showMessageDialog(null, valor2 + " " + valor3 + " " + valor1);
         }
         else{
            JOptionPane.showMessageDialog(null, valor3 + " " + valor2 + " " + valor1);
         }
      }      
   }
}