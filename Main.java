import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int rentalIncome=read.nextInt();
        int propertyValue=read.nextInt();
        double annualIncome =(rentalIncome*12);
        double rentalYield = ((annualIncome/propertyValue)*100);
        System.out.println(annualIncome);
        System.out.println(rentalYield +"%");
    }
        }


    
