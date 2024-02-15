import java.util.*;

public class palindrom {
    static int reversenumber(int x){
    int reversenumber=0,lastnumber; 
    while(x>0){
    lastnumber= x%10;
    reversenumber*=10;
    reversenumber+=lastnumber;
    x=(x-x%10)/10;
    }return reversenumber;}
    static int palindrom(int m){
    if(m==reversenumber(m)){
        return 1;
    }else{return 0;}
    }
    public static void main(String[] args){

    System.out.println(palindrom(12321));
    System.out.println(reversenumber(235346));
    }
}