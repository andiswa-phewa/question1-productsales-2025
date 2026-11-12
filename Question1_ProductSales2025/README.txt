PROG6112 | 2025 EXAM | QUESTION 1 | PRODUCT SALES
=================================================

This is a complete Java with Maven project for Apache NetBeans (JDK 17).
It covers QUESTION 1 ONLY (Q1.1, Q1.2 and Q1.3), not Question 2.

HOW TO OPEN AND RUN IN NETBEANS
1. Extract the ZIP file first.
2. Open Apache NetBeans.
3. Choose File > Open Project.
4. Select the folder Question1_ProductSales2025 (the folder with pom.xml).
5. Set JDK 17 for the project if asked.
6. Right-click the project and choose Run.
   If NetBeans asks for the main class, select prog6112.q1.ProductSalesApplication.
7. Right-click the project and choose Test to run the two unit tests.
   Maven may download JUnit 5 dependencies the first time you test.

WHERE TO FIND THE JAVA FILES
Source Packages > prog6112.q1
  IProduct.java              - Interface from the exam's code example.
  ProductSales.java          - Total, average, maximum and minimum methods.
  ProductSalesApplication.java - Class-level 1D/2D arrays, main method and report.

Test Packages > prog6112.q1
  ProductSalesTest.java      - The two JUnit 5 tests.

HOW EACH FILE MATCHES THE QUESTION
Q1.1 - ProductSalesApplication stores the year/quarter names in 1D arrays,
       stores sales in a 2D array, prints the rows/columns and report.
       All three arrays are declared static at class level, outside main().
Q1.2 - IProduct declares the four required methods. ProductSales implements it.
Q1.3 - ProductSalesTest has the two required named unit tests.

IMPORTANT INTERFACE NAME NOTE
The first sentence of Q1.2 calls the interface IProductSales, but the
actual interface code in the paper and the marking rubric call it IProduct.
This project follows IProduct, the code example and rubric name.

EXPECTED RESULTS
Total sales: 2200
Average sales: 367 (displayed rounded, actual average is 366.666...)
Maximum sale: 700
Minimum sale: 150

The report also prints the two year rows and three quarter columns,
because the marking rubric explicitly assesses rows and columns.

All code uses beginner-friendly for loops, if statements, arrays,
interfaces and descriptive instructional comments.
