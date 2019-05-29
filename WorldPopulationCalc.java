
package worldpopulationcalc;

import java.time.Year;
/**
 *
 * @author Titan
 */

public class WorldPopulationCalc {

//Cosntants needed
public static final long CURRENT_POPULATION = 7707226067L;
public static final double GROWTH_RATE = 1.07;
public static final int CURRENT_YEAR = Year.now().getValue();
    
    public static void main(String[] args) {
        
         long currentPopulation = CURRENT_POPULATION;
         long previousPopulation = CURRENT_POPULATION;
         int year = CURRENT_YEAR;
         
         //Predict the population for the next 75 years
         System.out.println("\tProjected 75-year World Population\n");
         for (int i = 0; i <= 75; i++){      
             //Get the current year's population
             currentPopulation = (long) ( (GROWTH_RATE / 100 ) * currentPopulation) + currentPopulation;
             
             //Print out the current year, current population, and difference between
             //the population of the current year versus the previous year
             System.out.printf("Year: %d | Population: %d | Inscrease: +%d%n",
                     year++, currentPopulation, currentPopulation - previousPopulation);
             
             //Set current population number to the previous and restart loop
             previousPopulation = currentPopulation;
         }     
         
    }
    
}
