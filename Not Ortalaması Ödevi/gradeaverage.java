import java.util.Scanner;

public class gradeaverage{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your Math score");
     int math=input.nextInt();
    if(math<0||math>100){
        System.out.println("Out of range! Please enter a number between 100-0");
     math=input.nextInt();
    }

    System.out.println("Enter your Physics score");
     int physics=input.nextInt();
    if(physics<0||physics>100){
        System.out.println("Out of range! Please enter a number between 100-0");
     physics=input.nextInt();
    }
     
    System.out.println("Enter your Chemics score");
     int chemics=input.nextInt();
    if(chemics<0||chemics>100){
        System.out.println("Out of range! Please enter a number between 100-0");
     chemics=input.nextInt();
    }

    System.out.println("Enter your Turkish score");
     int turkish=input.nextInt();
    if(turkish<0||turkish>100){
        System.out.println("Out of range! Please enter a number between 100-0");
     turkish=input.nextInt();
    }

    System.out.println("Enter your History score");
     int history=input.nextInt();
    if(history<0||history>100){
        System.out.println("Out of range! Please enter a number between 100-0");
     history=input.nextInt();
    }

    System.out.println("Enter your Music score");
     int music=input.nextInt();
    if(music<0||music>100){
        System.out.println("Out of range! Please enter a number between 100-0");
     music=input.nextInt();
    }
    
    double ratio=(math+music+history+turkish+physics+chemics)/6;

    System.out.println(ratio);

    if(ratio<60){
        System.out.println("Can't passed");
    }
    if(ratio>60){
        System.out.println("Passed");
    }
    }
}