package prog6112.q1;

/**
 *
 * @author anphewa
 */


// implements requires this class to provide all four methods from IProduct.
public class ProductSales implements IProduct {

    // @Override means the method has been declared in the interface.
    @Override
    public int TotalSales(int[][] productSales) {

        // Begin with a total of zero.
        int total = 0;

        // The outer loop visits each year (each row).
        for (int row = 0; row < productSales.length; row++) {

            // The inner loop visits each quarter in that year.
            for (int column = 0; column < productSales[row].length; column++) {
                total = total + productSales[row][column];
            } // Ends the column loop.

        } // Ends the row loop.

        // Return the combined sales for both years.
        return total;
    } // Ends the TotalSales method.

    @Override
    public double AverageSales(int[][] productSales) {

        // Count the sales values so we can calculate their average.
        int numberOfSales = 0;

        // Count every column in every row, using two ordinary for loops.
        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {
                numberOfSales++;
            } // Ends the column loop.
        } // Ends the row loop.

        // Reuse TotalSales instead of writing the total calculation again.
        int total = TotalSales(productSales);

        // (double) prevents Java from using whole-number division.
        return (double) total / numberOfSales;
    } // Ends the AverageSales method.

    @Override
    public int MaxSale(int[][] productSales) {

        // Assume the first value is the maximum, then compare the rest.
        int maximum = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {

                // Replace the maximum when we find a higher value.
                if (productSales[row][column] > maximum) {
                    maximum = productSales[row][column];
                } // Ends the if statement.

            } // Ends the column loop.
        } // Ends the row loop.

        return maximum;
    } // Ends the MaxSale method.

    @Override
    public int MinSale(int[][] productSales) {

        // Assume the first value is the minimum, then compare the rest.
        int minimum = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {

                // Replace the minimum when we find a lower value.
                if (productSales[row][column] < minimum) {
                    minimum = productSales[row][column];
                } // Ends the if statement.

            } // Ends the column loop.
        } // Ends the row loop.

        return minimum;
    } // Ends the MinSale method.

} // Ends the ProductSales class.
