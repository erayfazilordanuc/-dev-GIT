import java.util.*;

public class notortalama {
    public static void main(String[] n){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your math score");
    int math = input.nextInt();
    if(math<0||math>100){
        System.out.println("Please enter a score between 0-100");
        math = input.nextInt();
    }
    System.out.println("Enter your physics score");
    int physics = input.nextInt();
    if(physics<0||physics>100){
        System.out.println("Please enter a score between 0-100");
        physics = input.nextInt();
    }
    System.out.println("Enter your turkish score");
    int turkish = input.nextInt();
    if(turkish<0||turkish>100){
        System.out.println("Please enter a score between 0-100");
        turkish = input.nextInt();
    }
    System.out.println("Enter your chemical score");
    int chemical = input.nextInt();
    if(chemical<0||chemical>100){
        System.out.println("Please enter a score between 0-100");
        chemical = input.nextInt();
    }
    System.out.println("Enter your music score");
    int music = input.nextInt();
    if(music<0||music>100){
        System.out.println("Please enter a score between 0-100");
        music = input.nextInt();
    }

    double ratio = (math+music+turkish+chemical+physics)/5;

    System.out.println("Your average is "+ratio);

    if(ratio>=55){
        System.out.println("You passed");
    }else{
        System.out.println("You can't passed");
    }
}}