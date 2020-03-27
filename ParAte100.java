import javax.swing.JOptionPane;
public class ParAte100
{
   public static void main(String[] args)
   {
      
      
      String saida="Resposta:\n";
      
      int i=0,x=0;
     
      do
      {
        if(x%2==0)
        { i=i+1;
         saida=saida+x+" ";
        }        
         x=x+1;
         if(i==60)
         {
            saida=saida+"\n";
         }
      }
      while(i<=100);
      
     
      
     
      
      JOptionPane.showMessageDialog(null,saida);
   }
}