import java.util.*;

public class harmonicnumber {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = input.nextInt();
    float total=0;
    for(float c=1;c<=a;c++){
      total=total+1/c;
    }System.out.println(total);
    }
}