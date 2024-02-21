import java.util.*;

public class MineSweeper {

    int rowNumber,colNumber;

    MineSweeper(int r,int c){
        this.rowNumber = r;
        this.colNumber = c;
    }

    void run(){
    int the = 1;
    while(the==1){
        Scanner in = new Scanner(System.in);
        String[][] front = new String[this.rowNumber][this.colNumber];
        for(String[] row : front){
            Arrays.fill(row," - "); 
        }
        for(int l=0;l<front.length-1;l++){
            front[l+1][0] = String.valueOf((l+1)+" ");
        }for(int d=0;d<front[0].length;d++){
            if(d==0){
                front[0][d] = String.valueOf("  ");
            }else{
            front[0][d] = String.valueOf(" "+(d)+" ");}
        }
        String[][] back = new String[front.length][front[1].length];

        // for(int a=0;a<front.length;a++){
        //     for(int b=0;b<front[0].length;b++){    Alternatif dizi kopyalama
        //         back[a][b]=front[a][b];
        //     }
        // }

        for(String[] row : back){
            Arrays.fill(row," - "); 
        }
        
        for(int a=0;a<front.length*1.5;a++){
        back[random(front.length)][random(front[1].length)]=" * ";
        }

        for(int l=0;l<back.length-1;l++){
            back[l+1][0] = String.valueOf((l+1)+" ");
        }for(int d=0;d<back[0].length;d++){
            if(d==0){
                back[0][d] = String.valueOf("  ");
            }else{
            back[0][d] = String.valueOf(" "+(d)+" ");}
        }
        
        boolean state = true;

        print(front);

        while(state==true){
        System.out.print("Please enter a row :");
        int row = in.nextInt();
        System.out.print("Please enter a col :");
        int col = in.nextInt();

        front[row][col]=" "+Integer.toString(mine(back,row,col))+" ";

        if(mine(back,row,col)==-1){
            System.out.println("\nLOSER\n");
            state = false;
            break;
        }

        print(front);

    }print(back);
    
    System.out.println("\nTekrar oynamak istiyorsanız 1\nOynamak istemiyorsanız 0 girebilirsiniz\n");
    int x = in.nextInt();
    switch(x){

        case 1:state=false;
        break;
        case 0:the=0;
        break; 

    }}
    }

    int random(int c){ // c'nin sıfırdan c'ye kadar olan sayılar arasından rastgele sayı üretir.(Sıfır dahil, c değil)
        Random rand = new Random();
        int rando = rand.nextInt(c);
        return rando;
    }

    void print(String[][] array){
        System.out.println(" ");
        for(String[] i:array){
            for(String a:i){
                System.out.print(a);
            }
            System.out.println();
        }System.out.println(" ");
    }

    int mine(String[][] array,int a,int b){

        int total=0;

        if(array[a][b]==" * "){
            return -1;
        }

        if(a==1&&b==1){//sol üst
            if(array[a+1][b+1]==" * "){
            total++;
            }if(array[a][b+1]==" * "){
            total++;
            }if(array[a+1][b]==" * "){
            total++;
            }
        }if(a==1&&b==array[1].length-1){//sağ üst
            if(array[a+1][b]==" * "){
                total++;
            }if(array[a+1][b-1]==" * "){
                total++;
            }if(array[a][b-1]==" * "){
                total++;
            }
        }if(a==array.length-1&&b==1){//sol alt
            if(array[a][b+1]==" * "){
                total++;
            }if(array[a-1][b+1]==" * "){
                total++;
            }if(array[a-1][b]==" * "){
                total++;
            }
        }if(a==array.length-1&&b==array[1].length-1){//sağ alt
            if(array[a][b-1]==" * "){
                total++;
            }if(array[a-1][b-1]==" * "){
                total++;
            }if(array[a-1][b]==" * "){
                total++;
            }
        }if(a==1&&(b!=1&&b!=array[1].length-1)){//üst
            if(array[a][b+1]==" * "){
                total++;
            }if(array[a][b-1]==" * "){
                total++;
            }if(array[a+1][b+1]==" * "){
                total++;
            }if(array[a+1][b-1]==" * "){
                total++;
            }if(array[a+1][b]==" * "){
                total++;
            }
        }if(a==array.length-1&&(b!=1&&b!=array[1].length-1)){//alt
            if(array[a][b+1]==" * "){
                total++;
            }if(array[a][b-1]==" * "){
                total++;
            }if(array[a-1][b+1]==" * "){
                total++;
            }if(array[a-1][b-1]==" * "){
                total++;
            }if(array[a-1][b]==" * "){
                total++;
            }
        }if(b==array.length-1&&(a!=1&&a!=array[1].length-1)){//sağ
            if(array[a-1][b-1]==" * "){
                total++;
            }if(array[a][b-1]==" * "){
                total++;
            }if(array[a-1][b]==" * "){
                total++;
            }if(array[a+1][b-1]==" * "){
                total++;
            }if(array[a+1][b]==" * "){
                total++;
            }
        }if(b==1&&(a!=1&&a!=array[1].length-1)){//sol
            if(array[a+1][b+1]==" * "){
                total++;
            }if(array[a][b+1]==" * "){
                total++;
            }if(array[a-1][b+1]==" * "){
                total++;
            }if(array[a+1][b]==" * "){
                total++;
            }if(array[a-1][b]==" * "){
                total++;
            }
        }if((b!=1&&b!=array[1].length-1)&&(a!=1&&a!=array[1].length-1)){
            if(array[a][b+1]==" * "){

            }if(array[a+1][b+1]==" * "){

            }if(array[a-1][b+1]==" * "){

            }if(array[a][b-1]==" * "){

            }if(array[a-1][b-1]==" * "){

            }if(array[a+1][b-1]==" * "){

            }if(array[a+1][b]==" * "){

            }if(array[a-1][b]==" * "){

            }
        }
        return total;
    }
}
