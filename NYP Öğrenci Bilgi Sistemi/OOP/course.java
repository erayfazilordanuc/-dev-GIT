public class course {
    
    String name;
    String prefix;
    int impact;
    teacher Teacher;

    course(String name,String prefix,teacher Teacher,int impact){
        this.name = name;
        this.impact = impact;
        this.prefix = prefix;
        if(Teacher.branch.equals(this.prefix)){
            this.Teacher = Teacher;
        }else{System.out.println( "\n"+Teacher.name+", "+this.name+"na uygun değil");}
    }
    void prinTeacher(){
        if(Teacher != null){
        System.out.print("\n"+name+"nun öğretmeni :");this.Teacher.print();}else{
            System.out.println(this.name+"na bir öğretmen atanmamış");
        }
    }
}
