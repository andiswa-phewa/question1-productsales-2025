package prog6112.q1;

/**
 *
 * @author anphewa
 */


// This class displays the 2025 product-sales report.
public class ProductSalesApplication {

    // Declare the arrays at class level, outside main() but inside this class.
    // static allows the main() method to access the arrays directly.

    // This one-dimensional array stores the year labels.
    static String[] years = {"YEAR 1", "YEAR 2"};

    // This one-dimensional array stores the quarter headings.
    static String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};

    // Two-dimensional array: rows = years and columns = quarters.
    static int[][] productSales = {
        {300, 150, 700},  // Sales for year 1.
        {250, 200, 600}   // Sales for year 2.
    };

    // The main method is the starting point of the Java application.
    public static void main(String[] args) {

        // Create the class object that will calculate our four results.
        ProductSales salesCalculator = new ProductSales();

        // Use the methods provided by ProductSales to calculate the report.
        int totalSales = salesCalculator.TotalSales(productSales);
        double averageSales = salesCalculator.AverageSales(productSales);
        int maximumSale = salesCalculator.MaxSale(productSales);
        int minimumSale = salesCalculator.MinSale(productSales);

        // Print the report heading and the sales table.
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println();

        // Print the quarter headings from the one-dimensional array.
        System.out.print("\t\t");
        for (int column = 0; column < quarters.length; column++) {
            System.out.print(quarters[column] + "\t");
        } // Ends the heading loop.
        System.out.println();
        System.out.println("------------------------------------------------------------");

        // The outer loop prints each year and the inner loop prints its sales.
        for (int row = 0; row < productSales.length; row++) {
            System.out.print(years[row] + "\t\t");

            for (int column = 0; column < productSales[row].length; column++) {
                System.out.print(productSales[row][column] + "\t\t");
            } // Ends the quarter loop.

            System.out.println();
        } // Ends the year loop.

        System.out.println("------------------------------------------------------------");

        // Display the four required answers.
        System.out.println("Total sales:   " + totalSales);

        // Math.round displays 367, as shown in the sample report.
        // The AverageSales method still returns the correct decimal answer.
        System.out.println("Average sales: " + Math.round(averageSales));

        System.out.println("Maximum sale:  " + maximumSale);
        System.out.println("Minimum sale:  " + minimumSale);
        System.out.println("------------------------------------------------------------");

    } // Ends the main method.

} // Ends the ProductSalesApplication class.
