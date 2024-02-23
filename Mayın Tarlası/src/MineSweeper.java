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
        String[][] front = new String[this.rowNumber+2][this.colNumber+2];
        for(String[] row : front){
            Arrays.fill(row," - "); 
        }
        for(int l=0;l<front.length-1;l++){//son indexi boş elemanlı yap
            front[l+1][0] = String.valueOf((l+1)+" ");
        }for(int d=0;d<front[0].length;d++){
            if(d==0){
                front[0][d] = String.valueOf("  ");
            }else{
            front[0][d] = String.valueOf(" "+(d)+" ");}
        }
        for(int x=0;x<front.length;x++){
            front[x][front[1].length-1]=" ";
            front[front.length-1][x]=" ";
        }
        
        String[][] back = new String[front.length][front[1].length];

        for(String[] row : back){
            Arrays.fill(row," - "); 
        }
        
        for(int a=0;a<front.length*2;a++){
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

        for(int x=0;x<back.length;x++){
            back[x][back[1].length-1]=" ";
            back[back.length-1][x]=" ";
        }
        
        boolean state = true;

        print(front);

        while(state==true){
        System.out.print("Please enter a row :");
        int row = in.nextInt();
        System.out.print("Please enter a col :");
        int col = in.nextInt();

        front[row][col]=" "+Integer.toString(mine(back,row,col))+" ";

        if(mine(back,row,col)==0){
            for(int x=-1;x<2;x++){
                for(int y=-1;y<2;y++){
                    if(mine(back,row+x,col+y)==0&&front[row+x][col+y]==" - "){
                    front[row+x][col+y]=" "+Integer.toString(mine(back,row+x,col+y))+" ";
                    }}
                }
        }

        if(mine(back,row,col)==-1){
            System.out.println("\nLOSER\n");
            state = false;
            break;
        }

        print(back);
        
        int mines=0;
        for(int a=0;a<back.length;a++){
            for(int b=0;b<back[1].length;b++){
                if(back[a][b] == " * "){
                    mines++;
                }
            }
        }
        int foundmines=0;
        for(int y=1;y<front.length-1;y++){//Oyuncunun kazandığını yazan kod
            for(int u=1;u<front[1].length-1;u++){
                if(front[y][u]!=" - "){
                    foundmines++;
                }
            }
        }

        System.out.println(mines);
        System.out.println(foundmines);

        if(foundmines==mines){
            print(front);
            System.out.println("\nWINNER\n");
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
        int rando = rand.nextInt(c-2)+1;
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
        }else if(array[a][b]==" - "){
            for(int x=-1;x<2;x++){
                for(int y=-1;y<2;y++){
                    if(array[a+x][b+y]==" * "){
                        total++;
                    }
                }
            }
        }
        return total;
    }
}