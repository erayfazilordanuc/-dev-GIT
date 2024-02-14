import java.util.*;

public class perfectnumber {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a number :");
    int a = input.nextInt();
    int x=a;
    int total=0;
    for(int c=1;c<a;c++){
        if(x%c==0){
            total+=c;
        }
    }
    System.out.println("\n"+total+" is a perfect number\n");
    }
}
