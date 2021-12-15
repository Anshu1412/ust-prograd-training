
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Currency {
    public static void main(String[] args) throws IOException {

        CurrencyConverter currencyConverter = new CurrencyConverter();
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Program Started...");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nCURRENCY CONVERTER CONSOLE");
            System.out.println("1.INR To USD");
            System.out.println("2.USD To INR");
            System.out.println("3.INR To AUD");
            System.out.println("4.AUD To INR");
            System.out.println("5.INR To CAD");
            System.out.println("6.CAD To INR");
            System.out.println("7.Exit");
            System.out.println("Enter your choice:");
            double choice = sc.nextDouble();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter Amount in INR");
                double amountInRupees = sc.nextDouble();
                logger.info("User selected to convert INR to USD " + amountInRupees);
                if (amountInRupees < 0) {
                    throw new IllegalArgumentException("Amount cannot be Negative");
                } else
                    System.out.printf("Amount in Dollars %.2f $", CurrencyConverter.INRToUSD(amountInRupees));
            }
            if (choice == 2) {
                System.out.println("Enter Amount in USD");
                double amountInUSD = sc.nextInt();
                logger.info("User selected to convert USD to INR " + amountInUSD);
                if (amountInUSD < 0) {
                    throw new IllegalArgumentException("Amount cannot be Negative");
                } else
                    System.out.printf("Amount in Rupees %.2f Rs", currencyConverter.USDToINR(amountInUSD));
            }
            if (choice == 3) {
                System.out.println("Enter Amount in INR to convert it to AUD");
                double amountInINR = sc.nextInt();
                logger.info("User selected to convert INR to USD " + amountInINR);
                if (amountInINR < 0)
                    throw new IllegalArgumentException("Amount cannot be Negative");
                else
                    System.out.printf("Amount in AustralianDollar %.2f AUD", currencyConverter.INRToAUD(amountInINR));
            }
            if (choice == 4) {
                System.out.println("Enter Amount in AUD");
                double amountInAUD = sc.nextInt();
                logger.info("User selected to convert AUD To INR " + amountInAUD);
                if (amountInAUD < 0)
                    throw new IllegalArgumentException("Amount cannot be negative");
                else
                    System.out.printf("Amount in Rupees %.2f Rs", currencyConverter.AUDToINR(amountInAUD));
            }
            if (choice == 5) {
                System.out.println("Enter Amount in INR to convert it to CAD");
                double amountInINR = sc.nextInt();
                logger.info("User selected to convert INR to AUD " + amountInINR);
                if (amountInINR < 0)
                    throw new IllegalArgumentException("Amount cannot be negative");
                else
                    System.out.printf("Amount in CanadianDollar %.2f CAD", currencyConverter.INRToCAD(amountInINR));
            }
            if (choice == 6) {
                System.out.println("Enter Amount in CAD");
                double amountInCAD = sc.nextInt();
                logger.info("User selected to convert to convert CAD to INR " + amountInCAD);
                if (amountInCAD < 0)

                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                else
                    System.out.printf("Amount in Rupees %.2f RS", currencyConverter.CADToINR(amountInCAD));
            } else if (choice == 7) {
                System.out.println("THANK YOU FOR VISITING ");
            }
            logger.info("Program stopped ...");
        }
    }
}