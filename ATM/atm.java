import java.util.*;

public class atm {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    String username = "eray";
    String password = "eray";
    int right = 3;
    while(right>0){
    long balance = 50000;
    System.out.print("\nKullanıcı adınızı giriniz :");
    String usertry = input.nextLine();
    System.out.print("\nŞifrenizi giriniz :");
    String passtry = input.nextLine();
    if(usertry.equals(username)&&passtry.equals(password)){
        while(true){
        System.out.print("\nYapmak istediğiniz işlemi seçiniz:\n\n1-Bakiye Sorgulama\n2-Para Çekme\n3-Para Yatırma\n4-Çıkış\n\nSeçiminiz :");
        int choice = input.nextInt();
        System.out.println("");
        if(choice==4){
           System.out.println("İyi günler yine bekleriz\n");
           right=0;
           break;
        }
        switch(choice){
           case 1:System.out.println("Bakiyeniz :"+balance+"TL");
           while(true){
           System.out.print("\nYapmak istediğiniz işlemi seçiniz:\n\n1-Ana ekran\n\n2-Çıkış\n\nSeçiminiz :");
           choice = input.nextInt();
           if(choice!=2&&choice!=1){
            System.out.println("\nLütfen geçerli bir değer giriniz");
           }else{break;}}
           if(choice==2){
            System.out.println("\nİyi günler yine bekleriz\n");
            right=0;
           }else{
           break;
           }
           case 2:System.out.print("Çekmek istediğiniz miktarı giriniz :");
           int request = input.nextInt();
           System.out.println("\nYeni bakiyeniz :"+(balance-request)+"TL");
           while(true){
           System.out.print("\nYapmak istediğiniz işlemi seçiniz:\n\n1-Ana ekran\n\n2-Çıkış\n\nSeçiminiz :");
           choice = input.nextInt();
           if(choice!=2&&choice!=1){
            System.out.println("\nLütfen geçerli bir değer giriniz");
           }else{break;}}
           if(choice==2){
            System.out.println("\nİyi günler yine bekleriz\n");
            right=0;
           }else{
           break;
           }
           case 3:System.out.print("Yatırmak istediğiniz miktarı giriniz :");
           int request2 = input.nextInt();
           System.out.println("\nYeni bakiyeniz :"+(balance+request2)+"TL");
           while(true){
           System.out.print("\nYapmak istediğiniz işlemi seçiniz:\n\n1-Ana ekran\n\n2-Çıkış\n\nSeçiminiz :");
           choice = input.nextInt();
           if(choice!=2&&choice!=1){
            System.out.println("\nLütfen geçerli bir değer giriniz");
           }else{break;}}
           if(choice==2){
            System.out.println("\nİyi günler yine bekleriz\n");
            right=0;
           }else{
           break;
           }default:
           System.out.println("Lütfen geçerli bir değer giriniz");
        }}
    }else{
        right--;
        System.out.println("\nBilgiler eşleşmiyor");
        if(right==0){
            System.out.println("Hakkınız tükendi");
        }else{
        System.out.println(right+" hakkınız kaldı");}
    }
    }
    }
}