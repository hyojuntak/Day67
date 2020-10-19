import java.util.ArrayList;
import java.util.Scanner;

class Main {




  static int resultcount(ArrayList<Integer> valuecount){
        
        int even = 0; 
        int odd = 0;
        
        for (int i = 0; i < valuecount.size(); i++) {
            if(i%2==0)
                even+=valuecount.get(i);
            
            else
                odd+=valuecount.get(i);

        }

        int result = even >odd ? even : odd;

        return result;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int storecount = 0;

        System.out.print("");
        storecount = sc.nextInt();
        ArrayList<Integer> valuecount = new ArrayList<Integer>();
        
        for (int i = 0; i < storecount; i++) {
            int value = 0;
            System.out.print("");value = sc.nextInt();
            valuecount.add(value);
        }

        System.out.println(resultcount(valuecount));
        
        
    }
}
