public class employee {

    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(){
        int vergi=0;
        if(this.salary<1000){
            vergi=0;
        }
        if(this.salary>1000){
            vergi=(this.salary*3)/100;
        }
        System.out.println("vergi:"+vergi);

        return vergi;
    }

    public int bonus(){
        int bonus=0;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
        }
        System.out.println("bonus:"+bonus);
        return bonus;
    }

    public int raiseSalary(){
        int maasArtisi=0;
        int yearsofwork=2021-this.hireYear;
        if(yearsofwork<10){
            maasArtisi=(this.salary*5)/100;
        }
        if(yearsofwork>9 && yearsofwork<20){
            maasArtisi=(this.salary*10)/100;
        }
        if(yearsofwork>19){
            maasArtisi=(this.salary*15)/100;
        }
        System.out.println("maas atrışı:"+maasArtisi);
        return maasArtisi;
    }
}
