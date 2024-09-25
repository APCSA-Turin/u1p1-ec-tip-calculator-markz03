/*
I learned how to round with this website: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
I learned how to use ! to negate equals -> not equal https://stackoverflow.com/questions/16995809/opposite-of-java-equals-method,
 */

package com.example.project;
import java.util.Scanner;

public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        // variables
        double totalTip = (cost * percent) /100.00;
        double totalBillWithTip = cost + totalTip;
        double personCost = cost / people;
        double personTipCost = totalTip / people;
        double totalCostPerPerson = totalBillWithTip / people;

        // append (output)
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + Math.round(cost*100) / 100.00 + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + Math.round(totalTip * 100) / 100.00  + "\n");
        result.append("Total Bill with tip: $" + Math.round(totalBillWithTip * 100) / 100.00 + "\n");
        result.append("Per person cost before tip: $" + Math.round(personCost * 100) / 100.00 + "\n");
        result.append("Tip per person: $" + Math.round(personTipCost * 100) / 100.00 + "\n");
        result.append("Total cost per person: $" + Math.round(totalCostPerPerson * 100) / 100.00 + "\n");
        result.append("-------------------------------\n");

        // items ordered
        result.append("Items ordered:\n");
        result.append(items);

        return result.toString();
    }
                                   
    public static void main(String[] args) {
        // declare and initialize variables (parameters)
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String itemsOrdered = "";
        String items = ""; 

        // Scanner object and while loop for items ordered
        Scanner scan = new Scanner(System.in);

        while (!itemsOrdered.equals("-1")) { // runs while user input isn't -1
            System.out.print("Enter an item name or type '-1' to finish: ");
            itemsOrdered = scan.nextLine();

            if (!itemsOrdered.equals("-1")) { // runs if user input isn't -1, so the items string won't end with -1
                items += "\n" + itemsOrdered + "\n";
            }
        }
        scan.close();

        System.out.println(calculateTip(people,percent,cost,items));
    }
}
