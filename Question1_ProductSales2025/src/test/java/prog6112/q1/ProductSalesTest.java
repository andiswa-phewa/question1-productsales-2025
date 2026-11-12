package prog6112.q1;

// JUnit 5 allows us to check that the methods return the correct answers.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// This test class belongs in the Maven Test Packages folder.
public class ProductSalesTest {

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        // Arrange: prepare the supplied 2D sales array.
        ProductSales productSalesCalculator = new ProductSales();
        int[][] productSales = {{300, 150, 700}, {250, 200, 600}};
        int expected = 2200;

        // Act: calculate the total using the ProductSales class.
        int actual = productSalesCalculator.TotalSales(productSales);

        // Assert: the total should be 2200.
        assertEquals(expected, actual);

    } // Ends the first test.

    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        // Arrange: six quarterly sales values across two years.
        ProductSales productSalesCalculator = new ProductSales();
        int[][] productSales = {{300, 150, 700}, {250, 200, 600}};
        double expected = 2200.0 / 6;

        // Act: the method returns a double, not a rounded whole number.
        double actual = productSalesCalculator.AverageSales(productSales);

        // Assert: 0.001 is the allowed difference for decimal results.
        assertEquals(expected, actual, 0.001);

    } // Ends the second test.

} // Ends the ProductSalesTest class.
