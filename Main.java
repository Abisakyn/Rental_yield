import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Enter rental Income:");
        int rentalIncome=read.nextInt();
        System.out.println("Enter property value");
        int propertyValue=read.nextInt();
        double annualIncome =(rentalIncome*12);
        double rentalYield = ((annualIncome/propertyValue)*100);
        System.out.println("Rental Yield="+ rentalYield +"%");
    }
        }


    
