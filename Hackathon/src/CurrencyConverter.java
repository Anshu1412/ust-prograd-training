
public class CurrencyConverter {

    public static double INRToUSD(double currencyInRupees) {
        return currencyInRupees /74.85;
    }
    public double USDToINR(double currencyInUSD){
        return currencyInUSD *74.85;
    }
    public double INRToAUD(double currencyInINR){
        return currencyInINR *54.04;
    }
    public double AUDToINR(double currencyInAUD){
        return currencyInAUD /54.04;
    }
    public double INRToCAD(double currencyInINR){
        return currencyInINR *59.18;
    }
    public double CADToINR(double currencyInCAD){
        return currencyInCAD/59.18;
    }
}