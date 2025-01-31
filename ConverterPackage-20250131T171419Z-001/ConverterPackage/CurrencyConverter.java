package ConverterPackage;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args){
        System.out.println("My Converter Application");
        System.out.println("1 Dollar to Cedi");
        System.out.println("2 Euro to Cedi");
        System.out.println("3 Yen to Cedi");
        System.out.println("4 Cedi to Others");
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Currency Conerter: ");
        int currency=sc.nextInt();
        System.out.println("Enter Amount: ");
        double amount=sc.nextDouble();
        switch (currency){
            case 1: Dollar_to_Cedis(amount);
            break;
            case 2: Euro_to_Cedis(amount);
            break;
            case 3: Yen_to_Cedis(amount);
            break;
            case 4: Cedi_to_Others(amount);
            break;
            default:
            System.out.println("Invalid choice");

            
        }

    }
    public static void Dollar_to_Cedis(double amt){
        System.out.println("$1=  " + 14.88 + "Cedis");
        System.out.println();
        System.out.println("$" + amt + "= " + (amt*14.88) + "Cedis");

    }
    public static void Euro_to_Cedis(double amt){
        System.out.println("£1=  " + 15.33 + "Cedis");
        System.out.println();
        System.out.println("£" + amt + "= " + (amt*15.33) + "Cedis");

    }
    public static void Yen_to_Cedis(double amt){
        System.out.println("¥1=  " + 0.096 + "Cedis");
        System.out.println();
        System.out.println("¥" + amt + "=  " + (amt*0.096) + "Cedis");

    }
    public static void Cedi_to_Others(double amt){
        System.out.println("C1= " + 10.47 + "Yen");
        System.out.println();
        System.out.println("C" + amt + "= " + (amt*10.47) + "Yen");
        System.out.println();

        System.out.println("C1= " + 0.065 + "Euro");
        System.out.println();
        System.out.println("C" + amt + "= " + (amt*0.065) + "Euros");
        System.out.println();

        System.out.println("C1= " + 0.067 + "Dollar");
        System.out.println();
        System.out.println("C" + amt + "= " + (amt*0.067) + "Dollars");
        System.out.println();
    }
}
