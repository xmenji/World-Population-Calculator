import java.util.Scanner;
/**
 *
 * @author xmenji
 */
public class WorldPopulationCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         long currentPop,
                 oneYear = 0,
                 twoYear = 0,
                 threeYear = 0,
                 fourYear = 0,
                 fiveYear = 0;
         float growthRate;
         
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the current world population: ");
         currentPop = input.nextLong();
         
         System.out.print("Enter the current growth rate (enter percentage): ");
         growthRate = input.nextFloat();
         
         oneYear = (long) ((growthRate / 100) * currentPop) + currentPop;
         twoYear = (long) ((growthRate / 100) * oneYear) + oneYear;
         threeYear = (long) ((growthRate / 100) * twoYear) + twoYear;
         fourYear = (long) ((growthRate / 100) * threeYear) + threeYear;
         fiveYear = (long) ((growthRate / 100) * fourYear) + fourYear;
         
         System.out.println("\nEstimated 5-year World Population");
         System.out.printf("1-year: %d%n2-year: %d%n3-year: %d%n4-year: %d%n5-year: %d%n",
                 oneYear, twoYear, threeYear, fourYear, fiveYear);
         
         
    }
    
}
