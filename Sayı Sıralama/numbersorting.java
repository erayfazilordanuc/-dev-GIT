import java.util.*;

public class numbersorting {
    public static int first(int x){
      return x%10;
    }
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many numbers will you sort :");
    int a = input.nextInt();
    System.out.println("");
    int biggest=0;
    for(int c=1;c<=a;c++){
        if(first(c)==1){
            System.out.print("Enter the "+c+"st number :");    
        }if(first(c)==2){
            System.out.print("Enter the "+c+"nd number :");    
        }if(first(c)==3){
            System.out.print("Enter the "+c+"rd number :");    
        }else if(first(c)!=1&&first(c)!=3&&first(c)!=2){
        System.out.print("Enter the "+c+"th number :");}
        int x = input.nextInt();
        if(x>biggest){
            biggest=x;
        }
    }System.out.println("\nThe biggest number is :"+biggest+"\n");
    
    }
}