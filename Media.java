import javax.swing.JOptionPane;
public class Media
{
   public static void main(String[] args)
   {
      
      
      String saida="Resposta:\n";
      
      int i=0,x=0;
      
      double media=0,n=0,m=0;
     
      do
      {
         n=0;
            n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
           
            if(n>=0)
            {
              x=x+1;
              m=m+n;
            }
         
      }
      while(n>0);
      
      media=m/x;
      
     
      
     
      
      JOptionPane.showMessageDialog(null,media);
   }
}