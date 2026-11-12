package prog6112.q1;

/**
 *
 * @author anphewa
 */


// An interface contains the method headings that a class must implement.
// This name, IProduct, appears in the actual code example in the exam paper.
public interface IProduct {

    // Calculate the total of all values in the two-dimensional array.
    int TotalSales(int[][] productSales);

    // Calculate the average of all the sales values.
    double AverageSales(int[][] productSales);

    // Find the highest individual quarterly sales value.
    int MaxSale(int[][] productSales);

    // Find the lowest individual quarterly sales value.
    int MinSale(int[][] productSales);

} // Ends the IProduct interface.
