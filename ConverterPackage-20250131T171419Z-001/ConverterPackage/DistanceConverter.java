package ConverterPackage;
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args){
        System.out.println("MY DISTANCE CONVERTER APPLICATION");
        System.out.println();
        System.out.println("1 Meter to KM");
        System.out.println("2 Miles to KM");
        System.out.println("3 KM to Meter");
        System.out.println("4 KM to Miles");
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Distance Converter");
        int converter=sc.nextInt();
        System.out.println("Enter Distance: ");
        double distance=sc.nextDouble();
        switch (converter){
            case 1: Meter_to_KM(distance);
            break;
            case 2: Miles_to_KM(distance);
            break;
            case 3: KM_to_Meter(distance);
            break;
            case 4: KM_to_Miles(distance);
            break;
            default:
            System.out.println("Invalid Choise");
        }


        }

        public static void Meter_to_KM(double dis){
            System.out.println("1 m = " + 0.001 + " km" );
            System.out.println();
            System.out.println(dis + "m= " + (dis*0.001) + " km");
            System.out.println();
        }
        public static void Miles_to_KM(double dis){
            System.out.println("1 mile = "   + 1.609 + " km");
            System.out.println();
            System.out.println(dis + "miles= " + (dis*1.609) + " km");
            System.out.println();
        }
        public static void KM_to_Meter(double dis){
            System.out.println("1 km = " + 1000 + " m" );
            System.out.println();
            System.out.println(dis + "km= " + (dis*1000) + " m");
            System.out.println();
        }
        public static void KM_to_Miles(double dis){
            System.out.println("1 km = " + 0.6214 + " miles");
            System.out.println();
            System.out.println(dis + "km= " + (dis*0.6214) + " miles");
            System.out.println();
        }


}
