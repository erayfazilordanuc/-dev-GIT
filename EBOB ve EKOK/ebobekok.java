import java.util.*;

public class ebobekok {
 public static int ebob(int a,int b){
  int value,ebob=0,counter=0;
  if(a<b){
   value=b;}else{value=a;}

    for(int c=2;c<value;c++){
        if(a%c==0&&b%c==0){
            ebob=c;}
    }return ebob;       
    }
 public static int ekok(int a,int b){
    return (a*b)/ebob(a,b);
 }  
 public static int whilebob(int a,int b){
    int value,other,ebob=0;
    if(a<b){value=b;other=a;}else{value=a;other=b;}
    int remainder = value%other;
    while(remainder!=0){
       remainder=value%other;
       value=other;
       other=remainder;
    }return value;
 } 
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = input.nextInt();
    System.out.println("Enter a number");
    int b = input.nextInt();
    System.out.print("Bu iki sayının EBOB'u :");
    System.out.println(whilebob(a,b));
    System.out.print("Bu iki sayının EKOK'u :");
    System.out.println(ekok(a,b));

    }
}