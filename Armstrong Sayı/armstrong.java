import java.util.*;

public class armstrong {

    public static long expo(long a,long b){
        long cons=1;
        if(a==0||b==0)
            cons=0;
        for(;b>0;b--)
            cons*=a;
        return cons;}
    public static long digitlong(long x){
    // for less than 1.000.000
        int digit=0;
    if(x<10&&x>=0){
     digit=1;
    }if(x<100&&x>9){
        digit=2;
    }if(x<1000&&x>99){
        digit=3;
    }if(x<10000&&x>999){
        digit=4;
    }if(x<100000&&x>9999){
        digit=5;
    }if(x<1000000&&x>99999){
        digit=6;
    }return digit;
    }
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int b = input.nextInt();
    int a=b;
    int remainder;
    int total=0;
    long l=digitlong(a);
    for(long x=l;x>0;x--){
     remainder=a%10;
     total+=expo(remainder,l);
     a=(a-(a%10))/10;
    }if(total==b){
        System.out.println("This is an armstrong number");
    }
    }
}