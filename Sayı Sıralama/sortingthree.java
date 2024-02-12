import java.util.Scanner;

public class sortingthree {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("\nEnter 3 numbers\n");
    System.out.print("First: ");
    int f =input.nextInt();

    System.out.print("Second: ");
    int s =input.nextInt();

    System.out.print("Third: ");
    int t =input.nextInt();
    System.out.println("");
    if(f>s&&s>t){
    System.out.println(t+"<"+s+"<"+f);
   }if(s>f&&f>t){
    System.out.println(t+"<"+f+"<"+s);
   }if(s>t&&t>f){
    System.out.println(f+"<"+t+"<"+s);
   }if(f>t&&t>s){
    System.out.println(s+"<"+t+"<"+f);
   }if(t>s&&s>f){
    System.out.println(f+"<"+s+"<"+t);
   }if(t>f&&f>s){
    System.out.println(s+"<"+f+"<"+t);
   }else{System.out.println("Please enter different numbers, this case can't be sort with that code");
   }System.out.println("");



}}