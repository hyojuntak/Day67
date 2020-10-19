
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        while(count<3){
          int sum = 0;
          int max = 0;
         

          int N = 0;
          N = sc.nextInt();

          int [] K = new int[N];
          for (int i = 0; i < K.length; i++) {
              K[i] = sc.nextInt();
          }
          
          for (int i = 0; i < K.length; i++) {
              for (int j = 2; j < K.length; j++) {
                  if(j-i>1)
                      sum=K[j]+K[i];
                      if (max<sum) 
                          max = sum;
                  
                  else
                      continue;
                      
              }
          }
        count++;
        System.out.println(max);

        }
  }
}
