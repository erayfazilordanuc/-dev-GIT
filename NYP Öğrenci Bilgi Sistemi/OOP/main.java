public class main {
    public static void main(String[] args) {
        teacher ertac = new teacher("Ertaç Hoca","Biyo");
        teacher merve = new teacher("Merve Hoca","Mat");
        teacher gamze = new teacher("Gamze Hoca","Kimya");
        teacher ümit = new teacher("Ümit Hoca","Fizik");

        course mat = new course("Matematik Kursu","Mat",merve,9);
        course fizik = new course("Fizik Kursu","Fizik",ümit,8);
        course kimya = new course("Kimya Kursu","Kimya",ertac,7);
        course biyo = new course("Biyoloji Kursu","Biyo",ertac,7);

        student eray = new student("Eray","222",mat,kimya,fizik);

        mat.prinTeacher();
        kimya.prinTeacher();
        fizik.prinTeacher();

        eray.addmatnote(85);
        eray.addkimyanote(90);
        eray.addfiziknote(83);
        eray.addmatsozlunote(83);
        eray.addkimyasozlunote(83);
        eray.addmatsozlunote(83);
        eray.printStuInfo();
         
    }
}
