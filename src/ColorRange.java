
import java.util.Scanner;


public class ColorRange {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double cor = sc.nextDouble();
        
        sc.close();
        
        //coloque uma onda do espectro visível para saber de qual cor ele pertence
        
        if(cor < 380)
        {
            System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
        }
        
        
        else if(cor < 450)
        {
            System.out.println("A cor é violeta");
        }
        
        
        else if (cor < 495)
        {
            System.out.println("A cor é azul");
        }
        
        
        else if(cor < 570)
        {
            System.out.println("A cor é verde");
        }
        
        
        else if (cor < 590)
        {
            System.out.println("A cor é amarela");
        }
        
        
        else if (cor < 620)
        {
            System.out.println("A cor é laranja");
        }
        
        
        else if (cor < 750)
        {
            System.out.println("A cor é vermelha");
        }
        
        
        else if (cor > 750)
        {
            System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
        }
    }
}
