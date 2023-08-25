
package mayormenor;
import java.util.Scanner;
public class Mayormenor {

  
    public static void main(String[] args) {
        int [] num = new int[20];
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < num.length; i++){
            System.out.println("ingrese el numero "+(i+1));
            num[i] = s.nextInt();
        }
        
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length - i- 1; j++){
            if(num[j] < num[j+1]){
                int aux = num[j];
                num[j] = num[j+1];
                num[j+1] = aux;
            }
        }
            
        }
        for(int i = 0; i < num.length; i++){
                System.out.print(num[i]+" ");
            }
    }
    
}
