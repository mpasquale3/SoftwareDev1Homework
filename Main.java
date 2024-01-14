//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double computeIncome(double salesAmount)
    {
        double salary = 5000; //base salary

        if (salesAmount <= 5000)
        {
            salary = salary + salesAmount * 0.08;
            salesAmount = 0;
        }
        else // +/- base salary
        {
            salary = salary + 5000 * 0.08;
            salesAmount = salesAmount - 5000;
        }

        if (salesAmount > 0 && salesAmount <= 5000)
        {
            salary = salary + salesAmount * 0.10;
            salesAmount = 0;
        }
        else if (salesAmount > 0) // +/- base salary
        {
            salary = salary + 5000 * 0.10;
            salesAmount = salesAmount - 5000;
        }

        if (salesAmount > 0)
        {
            salary = salary + salesAmount * 0.12;
        }

        return salary;//needs to be outside the if statement otherwise errors occur with needing doubles.
    }


    public static void main(String[] args) {

        System.out.printf("%10s%15s\n", "   Sales $ ", "Salary $ "); //column creation

        for (int sales = 1000; sales <= 20000; sales += 1000) //start at $1,000, go up to $20,000
        {
            System.out.printf("%10d%15.2f\n", sales, computeIncome(sales));//data from if/else. .2 for decimal points.
        }


    }
}