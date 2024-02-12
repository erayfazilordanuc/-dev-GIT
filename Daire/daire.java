
import java.util.Scanner;

public class daire{

    static int expo(int a,int b){
        int cons=1;
        if(a==0||b==0){
            cons=0;}
        for(;b>0;b--){
            cons*=a;
        }return cons;}

    public static void main(String[] args){

    System.out.println(" ");
    System.out.println("Enter the radius of circle");
    Scanner input = new Scanner(System.in);
    int radius = input.nextInt();
    
    float pi = 3.14f;
    float field = pi*expo(radius,2);
    float perimeter = 2*pi*radius;
    
    // üstteki ile aynı
    // float field = 3.14f*expo(radius,2);
    // float perimeter = 2*3.14f*radius;

    System.out.println(" ");
    System.out.print("Perimeter of circle is ");
    System.out.println(perimeter);
    System.out.println(" ");
    System.out.print("Field of circle is ");
    System.out.println(field);
    System.out.println(" ");

}
}