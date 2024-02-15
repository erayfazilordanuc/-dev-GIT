import java.util.*;

public class recursionarray {
    static void array(int a){
     System.out.print(a+" ");
     if(a<=0){
        return;
     }
     array(a-5);

     System.out.print(a+" ");
    }
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number :");
    int a = input.nextInt();
    
    array(a);

    }
}