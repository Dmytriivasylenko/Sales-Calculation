
// SALES_CALCULATION
public class Main {

    static String productName;
    static double totalSales;
    static double dailySales;
    private final static String CURRENCY = "USD";


    public static void main(String[] args) {

        //product n.1
        productName = "smartphone";
        totalSales = 11345.34;
        dailySales = 3500.00;

        // Розрахунок

         totalSales = totalSales * dailySales;
         dailySales = totalSales / dailySales;

        // Виведення через printf().
        // %n - перенесення на інший рядок.
        // %s - String значення.
        // %.2f - float/double значення з округленням
        // до двох знаків після десяткового роздільника.

        System.out.printf("Product No 1: %s,%ntotal sales for 5 days is %s %.2f,%nsales by day is %s %.2f.%n",
                productName, CURRENCY, totalSales, CURRENCY, dailySales);

        //product n.2

        productName = "laptop";
        totalSales = 10486.85;
        dailySales = 1498.12;

        // Розрахунок

        totalSales = totalSales * dailySales;
        dailySales = totalSales / dailySales;

        // Виведення через printf().
        // %n - перенесення на інший рядок.
        // %s - String значення.
        // %.2f - float/double значення з округленням
        // до двох знаків після десяткового роздільника.

        System.out.printf("Product No 2: %s,%ntotal sales for 14 days is %s %.2f,%nsales by day is %s %.2f.%n",
                productName, CURRENCY, totalSales, CURRENCY, dailySales);




    }
}
