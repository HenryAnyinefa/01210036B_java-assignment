package ConverterPackage;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("MY TIME CONVERTER APPLICATION");
        System.out.println();
        System.out.println("1 Hours to Minutes");
        System.out.println("2 Hours to Seconds");
        System.out.println("3 Minutes to Hours");
        System.out.println("4 Seconds to Hours");
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Time Converter");
        int converter=sc.nextInt();
        System.out.println("Enter Time: ");
        double time=sc.nextDouble();
        switch (converter) {
            case 1: Hrs_to_Min(time);
                break;
            case 2: Hrs_to_Sec(time);    
                 break;
            case 3: Min_to_Hrs(time);
                 break;
            case 4: Sec_to_hrs(time);
                 break;          
            default:
                System.out.println("Invalid Selection");
        }

    }
    public static void Hrs_to_Min(double tim){
        System.out.println("1hr = " + 60 + "mins");
        System.out.println();
        System.out.println(tim + "hrs = " + (tim*60) + "mins");
        System.out.println();
    }
    public static void Hrs_to_Sec(double tim){
        System.out.println("1hr = " + 120 + "secs");
        System.out.println();
        System.out.println(tim + "hrs = " + (tim*120) + "secs");
        System.out.println();
    }
    public static void Min_to_Hrs(double tim){
        System.out.println("1min = " + 0.0167 + "hrs");
        System.out.println();
        System.out.println(tim + "min = " + (tim*0.0167) + "hrs");
        System.out.println();
    }
    public static void Sec_to_hrs(double tim){
        System.out.println("1sec = " + 0.008333 + "hrs");
        System.out.println();
        System.out.println(tim + "sec = " + (tim*0.00834) + "hrs");
        System.out.println();
    }

}
