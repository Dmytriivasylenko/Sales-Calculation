
// SALES_CALCULATION
public class Main {

    static String productName;
    static double totalSales;
    static double dailySales;
    private final static String CURRENCY = "USD";


    public static void main(String[] args) {

        //product n.1
        productName = "smartphone";
        //продажі
        int product1 = 80;
        double productPrice1 = 150.50;
        int productDays1 = 5;

        // Розрахунок

         totalSales = product1 * productPrice1;
         dailySales = totalSales / productDays1;

        // Виведення через printf().
        // %n - перенесення на інший рядок.
        // %s - String значення.
        // %.2f - float/double значення з округленням
        // до двох знаків після десяткового роздільника.

        System.out.printf("Product No 1: %s,%ntotal sales for 5 days is %s %.2f,%nsales by day is %s %.2f.%n",
                productName, CURRENCY, totalSales, CURRENCY, dailySales);

        //product n.2

        productName = "laptop";
        //продажі
        int product2 = 20;
        double productPrice2 = 934.65;
        int productDays2 = 7;

        // Розрахунок

        totalSales = product2 * productPrice2;
        dailySales = totalSales / productDays2;

        // Виведення через printf().
        // %n - перенесення на інший рядок.
        // %s - String значення.
        // %.2f - float/double значення з округленням
        // до двох знаків після десяткового роздільника.

        System.out.printf("Product No 2: %s,%ntotal sales for 7 days is %s %.2f,%nsales by day is %s %.2f.%n",
                productName, CURRENCY, totalSales, CURRENCY, dailySales);




    }
}
