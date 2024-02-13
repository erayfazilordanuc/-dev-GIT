import java.util.*;

public class sumofodd {
    public static void main(String[] args){

    int a,total=0;
    do{Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    a = input.nextInt();
    if(a%2==0&&a%4==0){
        total+=a;
    }
    }while(a%2==0);
    System.out.println("The sum of the numbers you entered that are divisible by 4 and 2 is : "+total);
    }
}
