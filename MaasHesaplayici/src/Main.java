import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        int salary;
        byte workHours;
        short hireYear;
        Scanner input = new Scanner( System.in );
        System.out.print("Lütfen Çalışanın Adını Giriniz : ");
        name = input.nextLine();
        System.out.print("Lütfen Çalışanın Maaşını Giriniz : ");
        salary = input.nextInt();
        System.out.print("Lütfen Çalışanın Çalışma Saatini Giriniz : ");
        workHours = input.nextByte();
        System.out.print("Lütfen Çalışanın Başlangıç Yılını Giriniz : ");
        hireYear = input.nextShort();
        System.out.println("==================================");

        Employee staff = new Employee(name, salary, workHours,hireYear);
        staff.toStrings();
    }
}
