public class nearest {
    
    static long expo(long a,long b){

        long cons=1;
        if(a==0||b==0){
            cons=1;}else{
        for(;b>0;b--)
            cons*=a;}
        return cons;}

    static void nearest(int[] array,int x){
        long sgap=expo(2,63)-1;
        int small=0;
        long bgap=expo(2,63)-1;
        int big=0;
        for(int a=0;a<array.length;a++){
            if((x-array[a])<0){
            if(array[a]-x<bgap){
            bgap=array[a]-x;
            big=array[a];}
            }else if((x-array[a])>0){
            if(x-array[a]<sgap){
            sgap=x-array[a];
            small=array[a];}
            }
    }for(int i:array){
        System.out.print(i+" ");}
    System.out.println("\nGirilen sayı :"+x);
    System.out.println("En yakın büyük sayı :"+big);
    System.out.println("En yakın küçük sayı :"+small);

    }
}
