import java.util.*;

public class calculator {
    public static long expo(long a,long b){
        long cons=1;
        if(a==0||b==0){
            cons=1;}else{
        for(;b>0;b--)
            cons*=a;}
        return cons;
    }
    static long fact(long x){
        long value=1;
        for(;x>0;x--){
          value*=x;
        }return value;
    }
    static long mod(long x,long y){
        return x%y;
    }
    public static void main(String[] argh){
    
    Scanner input = new Scanner(System.in);    
    System.out.print("\nYapmak istediğiniz işlemi seçiniz:\n\n1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n5- Üslü Sayı Hesaplama\n6- Faktöriyel Hesaplama\n7- Mod Alma\n8- Alan ve Çevre Hesabı\n\nSeçiminiz :");
    int choice = input.nextInt();
    switch(choice){
        case 1:System.out.println("\nİşlem yapmak istediğiniz sayıları giriniz:");
        int a = input.nextInt();System.out.println("+");int b = input.nextInt();System.out.println("= "+(a+b)+"\n");
        break;
        case 2:System.out.println("\nİşlem yapmak istediğiniz sayıları giriniz:");
        a = input.nextInt();System.out.println("-");b = input.nextInt();System.out.println("= "+(a-b)+"\n");
        break;
        case 3:System.out.println("\nİşlem yapmak istediğiniz sayıları giriniz:");
        a = input.nextInt();System.out.println("x");b = input.nextInt();System.out.println("= "+(a*b)+"\n");
        break;
        case 4:System.out.println("\nİşlem yapmak istediğiniz sayıları giriniz:");
        a = input.nextInt();System.out.println("÷");b = input.nextInt();System.out.println("= "+(a/b)+"\n");
        break;
        case 5:System.out.print("\nÜssünü almak istediğiniz sayıyı giriniz :");
        a = input.nextInt();System.out.print("Üs değerini giriniz :");b = input.nextInt();System.out.println("\n"+a+" üzeri "+b+" = "+expo(a,b)+"\n");
        break;
        case 6:System.out.print("\nFaktöriyelini almak istediğiniz sayıyı giriniz :");
        a = input.nextInt();System.out.println("\n"+a+"! = "+fact(a)+"\n");
        break;
        case 7:System.out.println("\nİşlem yapmak istediğiniz sayıları giriniz:");
        a = input.nextInt();System.out.println("÷");b = input.nextInt();System.out.println(a+" sayısının "+b+" sayısına bölümünden kalan = "+(a%b)+"\n");
        break;
        case 8:System.out.print("\nİşlem yapmak istediğiniz şekli seçiniz:\n1- Üçgen\n2- Dikdörtgen\n3- Daire\n\nSeçiminiz :");
        a = input.nextInt();
        switch(a){
            case 1:System.out.print("\nÜçgen Alan Hesabı\n\nÜçgenin taban kenar uzunluğu :");b=input.nextInt();
                   System.out.print("\nÜçgenin yüksekliği :");int i=input.nextInt();
            System.out.println("\nÜçgenin alanı = "+(b*i)/2+"\n");
            break;
            case 2:System.out.print("\nDikdörtgenin uzun kenarı :");int u=input.nextInt();
                   System.out.print("Dikdörtgenin kısa kenarı :");int k=input.nextInt();
            System.out.println("\nDikdörtgenin alanı = "+u*k+"\nDikdörtgenin çevresi = "+2*(u+k)+"\n");
            break;
            case 3:System.out.print("\nDairenin yarıçapı :");int r=input.nextInt();
            System.out.println("\nDairenin alanı = "+3.14*r*r+"\nDairenin çevresi = "+2*3.14*r+"\n");
            break;
        }
        break;
    }
    }
}
