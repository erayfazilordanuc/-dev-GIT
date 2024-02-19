import java.util.Scanner;

public class estimatenumber {
    public static void main(String[] args) {
        double a = Math.random()*100;
        int keep = (int) a;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tahmin yapın");
        int guess = input.nextInt();
        int sayac=1;
        while(guess!=keep){
        if(guess>keep){
            System.out.print("Daha küçük bir sayı girin");
            guess = input.nextInt();
        }else{System.out.print("Daha büyük bir sayı girin");
        guess = input.nextInt();
    }sayac++;
    }System.out.println("Sayıyı buldunuz! Tahmin sayınız :"+sayac);
    }
}
