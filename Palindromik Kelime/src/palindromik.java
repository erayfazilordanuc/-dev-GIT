import java.util.Scanner;

public class palindromik {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("\nBir kelime giriniz :");
        String inp = input.nextLine();
        palindromik(reverstring(inp));

    }

    static void palindromik(String a){
        if(a.equals(reverstring(a))){
            System.out.println("\nBu bir palindromik kelime\n");
        }else{
            System.out.println("\nBu bir palindromik kelime değil\n");
        }
    }

    static String reverstring(String a){
        String reverse="";
        int sayac=0;
        for(int b=a.length()-1;b>=0;b--){
            reverse+=a.charAt(b);
        }
        return reverse;}

}
