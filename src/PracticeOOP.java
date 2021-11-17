import java.util.*;
public class PracticeOOP {


                             //     Trip Cost Calculator
             // This program will tell you amount you need for fuel of Vehicle, for where you want to go.
                //  Requirement : Milage of vehicle and cost of fuel per unit must be known .


    /*
    public static void TripCost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Distance covered : ");
        float distance = input.nextFloat();
        System.out.println(distance+" KM");
        System.out.print("Fuel Price : ");
        float fuel$ = input.nextFloat();
        System.out.println(fuel$+" PKR/L");
        System.out.print("Milage : ");
        float milage = input.nextFloat();
        System.out.println(milage+" KM/L");

        float tripCost = (distance/milage)*fuel$;


        System.out.println("Trip Cost : "+tripCost+" PKR");

    }

 */

                    // Body Mass Index finder


  /*
   public static void BMI(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight in pounds : ");
        float weight = input.nextFloat();
        System.out.println(weight+" Ponuds");
        System.out.print("Enter Height in inches : ");
        float height = input.nextFloat();
        System.out.println(height+" Inch");
        float heightSquared = height*height;

        float bmi=weight/heightSquared;
        System.out.println("Body Mass Index : "+bmi);
        float bmiMetric = bmi*703;

        System.out.println("Body Mass Index Metric : "+bmiMetric);


    }
*/


                  // distance covered per limited fuel


  /*


    public static void limitedFuel() {

        Scanner input = new Scanner(System.in);

        System.out.print("Amount you have : ");
        float amount = input.nextFloat();
        System.out.println(amount+" PKR");
        System.out.print("Price of fuel per Liter : ");
        float fuel_price_Per_Liter = input.nextFloat();
        System.out.println(fuel_price_Per_Liter+" PKR");
        System.out.print("Milage of Vehicle : ");
        float milage = input.nextFloat();
        System.out.println(milage+" KM/L");

        float litersInAmount =amount/fuel_price_Per_Liter;
        System.out.println("Liters we can buy : "+litersInAmount);

        float driveDistance = litersInAmount*milage;
        System.out.println("Distance, Vehicle cam travel is : "+driveDistance);

    }
*/
               // Percentage Off On Product ;

    /*
    public static void Sell(){
        Scanner input = new Scanner(System.in);
         float offSell;
         float offCard;
        System.out.print("Amount of prouct : ");
        float price = input.nextFloat();


        System.out.print("Sell percentage off : ");
        offSell = input.nextFloat();

        System.out.println();

        System.out.println(offSell+" % off on product");
        float offPercentagePrice = (offSell/100)*price;
        System.out.println("Sell percentage off price  : "+offPercentagePrice);
        float recentPriceSell = (price-offPercentagePrice);
        System.out.println("Recent Price : "+recentPriceSell);

        System.out.println();

        System.out.print("Card percentage off : ");
        offCard = input.nextFloat();

        System.out.println();

        System.out.println(offCard+" % off on product");
        float percentageOffcard = (offCard/100)*recentPriceSell;
        System.out.println("Card off Price : "+percentageOffcard);
        float recentPriceCard = recentPriceSell-percentageOffcard;
        System.out.println("Recent Price is : "+recentPriceCard);



    }
        */
    public static void main(String[] args) {

       // TripCost();

          //  BMI();

            // limitedFuel();

              //  Sell();




    }
}
