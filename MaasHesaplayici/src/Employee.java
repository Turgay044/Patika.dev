public class Employee {
    String name;
    int salary;
    byte workHours;
    short hireYear;

    Employee (String name, int salary, byte workHours, short hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax;
        if (this.salary<1000)
            return this.salary;
        else{
            tax = this.salary * 0.03;
            return tax;
        }
    }

    public int bonus(){
        if (this.workHours > 40)
            return (workHours-40) * 30;
        else
            return 0;
    }

    public double raiseSalary(){
        double raiseSalary;
        if ((2021-this.hireYear)<10){
            raiseSalary = this.salary * 0.05;
            return raiseSalary;
        }
        else if ((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
            raiseSalary = this.salary * 0.1;
            return raiseSalary;
        }
        else{
            raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }
    }

    public void toStrings(){
        System.out.println("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHours + "\nBaşlangıç Yılı : "
                            + this.hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaaş Artışı : " + raiseSalary()
                            + "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary+bonus()-tax()) + "\nToplam Maaş : " + (salary+raiseSalary()));
    }
}
