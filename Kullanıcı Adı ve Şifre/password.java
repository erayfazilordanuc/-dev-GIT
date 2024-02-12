import java.util.*;

public class password {
public static void main(String[] u){

Scanner input = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
String username = "eray";
String password = "123";

System.out.print("Enter your username:");
String enteranceP = input.nextLine();

System.out.print("Enter your password:");
String enteranceU = input.nextLine();

int cho;

if(enteranceP.equals(username) && enteranceU.equals(password)){
     System.out.println("Your access is done");
}else{
    System.out.println("Your informations doesn't match, do you want to enter your informations again/do you want to change your informations? 1/2");
    cho = input.nextInt();
    if(cho==2){
        System.out.println("Enter your username");
        String name = input2.nextLine();
       if(name.equals(username)){
        System.out.println("Enter your new password");
        password = input2.nextLine();
        System.out.println("Enter your username again:");
         enteranceP = input2.nextLine();
    
        System.out.println("Enter your password again:");
         enteranceU = input2.nextLine();

        if(enteranceP.equals(username) && enteranceU.equals(password)){
        System.out.println("Your access is finally done");
        }else{System.out.println("Lan yine yanlış girdin\n");
        System.out.println("Your username was "+username);
        System.out.println("Your password was "+password);
}
}
    }else{
    System.out.println("Enter your username:");
    String entU = input2.nextLine();
    
    System.out.println("Enter your password:");
    String entP = input2.nextLine();

    if(entU.equals(username) && entP.equals(password)){
        System.out.println("Your access is done");
   }else{System.out.println("Your informations doesn't match again, geçmiş olsun hesap gg");
   System.out.println("Your username was "+username);
   System.out.println("Your password was "+password);
}}
}}}





