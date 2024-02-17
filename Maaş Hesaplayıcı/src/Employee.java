public class Employee {

    String name;
    int salary,workHours,hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    int tax(){
    if(this.salary<=1000){
        return 0;
    }else{
        return this.salary*3/100;}
    }

    int bonus(){
    if(this.workHours>40){
        return (this.workHours-40)*30;
    }else{
        return 0;}
    }

    int raiseSalary(){
        int yearsworked = 2024-this.hireYear;
        if(yearsworked<10){
            return this.salary*5/100;
        }
        if(yearsworked>9&&yearsworked<20){
            return this.salary/10;
        }
        if(yearsworked>19){
            return this.salary*3/20;
        }else{
            return 0;
        }

    }

    void tostring(){
        System.out.println(
            "\nÇalışanın ismi : "+this.name+
            "\nÇalışma saati : "+this.workHours+
            "\nMaaşı : "+this.salary+
            "\nİşe alınma yılı : "+this.hireYear+
            "\nVergi miktarı : "+tax()+
            "\nBonus miktarı : "+bonus()+
            "\nZam miktarı : "+raiseSalary()+
            "\nAnlık vergi ve bonuslarla birlikte net maaşı : "+(this.salary+bonus()-tax())+
            "\nZamdan sonraki net maaşı : "+(this.salary+bonus()-tax()+raiseSalary())+"\n"
            );
    }

    
}
