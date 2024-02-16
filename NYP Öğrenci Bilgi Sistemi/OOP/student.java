public class student {
    String name,stuno,state;
    course c1;
    course c2;
    course c3;
    int matnote,kimyanote,fiziknote,matsozlunote,fiziksozlunote,kimyasozlunote;
    double average;

    student(String name,String stuno,course c1,course c2,course c3){
     this.name = name;
     this.c1 = c1;
     this.c2 = c2;
     this.c3 = c3;
     this.stuno = stuno;
     this.average = 0.0;
    }
    void printStuInfo(){
        System.out.println("İsim :"+this.name);
        System.out.println("No :"+this.stuno);
        System.out.println("Kurs 1 :"+this.c1.name+" / Not :"+this.matnote+" / Sözlü Not :"+matsozlunote);
        System.out.println("Kurs 2 :"+this.c2.name+" / Not :"+this.kimyanote+" / Sözlü Not :"+kimyasozlunote);
        System.out.println("Kurs 3 :"+this.c3.name+" / Not :"+this.fiziknote+" / Sözlü Not :"+fiziksozlunote+"");
        pass();
    }
    void addmatnote(int x){
        if(x>=0&&x<=100){
      this.matnote = x;}else{
        System.out.println("\nGirilen not geçersiz\n");
        this.matnote = 0;
      }
    }
    void addkimyanote(int x){
        if(x>=0&&x<=100){
      this.kimyanote = x;}else{
        System.out.println("\nGirilen not geçersiz\n");
        this.kimyanote = 0;
      }
    }
    void addfiziknote(int x){
        if(x>=0&&x<=100){
      this.fiziknote = x;}else{
        System.out.println("\nGirilen not geçersiz\n");
        this.fiziknote = 0;
      }
    }
    void addmatsozlunote(int x){
        if(x>=0&&x<=100){
      this.matsozlunote = x;}else{
        System.out.println("\nGirilen not geçersiz\n");
        this.matsozlunote = 0;
      }
    }
    void addkimyasozlunote(int x){
        if(x>=0&&x<=100){
      this.kimyasozlunote = x;}else{
        System.out.println("\nGirilen not geçersiz\n");
        this.kimyasozlunote = 0;
      }
    }
    void addfiziksozlunote(int x){
        if(x>=0&&x<=100){
      this.fiziksozlunote = x;}else{
        System.out.println("\nGirilen not geçersiz\n");
        this.fiziksozlunote = 0;
      }
    }
    void pass(){
      float average = ((fiziknote*0.8f+fiziksozlunote*0.2f)+(kimyanote*0.8f+kimyasozlunote*0.2f)+(matnote*0.8f+matsozlunote*0.2f))/3;
      if(average>=55){
        System.out.println("Durumu :Geçti\n");
      }else{System.out.println("Durumu :Kaldı\n");}
    }
}
