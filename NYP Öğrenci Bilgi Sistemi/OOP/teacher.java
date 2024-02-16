public class teacher {
    String name,branch;

    teacher(String name,String branch){
     this.name = name;
     this.branch = branch;  
    }
    void print(){
        System.out.print(" "+this.name);
        System.out.println(" / Branş :"+this.branch+"\n");
    }
}


