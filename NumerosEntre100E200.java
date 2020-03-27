import javax.swing.JOptionPane;
public class NumerosEntre100E200
{
   public static void main(String[] args)
   {
      
      
      String saida="Resposta:\n";
      
      int i=0,x=0,m=0,n=0;
     
      do
      {
         
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
           
            if(n!=0)
            {  
               if(n>=100&n<=200)
               {
                 x=x+1;
                 m=m+n;
               }
              
             
            }
         
      }
      while(n!=0);
      
      
      
     
      
     
      
      JOptionPane.showMessageDialog(null,"Essa foi a quantidade de números: "+x,"Resposta:",JOptionPane.PLAIN_MESSAGE);
   }
}