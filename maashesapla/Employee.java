package MaasHesaplama;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name= name;
        this.salary= salary;
        this.workHours= workHours;
        this.hireYear=hireYear;}



    double tax(double salary){
        this.salary=salary;
        double result=0;
        if(salary>1000){result=(salary*0.03);}
        else {result=0;}
        return result;
    }

    double bonus(int workHours){
        this.workHours=workHours;
        double result=0;
        if(workHours>40){
            result=(workHours-40)*30;
        }return result;

    }

    double raiseSalary(double salary,int hireYear){
        this.salary= salary;
        this.hireYear=hireYear;
        double result=0;
        if((2021-hireYear)<10){
            result=salary*0.05;
        }
        else if((2021-hireYear)>9 && (2021-hireYear)<20){
            result=salary*0.10;
        }
        else {result=salary*0.15;}
        return result;
    }

    void toStringg(){

        this.name= name;
        this.salary= salary;
        this.workHours= workHours;
        this.hireYear=hireYear;


        System.out.println("adı :"+name );
        System.out.println("Maaşı :"+salary);
        System.out.println("Çalışma Saati :"+workHours );
        System.out.println("Başlangıç Yılı :"+ hireYear);
        System.out.println("Vergi :"+ this.tax(salary));
        System.out.println("Bonus :"+this.bonus(workHours));
        System.out.println("Maaş Artışı :"+ this.raiseSalary(salary,hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+ (salary +this.bonus(workHours)-(this.tax(salary))));
        System.out.println("Toplam Maaş :"+ (this.raiseSalary(salary,hireYear)+salary +this.bonus(workHours) -(this.tax(salary))) );


    }


}
